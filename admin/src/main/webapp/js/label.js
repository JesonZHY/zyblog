$(function () {
    var page = 1;
    var rows = 10;
    $.ajax({
        type: "get",
        url: "/label/findAll.do?page="+page+"&rows="+rows ,
        success: function (result) {
            var labelList = result.rows;
            var labelStatusName = "";
            var labelStatus = "";
            for (var i = 0; i < labelList.length; i++) {
                var labelId = labelList[i].labelId;
                if (labelList[i].labelStatus == 1) {
                    labelStatusName = "启用";
                    labelStatus = 0;
                } else {
                    labelStatusName = "禁用";
                    labelStatus = 1;
                }
                $("#labelDate").append(
                    "<tr>" +
                    "<td>" + labelList[i].labelId + "</td>" +
                    "<td>" + labelList[i].labelName + "</td>" +
                    "<td>" + labelList[i].labelDesc + "</td>" +
                    "<td><a onclick='labelStatusOperation(\"" + labelId + "\", \"" + labelStatus + "\")'>" + labelStatusName + "</td>" +
                    "<td><a onclick='operation(\"" + labelId + "\")'>编辑&nbsp;&nbsp; </a><a onclick='deleteLabel(\"" + labelId +"\")'><i> &nbsp;&nbsp;删除</i></a></td>" +
                    "</tr>"
                );
            }
        }
    });
});

function labelStatusOperation(labelId, labelStatus) {
    var labelStatusName = "";
    if (labelStatus == 1) {
        labelStatusName = "启用";
    } else {
        labelStatusName = "禁用";
    }
    if (confirm("确定要" + labelStatusName +"这个用户么？")) {
        $.ajax({
            type: "post",
            url: "/label/cahgneLabelStatus.do",
            data: {"labelId": labelId, "labelStatus": labelStatus},
            success: function(result) {
                alert(result.message);
                window.location.reload();
            }
        })
    }
}


function operation(labelId) {
    window.location.href ="/label_edit.html?value=" + labelId;
}

function deleteLabel(labelId) {
    if (confirm("确定要永久删除这个用户么？")) {
        $.ajax({
            type: "post",
            url: "/label/delete.do",
            data: {"labelId": labelId},
            success: function(result) {
                alert(result.message);
                window.location.reload();
            }
        })
    }
}

