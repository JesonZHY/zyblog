$(function () {
    $.ajax({
        type: "get",
        url: "/login/isUserLogin.do",
        success: function (result) {
            if (result.success == false) {
                window.location.href = "/login.html";
            }
        }
    })

    $("#logout").click(function () {
        $.ajax({
            type: "get",
            url: "/login/logout.do"
        })
    })

    $.ajax({
        type: "get",
        url: "/login/getUserInfo.do",
        success: function(user) {
            console.log(user);
            $("#currentUserName").text(user.userName);
            $("#currentUserDesc").text(user.userDesc);
            $("#currentUserPhoto").attr("src", user.userPhoto);
        }
    })
});