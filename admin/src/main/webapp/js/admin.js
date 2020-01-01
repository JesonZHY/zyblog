$(document).ready(function () {
    $("#loginUsername").focus();
    $("#submitReset").click(function () {
        $("#loginUsername").val("");
        $("#loginPassword").val("");
    })

    $("#submitLogin").click(function(){
        var username = $("#loginUsername").val();
        var password = $("#loginPassword").val();
        if(username == "" || username == null || username == undefined) {
            alert("用户名不可为空！");
            return;
        }
        if(password == "" || password == null || password == undefined){
            alert("密码不可为空！");
            return;
        }
        $.ajax({
            type: "post",
            url: "login/login.do",
            data: {"username":username,"password":password},
            success:function (result) {
                // console.log(result);
                if (result.success == false){
                    alert(result.message);
                } else if (result.success == true) {
                    window.location.href = "./manager.html";
                }
            }
        })
    })
})