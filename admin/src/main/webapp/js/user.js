$(function () {
    var page = 1;
    var rows = 10;
    $.ajax({
        type: "get",
        url: "/admin/login/findAll.do?page="+page+"&rows="+rows ,
        success: function (result) {
            var userList = result.rows;
            // alert(userList.length);
            for (var i = 0; i < userList.length; i++) {
                var userId = userList[i].userId;
                var nowDate = new Date();
                var userBir = (userList[i].userBirthday).toString();
                var year = userBir.substring(0,4);
                var userage = nowDate.getFullYear() - year;
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
                    "<td><a onclick='operation(\"" + userId + "\")'>编辑&nbsp;&nbsp; </a><a onclick='deleteUser(\"" + userId +"\")'><i> &nbsp;&nbsp;删除</i></a></td>" +
                    "</tr>"
                );
            }
        }
    });
});

function operation(userId) {
    window.location.href ="/admin/user_edit.html?value=" + userId;
}

function deleteUser(userId) {
    alert(userId);
}

