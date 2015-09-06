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
                    <div class="dropmenu">
                        <a id="shownav3" href="#" class="weibtn" data-toggle="dropmenu" aria-expanded="false">
                            <%=request.getSession().getAttribute("user")%><b class="caret"></b></a>

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
                                        <div class="item-lable">个人资料</div>
                                    </span>
                                </div>
                                <div class="dropmenu-item">
                                    <span class="item-icon"></span>
                                    <span class="item-content">
                                        <div class="item-lable">探索</div>
                                    </span>
                                </div>
                                <div class="dropmenu-item">
                                    <span class="item-icon"></span>
                                    <span class="item-content">
                                        <div class="item-lable">帮助</div>
                                    </span>
                                </div>
                                <div class="dropmenu-item">
                                    <span class="item-icon"></span>
                                    <span class="item-content">
                                        <div class="item-lable">设置</div>
                                    </span>
                                </div>
                                <div class="dropmenu-item">
                                    <span class="item-icon"></span>
                                    <span class="item-content">
                                        <div class="item-lable">退出</div>
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
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