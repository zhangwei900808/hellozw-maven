<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><sitemesh:write property="title"/></title>
    <!-- Loading Bootstrap -->
    <link href="${path}/js/Bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${path}/js/Bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="${path}/css/common.css" rel="stylesheet">
    <link href="${path}/css/social-buttons.css" rel="stylesheet">
    <link href="${path}/css/template.css" rel="stylesheet">
    <link href="${path}/js/zw-bootstrap/zw-bootstrap.css" rel="stylesheet">
    <link href="${path}/js/octicons/octicons.css" rel="stylesheet">
    <link href="http://static.bootcss.com/www/assets/ico/favicon.png" rel="shortcut icon">
    <script src="${path}/js/jquery-1.11.2.min.js"></script>
    <script src="${path}/js/Bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="${path}/js/zw-bootstrap/zw-bootstrap.js"></script>
    <script src="${path}/js/common.js"></script>
    <sitemesh:write property="head"/>
</head>
<body>

<nav class="navbar navbar-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <%--<a class="navbar-brand" href="/"--%>
            <%--style="font-weight: bold; color: #333;"><span class="mega-octicon octicon-mark-github"></span></a>--%>
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
            <ul class="nav navbar-nav navbar-left">
                <li><a href="/navigation.html" class="header-nav-link">Navigation</a></li>
                <li><a href="/navigation.html" class="header-nav-link">Resource Search</a></li>
                <li><a href="/navigation.html" class="header-nav-link">Soft Hub</a></li>
                <li><a href="/navigation.html" class="header-nav-link">Note</a></li>
                <li><a href="#" class="header-nav-link">Resume</a></li>
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