$(function () {
    $.ajax({
        type: "get",
        url: "/article/getAllCategories.do",
        success: function (result) {
            console.log(result);
            for (var i = 0; i < result.length; i++) {
                $("#articleCategories").append(
                    '<label class="control-label col-md-2">' +
                    '<input type="checkbox" name="categoriesCheckBox" value="'+result[i].categoriesId+'"><span class="label-text">'+result[i].categoriesName+'</span>' +
                    '</label>'
                )
            }
        }
    })

    $.ajax({
        type: "get",
        url: "/article/getAlllabels.do",
        success: function (result) {
            for (var i = 0; i < result.length; i++) {
                $("#articleLabels").append(
                    '<label class="control-label col-md-2">' +
                    '<input type="checkbox" name="labelsCheckBox" value="'+result[i].labelId+'"><span class="label-text">'+result[i].labelName+'</span>' +
                    '</label>'
                )
            }
        }
    })

    var editor = KindEditor.create('textarea[name="content"]', {afterBlur:function () {
            this.sync();
        }});

})

function insert() {
    var title = $("#articleTitle").val();
    var categories = "";
    var labels = "";
    $.each($("#articleCategories [name = categoriesCheckBox]:checked"), function (i, val) {
        categories = categories + val.value + ",";
    });

    $.each($("#articleLabels [name = labelsCheckBox]:checked"), function (i, val) {
        labels = labels + val.value + ",";
    })

    var kindedit = $("#articleContents").val();

    $.ajax({
        type: "post",
        url: "/article/insert.do",
        data: {"articleTitle":title, "articleCategories":categories, "articleLabels":labels, "articleContents": kindedit},
        success: function (result) {
            alert(result.message);
        }
    })
}