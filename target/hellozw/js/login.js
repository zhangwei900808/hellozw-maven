$(function () {
    $('#submit').on('click', function (e) {
        var username = $("#username").val();
        var password = $("#password").val();
        if (username.length <= 0) {
            return $("#username").tooltip('show');
        }
        if (password.length <= 0) {
            return $("#password").tooltip('show');
        }
        $.post('/submit.html', {
            name: username,
            password: password
        }, function (val) {

        })
    });

    $("#username").on('change', function (e) {
        var useorname = $("#username").val();
        if (username.length > 0) {
            $("#username").tooltip('destroy');
        }
        else {
            return $("#username").tooltip('show');
        }
    })

    $("#password").on('change', function (e) {
        var password = $("#password").val();
        if (password.length > 0) {
            $("#password").tooltip('destroy');
        }
        else {
            return $("#password").tooltip('show');
        }
    });
});