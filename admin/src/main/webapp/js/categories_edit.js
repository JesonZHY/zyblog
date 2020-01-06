$(function () {
    var categoriesId = GetRequest();

    $.ajax({
        type: "post",
        url: "/categories/findOne.do",
        data: {"categoriesId" : categoriesId},
        success: function (result) {
            $("#categoriesName").val(result.categoriesName);
            $("#categoriesDesc").val(result.categoriesDesc);
        }
    })
});

function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串
    var str = url.substr(1);
    var categoriesID = str.substring(6);
    return categoriesID;
}

function save(){
    var categoriesName = $("#categoriesName").val();
    var categoriesDesc = $("#categoriesDesc").val();
    $.ajax({
        type: "post",
        url: "/categories/save.do",
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