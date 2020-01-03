$(function () {
    $("#labelName").blur(function () {
        var labelName = $("#labelName").val();
        $.ajax({
            type: "post",
            url: "/label/findByName.do",
            data: {"labelName": labelName},
            success: function(result) {
                if (!result.success) {
                    alert(result.message);
                }
            }
        })
    })
})

function insert(){
    var labelName = $("#labelName").val();
    var labelDesc = $("#labelDesc").val();
    $.ajax({
        type: "post",
        url: "/label/insert.do",
        data: {"labelName": labelName, "labelDesc": labelDesc},
        success: function (result) {
            if (result.success) {
                alert(result.message);
                window.location.href = "/label_list.html";
            } else {
                alert(result.message);
            }
        }
    })
}