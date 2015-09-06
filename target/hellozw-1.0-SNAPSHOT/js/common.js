/**
 *
 */
$(function () {
    $("#shownav3").dropmenu({
        title: '标题',
        display: 'simple',
        fontWeight: false,
        showBorder: false,
        showCaret: true,
        position: 'right',
        width: '180px',
        padding:'4px'
    });
});

function login() {
    location.href = "/login.html";
}