// Init sidebar
$(function () {
    var activeItem,
        helpList = $('#js-sidebar .js-topic'),
        firstOccurance = true
    $('#js-sidebar .js-topic').each(function () {
        if (($(this).find('.disable').length == 0 || firstOccurance == false) &&
            $(this).hasClass('js-current') != true) {
            $(this).find('.js-guides').children().hide()
        } else {
            activeItem = $(this).index()
            firstOccurance = false
        }
    })

    // Toggle style list. Expanded items stay
    // expanded when new items are clicked.
    $('#js-sidebar .js-toggle-list .js-expand-btn').click(function () {
        var clickedTopic = $(this).parents('.js-topic'),
            topicGuides = clickedTopic.find('.js-guides li')
        $(this).toggleClass('collapsed expanded')
        topicGuides.slideToggle(100)
        return false
    })
});