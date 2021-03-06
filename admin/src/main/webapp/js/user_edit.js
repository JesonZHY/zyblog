$(function () {
    var userId = GetRequest();

    $.ajax({
        type: "post",
        url: "/login/findOne.do",
        data: {"userId" : userId},
        success: function (result) {
            $("#userName").val(result.userName);
            $("#userNickname").val(result.userNickname);
            var ub = (result.userBirthday).toString();
            var year = ub.substring(0,10);
            $("#userBirthday").val(year);
            $("#userMobileNum").val(result.userMobileNum);
            $("#userEmail").val(result.userEmail);
            $("#userDesc").val(result.userDesc);
            $("#hiddenFile").val(result.userPhoto);
        }
    })
});

function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串
    var str = url.substr(1);
    var userID = str.substring(6);
    return userID;
}

function save(){
    var userName = $("#userName").val();
    var userNickname = $("#userNickname").val();
    var userBirthday = $("#userBirthday").val() == "" ? "1999-01-01" : $("#userBirthday").val();
    var userMobileNum = $("#userMobileNum").val();
    var userEmail = $("#userEmail").val();
    var userDesc = $("#userDesc").val();
    var userPhoto =  $("#hiddenFile").val()
    var file = $("#file").val()
    if (file == "" || file == undefined || file == null) {
        $.ajax({
            type: "post",
            url: "/login/save.do",
            data: {"userName": userName, "userNickname": userNickname, "userBirthday": userBirthday, "userMobileNum": userMobileNum, "userEmail": userEmail, "userDesc": userDesc, "userPhoto": userPhoto},
            success: function (result) {
                if (result.success) {
                    alert(result.message);
                    window.location.href = "/user_list.html";
                } else {
                    alert(result.message);
                }
            }
        })
    } else {
        var formData = new FormData($('form')[0]);
        var uploadResult = "";
        $.ajax({
            type: "post",
            processData: false,
            contentType: false,
            url: "http://up.imgapi.com/",
            data: formData,
            sync: false,
            success: function (result) {
                uploadResult = result.t_url;
                $.ajax({
                    type: "post",
                    url: "/login/save.do",
                    data: {"userName": userName, "userNickname": userNickname, "userBirthday": userBirthday, "userMobileNum": userMobileNum, "userEmail": userEmail, "userDesc": userDesc, "userPhoto": uploadResult},
                    success: function (result) {
                        if (result.success) {
                            alert(result.message);
                            window.location.href = "/user_list.html";
                        } else {
                            alert(result.message);
                        }
                    }
                })
            },
            error: function (result) {
                console.log(result);
            }
        })
    }

}