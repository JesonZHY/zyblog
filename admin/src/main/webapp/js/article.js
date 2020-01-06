$(function () {
    $.ajax({
        type: "get",
        url: "/article/findAll.do",
        success: function (result) {
            var dateLength = result.length;
            for (var i = 0; i < dateLength; i++) {
                    $("#articleDate").append(
                        '<div class="col-md-12">' +
                            '<div class="tile">' +
                                '<div class="tile-title-w-btn">' +
                                    '<h3 class="title">' + result[i].articleTitle + '</h3>' +
                                        '<div class="btn-group">' +
                                            '<a class="btn btn-primary" onclick="editThist(\'' + result[i].articleId + '\')"><i class="fa fa-lg fa-edit"></i></a>' +
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
})