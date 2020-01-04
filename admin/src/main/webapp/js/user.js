$(function () {
    var page = 1;
    var rows = 10;
    $.ajax({
        type: "get",
        url: "/login/findAll.do?page="+page+"&rows="+rows ,
        success: function (result) {
            var userList = result.rows;
            // alert(userList.length);
            for (var i = 0; i < userList.length; i++) {
                var userId = userList[i].userId;
                var nowDate = new Date();
                var userBir = (userList[i].userBirthday).toString();
                var year = userBir.substring(0,4);
                var userage = nowDate.getFullYear() - year;
                var userStatusName = "";
                var userStatus = "";
                if (userList[i].userStatus == 1) {
                    userStatusName = "启用";
                    userStatus = 0;
                } else {
                    userStatusName = "禁用";
                    userStatus = 1;
                }
                $("#userDate").append(
                    "<tr>" +
                    "<td>" + userList[i].userId + "</td>" +
                    "<td>" + userList[i].userName + "</td>" +
                    "<td>" + userList[i].userNickname + "</td>" +
                    "<td>" + userage + "</td>" +
                    "<td>" + userList[i].userBirthday + "</td>" +
                    "<td>" + userList[i].userMobileNum + "</td>" +
                    "<td>" + userList[i].userEmail + "</td>" +
                    "<td>" + userList[i].userPhoto + "</td>" +
                    "<td>" + userList[i].userRetistrationTime + "</td>" +
                    "<td>" + userList[i].userDesc + "</td>" +
                    "<td><a onclick='userStatusOperation(\"" + userId + "\", \"" + userStatus + "\")'>" + userStatusName + "</td>" +
                    "<td><a onclick='operation(\"" + userId + "\")'>编辑&nbsp;&nbsp; </a><a onclick='deleteUser(\"" + userId +"\")'><i> &nbsp;&nbsp;删除</i></a></td>" +
                    "</tr>"
                );
            }
        }
    });
});

function userStatusOperation(userId, userStatus) {
    var userStatusName = "";
    if (userStatus == 1) {
        userStatusName = "启用";
    } else {
        userStatusName = "禁用";
    }
    if (confirm("确定要" + userStatusName +"这个用户么？")) {
        $.ajax({
            type: "post",
            url: "/login/changeUserStatus.do",
            data: {"userId": userId, "userStatus": userStatus},
            success: function(result) {
                alert(result.message);
                window.location.reload();
            }
        })
    }
}

function operation(userId) {
    window.location.href ="/user_edit.html?value=" + userId;
}

function deleteUser(userId) {
    if (confirm("确定要永久删除这个用户么？")) {
        $.ajax({
            type: "post",
            url: "/login/delete.do",
            data: {"userId": userId},
            success: function(result) {
                alert(result.message);
                window.location.reload();
            }
        })
    }
}

