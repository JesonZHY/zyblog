$(function () {
    var labelId = GetRequest();

    $.ajax({
        type: "post",
        url: "/label/findOne.do",
        data: {"labelId" : labelId},
        success: function (result) {
            $("#labelName").val(result.labelName);
            $("#labelDesc").val(result.labelDesc);
        }
    })
});

function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串
    var str = url.substr(1);
    var labelID = str.substring(6);
    return labelID;
}

function save(){
    var labelName = $("#labelName").val();
    var labelDesc = $("#labelDesc").val();
    $.ajax({
        type: "post",
        url: "/label/save.do",
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