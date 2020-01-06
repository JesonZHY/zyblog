$(function () {
    $("#categoriesName").blur(function () {
        var categoriesName = $("#categoriesName").val();
        $.ajax({
            type: "post",
            url: "/categories/findByName.do",
            data: {"categoriesName": categoriesName},
            success: function(result) {
                if (!result.success) {
                    alert(result.message);
                }
            }
        })
    })
})

function insert(){
    var categoriesName = $("#categoriesName").val();
    var categoriesDesc = $("#categoriesDesc").val();
    $.ajax({
        type: "post",
        url: "/categories/insert.do",
        data: {"categoriesName": categoriesName, "categoriesDesc": categoriesDesc},
        success: function (result) {
            if (result.success) {
                alert(result.message);
                window.location.href = "/categories_list.html";
            } else {
                alert(result.message);
            }
        }
    })
}