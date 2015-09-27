$(function () {
    $("[data-toggle='tooltip']").tooltip({html : true });
    var defaultData = [
        {
            text: 'Java',
            href: '#parent1',
            tags: ['4'],
            nodes: [
                {
                    text: 'Spring',
                    href: '#child1',
                    tags: ['2'],
                    nodes: [
                        {
                            text: 'SpringMVC',
                            href: '#grandchild1',
                            tags: ['0']
                        },
                        {
                            text: 'Spring.Net',
                            href: '#grandchild2',
                            tags: ['0']
                        }
                    ]
                },
                {
                    text: 'Child 2',
                    href: '#child2',
                    tags: ['0']
                }
            ]
        },
        {
            text: 'Parent 2',
            href: '#parent2',
            tags: ['0']
        },
        {
            text: 'Parent 3',
            href: '#parent3',
            tags: ['0']
        },
        {
            text: 'Parent 4',
            href: '#parent4',
            tags: ['0']
        },
        {
            text: 'Parent 5',
            href: '#parent5',
            tags: ['0']
        }
    ];
    $('#treeview5').treeview({
        expandIcon: 'octicon octicon-triangle-right',
        collapseIcon: 'octicon octicon-triangle-down',
        highlightSelected: false,
        color:'#4183c4',
        onhoverColor:'#4078c0',
        data: defaultData
    });
    //$("#showlink ul").dragsort({});
    $(".we-edit").hide();
    $("#shownav4").dropmenu({
        title: '请选择分类',
        display: 'complex',
        showFilter: false,
        width:'180px',
        position:'right'
    });
    $("#shownav").dropmenu({
        title: 'please choose item',
        display: 'complex',
        width:'280px',
        showFilter: false,
        position:'left'
    });


    $('#menu').metisMenu();
    $("#editnav").on('click',function(e){
        $('#editnav-modal').modal()

    });
});

function showedit(){
    $(".wei-search").hide();
    $(".we-edit").show();
}