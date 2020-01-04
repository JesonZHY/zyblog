$(function () {
    $("#userName").blur(function () {
        var username = $("#userName").val();
        $.ajax({
            type: "post",
            url: "/login/findByName.do",
            data: {"userName": username},
            success: function(result) {
                if (!result.success) {
                    alert(result.message);
                }
            }
        })
    })
    $("#userNickname").blur(function () {
        var userNickname = $("#userNickname").val();
        $.ajax({
            type: "post",
            url: "/login/findByNickName.do",
            data: {"userNickName": userNickname},
            success: function(result) {
                if (!result.success) {
                    alert(result.message);
                }
            }
        })
    })

    $("#userPassword2").blur(function () {
        var userPassword1 = $("#userPassword1").val();
        var userPassword2 = $("#userPassword2").val();
        if (userPassword2 != userPassword1) {
            alert("两次输入密码不一致！");
        }
    })
})

function insert(){
    var userName = $("#userName").val();
    var userPassword1 = $("#userPassword1").val();

    var userPassword2 = $("#userPassword2").val();
    if (userPassword2 != userPassword1) {
        alert("两次输入密码不一致！");
        return;
    }

    var userPassword = $("#userPassword2").val();
    var userNickname = $("#userNickname").val();
    var userBirthday = $("#userBirthday").val() == "" ? "1999-01-01" : $("#userBirthday").val();
    var userMobileNum = $("#userMobileNum").val();
    var userEmail = $("#userEmail").val();
    var userDesc = $("#userDesc").val();
    var userPhoto = new FormData();
    userPhoto.append("userPhoto", $("#userPhoto")[0].files[0]);
    var uploadResult = "";
    $.ajax({
        type: "post",
        processData: false,
        contentType: false,
        url: "/login/upload.do",
        data: userPhoto,
        success: function (result) {
            uploadResult = result.message;
            $.ajax({
                type: "post",
                url: "/login/insert.do",
                data: {"userName": userName, "userNickname": userNickname, "userPassword": userPassword, "userBirthday": userBirthday, "userMobileNum": userMobileNum, "userEmail": userEmail, "userDesc": userDesc, "userPhoto": uploadResult},
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
        sync: false
    })

}