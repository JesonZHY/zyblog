(function () {
	"use strict";

	var treeviewMenu = $('.app-menu');

	// Toggle Sidebar
	$('[data-toggle="sidebar"]').click(function(event) {
		event.preventDefault();
		$('.app').toggleClass('sidenav-toggled');
	});

	// Activate sidebar treeview toggle
	$("[data-toggle='treeview']").click(function(event) {
		event.preventDefault();
		if(!$(this).parent().hasClass('is-expanded')) {
			treeviewMenu.find("[data-toggle='treeview']").parent().removeClass('is-expanded');
		}
		$(this).parent().toggleClass('is-expanded');
	});

	// Set initial active toggle
	$("[data-toggle='treeview.'].is-expanded").parent().toggleClass('is-expanded');

	//Activate bootstrip tooltips
	$("[data-toggle='tooltip']").tooltip();

})();

$(function () {
    $("#submitLogin").click(function () {
        var username = $("#username").val();
        var password = $("#password").val();
        if (username == "" || password == "") {
            alert("用户名或者密码不可为空！");
            return;
		}
		$.ajax({
			type: "post",
			url: "/login/login.do",
			data: {"username":username, "password":password},
			success: function (result) {
				if (result.success == false) {
					alert(result.message);
					return;
				}
				if (result.success == true) {
                    window.location.href ="/index.html";
                }
            }
		})
    });


});
