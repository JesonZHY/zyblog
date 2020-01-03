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
});