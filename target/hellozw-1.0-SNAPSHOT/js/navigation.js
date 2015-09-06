$(function () {
    $("#showlink ul").dragsort({});

    $(function () {
        $("#shownav").dropmenu({
            title: 'please choose item',
            display: 'complex',
            showFilter: false
        });
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
            expandIcon: 'glyphicon glyphicon-chevron-right',
            collapseIcon: 'glyphicon glyphicon-chevron-down',
            nodeIcon: 'octicon octicon-repo',
            highlightSelected: false,
            data: defaultData
        });

    })

});