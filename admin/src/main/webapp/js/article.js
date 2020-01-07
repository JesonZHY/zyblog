$(function () {
    $.ajax({
        type: "get",
        url: "/article/findAll.do",
        success: function (result) {
            var dateLength = result.length;
            var articleStatusName = "";
            for (var i = 0; i < dateLength; i++) {
                if (result[i].articleStatus == 0) {
                    articleStatusName = "已发布";
                }
                if (result[i].articleStatus == 1) {
                    articleStatusName = "已保存";
                }
                if (result[i].articleStatus == 2) {
                    articleStatusName = "已删除";
                }
                    $("#articleDate").append(
                        '<div class="col-md-12">' +
                            '<div class="tile">' +
                                '<div class="tile-title-w-btn">' +
                                    '<h3 class="title">' + result[i].articleTitle + '</h3>' +
                                        '<div class="btn-group">' +
                                            '<a class="btn btn-primary" data-target="#editModal" data-toggle="modal" onclick="changeArticleStatus(\'' + result[i].articleId + '\')">'+articleStatusName+'</a>' +
                                            '<a class="btn btn-primary" onclick="editThis(\'' + result[i].articleId + '\')"><i class="fa fa-lg fa-edit"></i></a>' +
                                            '<a class="btn btn-primary" onclick="deleteThis(\'' + result[i].articleId + '\')"><i class="fa fa-lg fa-trash"></i></a>' +
                                        '</div>' +
                                    '</div>' +
                                '<div class="tile-body" style="height: 30px">' + result[i].articleContents +
                                '</div>' +
                            '</div>' +
                        '</div>')
            }
        }
    })
});

function editThis(articleId) {
    window.location.href ="/article_edit.html?value=" + articleId;
}

function deleteThis(articleId) {
    if (confirm("确定要删除这篇博文么？")) {
        $.ajax({
            type: "post",
            url: "/article/delete.do",
            data: {"articleId": articleId},
            success: function(result) {
                alert(result.message);
                window.location.reload();
            }
        })
    }
}

function changeArticleStatus(articleId) {
    $("#articleIdModal").val(articleId);
}

function saveStatus() {
    var articleId = $("#articleIdModal").val();
    var articleStatus = $("input:radio:checked").val();
    $.ajax({
        type: "post",
        url: "/article/saveStatus.do",
        data: {"articleId": articleId, "articleStatus":articleStatus},
        success: function(result) {
            alert(result.message);
            window.location.reload();
        }
    })
}