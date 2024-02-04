
function updateArrayTable(){
    $.post("arrays/ReloadArrayTable").done(function (fragment) {
        //console.log(fragment);
        $("#ArrayTable").replaceWith(fragment);
    });
}