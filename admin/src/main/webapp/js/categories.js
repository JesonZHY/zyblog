$(function () {
    var page = 1;
    var rows = 10;
    $.ajax({
        type: "get",
        url: "/categories/findAll.do?page="+page+"&rows="+rows ,
        success: function (result) {
            var categoriesList = result.rows;
            var categoriesStatusName = "";
            var categoriesStatus = "";
            for (var i = 0; i < categoriesList.length; i++) {
                var categoriesId = categoriesList[i].categoriesId;
                if (categoriesList[i].categoriesStatus == 1) {
                    categoriesStatusName = "启用";
                    categoriesStatus = 0;
                } else {
                    categoriesStatusName = "禁用";
                    categoriesStatus = 1;
                }
                $("#categoriesDate").append(
                    "<tr>" +
                    "<td>" + categoriesList[i].categoriesId + "</td>" +
                    "<td>" + categoriesList[i].categoriesName + "</td>" +
                    "<td>" + categoriesList[i].categoriesDesc + "</td>" +
                    "<td><a onclick='categoriesStatusOperation(\"" + categoriesId + "\", \"" + categoriesStatus + "\")'>" + categoriesStatusName + "</td>" +
                    "<td><a onclick='operation(\"" + categoriesId + "\")'>编辑&nbsp;&nbsp; </a><a onclick='deletecategories(\"" + categoriesId +"\")'><i> &nbsp;&nbsp;删除</i></a></td>" +
                    "</tr>"
                );
            }
        }
    });
});

function categoriesStatusOperation(categoriesId, categoriesStatus) {
    var categoriesStatusName = "";
    if (categoriesStatus == 1) {
        categoriesStatusName = "启用";
    } else {
        categoriesStatusName = "禁用";
    }
    if (confirm("确定要" + categoriesStatusName +"这个分类么？")) {
        $.ajax({
            type: "post",
            url: "/categories/changeCategoriesStatus.do",
            data: {"categoriesId": categoriesId, "categoriesStatus": categoriesStatus},
            success: function(result) {
                alert(result.message);
                window.location.reload();
            }
        })
    }
}


function operation(categoriesId) {
    window.location.href ="/categories_edit.html?value=" + categoriesId;
}

function deletecategories(categoriesId) {
    if (confirm("确定要永久删除这个分类么？")) {
        $.ajax({
            type: "post",
            url: "/categories/delete.do",
            data: {"categoriesId": categoriesId},
            success: function(result) {
                alert(result.message);
                window.location.reload();
            }
        })
    }
}

