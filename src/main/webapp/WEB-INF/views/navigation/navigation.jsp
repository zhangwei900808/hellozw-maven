<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>个性导航</title>
    <link href="/js/Font-Awesome-3.2.1/css/font-awesome.css" rel="stylesheet">
    <link href="/css/navigation.css" rel="stylesheet">
    <script type="text/javascript" src="/js/dragsort-0.5.2/jquery.dragsort-0.5.2.js"></script>
    <script type="text/javascript" src="/js/dragsort-0.5.2/jquery.dragsort-0.5.2.min.js"></script>
    <script type="text/javascript" src="/js/navigation.js"></script>
    <script>
        $(function () {
            $("#shownav").dropmenu({
                color: 'blue',
                title: 'please choose item',
                width: '200px',
                showFilter: false
            });
        })
    </script>
</head>
<body>
<div class="container" id="container-main">
    <div class="row">
        <div class="dropmenu">
            <button id="shownav" class="btn btn-default" data-toggle="dropmenu" aria-expanded="false"><span
                    class="octicon octicon-check"></span>测试<b class="caret"></b></button>

            <div class="dropmenu-panel">
                <div class="dropmenu-header">
                    <span class="dropmenu-title">标题</span>
                    <span class="octicon octicon-x header-close" role="button" aria-label="Close"></span>
                </div>
                <div class="dropmenu-filters">
                    <div class="dropmenu-filter">
                        <input type="text" class="filter-input" placeholder="请输入过滤内容">
                    </div>
                </div>
                <div class="dropmenu-items">
                    <div class="dropmenu-item">
                        <span class="item-icon"></span>
                        <span class="item-content">
                            <div class="item-lable">测试</div>
                            <div class="item-note">这是备注内容</div>
                        </span>
                    </div>
                    <div class="dropmenu-item">
                        <span class="item-icon octicon octicon-check"></span>
                        <span class="item-content">
                            <div class="item-lable">测试</div>
                            <div class="item-note">这是备注内容</div>
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-3">
           
        </div>
        <div class="col-lg-9">

            <div id="showlink">
                <ul>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><a href="#"><span class="octicon octicon-dash pull-right"></span></a></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                    <li>
                        <div><a target="_blank" href="http://www.solidot.org/?theme=clightgreen">
                            <img width="16px" height="16px" style="margin-right:5px;"
                                 src="http://www.solidot.org/favicon.ico">奇客
                            </img>

                        </a><span class="octicon octicon-dash pull-right"></span></div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
<!-- 模态框（Modal添加导航） -->
<div class="modal fade" id="navModal" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true">×
                </button>
                <h4 class="modal-title">添加导航</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">名称</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="navname"
                                   placeholder="请输入导航名称">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">类型</label>

                        <div class="col-sm-10">
                            <select id="navtype" class="form-control">
                                <option value="1">技术社区</option>
                                <option value="2">社交邮箱</option>
                                <option value="3">生活娱乐</option>
                                <option value="4">更多</option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary"
                        data-dismiss="modal" onclick="addNav()">保存
                </button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<!-- 模态框（Modal添加链接） -->
<div class="modal fade" id="linkModal" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true">×
                </button>
                <h4 class="modal-title">添加链接</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">名称</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="linkname"
                                   placeholder="请输入链接名称">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">网址</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="linkurl"
                                   placeholder="请输入链接网址">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">类型</label>

                        <div class="col-sm-10">
                            <select id="linktype" class="form-control"></select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary"
                        data-dismiss="modal" onclick="addLink()">保存
                </button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->
</body>
</html>