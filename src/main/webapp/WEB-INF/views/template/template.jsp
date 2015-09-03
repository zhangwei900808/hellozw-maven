<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><sitemesh:write property="title"/></title>
    <!-- Loading Bootstrap -->
    <link href="/js/Bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/Bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="/css/social-buttons.css" rel="stylesheet">
    <link href="/css/template.css" rel="stylesheet">
    <link href="/js/awbeci/themes/default/dropmenu.css" rel="stylesheet">
    <link href="/js/octicons/octicons.css" rel="stylesheet">
    <link href="http://static.bootcss.com/www/assets/ico/favicon.png" rel="shortcut icon">
    <link href="/css/common.css" rel="stylesheet">
    <script src="/js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="/js/awbeci/src/dropmenu.js"></script>
    <script src="/js/common.js"></script>
    <sitemesh:write property="head"/>
    <%if (request.getSession().getAttribute("user") != null) {%>
    <style type="text/css">
        .navbar-nav > li > a {
            padding-top: 10px;
            padding-bottom: 10px;
        }

        .navbar-header {
            display: none
        }
    </style>
    <% }%>
</head>
<body>
<nav class="navbar navbar-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand nav-logo" href="/">Awbeci</a>

            <form id="querylink" action="http://www.baidu.com/baidu"
                  target="_blank" class="input-group input-group-sm">
                <input name="tn" type="hidden" value="baidu"> <input
                    id="linktxt" name="word" baiduSug="1" type="text"
                    class="form-control" placeholder="请输入查询内容"> <span
                    class="input-group-btn">
					</span>
            </form>
        </div>

        <div class="collapse navbar-collapse" id="navbar-collapse-01">

            <% if (request.getSession().getAttribute("user") != null) { %>
            <h1 class="logo"><span class="mega-octicon octicon-mark-github"></span></h1>
            <ul class="nav navbar-nav navbar-left">
                <li><a href="/navigation/navigation.html" class="header-nav-link">我的博客</a></li>
                <li><a href="/navigation/navigation.html" class="header-nav-link">资源</a></li>
                <li><a href="/navigation/navigation.html" class="header-nav-link">社交</a></li>
                <li><a href="/navigation/navigation.html" class="header-nav-link">关于我</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle"
                       data-toggle="dropdown"><%=request.getSession().getAttribute("user")%> <span class="caret"></span></a>
                    <ul class="dropdown-menu pull-right">
                        <li>
                            <div><span style="padding-left: 10px;color:#666;font-size: 10px">下拉header</span></div>
                        </li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#"><span style="display: inline-block">Action</span>
                            <span style="display: block;color:#ccc;padding-left: 15px;font-size: 10px">这是测试数据</span>
                        </a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <% } else {%>
            <ul class="nav navbar-nav navbar-left">
                <li><a href="/navigation/navigation.html" class="header-nav-link">探索发现</a></li>
                <li><a href="/navigation/navigation.html" class="header-nav-link">功能特性</a></li>
                <li><a href="/navigation/navigation.html" class="header-nav-link">站点博客</a></li>
                <li><a href="/navigation/navigation.html" class="header-nav-link">关于</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <button type="button" class="btn btn-success btn-nav">注册
                    </button>
                </li>
                <li>
                    <button type="button" class="btn btn-default btn-nav" onclick="login()">登录
                    </button>
                </li>
            </ul>

            <%}%>

        </div>
    </div>
    <!-- /.navbar-collapse --> </nav>
<!-- /navbar -->

<sitemesh:write property="body"/>
<footer>
    <div class="myclearfix">
        <span>©2015 hellozw <a href="http://www.miitbeian.gov.cn/">皖ICP备14011269号-1</a></span>
    </div>
</footer>
<script charset="gbk" src="http://www.baidu.com/js/opensug.js"></script>
<!-- /menu -->
</body>
</html>