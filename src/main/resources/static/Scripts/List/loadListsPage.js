function updateListTable(){
    $.post("linklists/ReloadListTable").done(function (fragment) {
        //console.log(fragment);
        $("#ListTable").replaceWith(fragment);
    });
}