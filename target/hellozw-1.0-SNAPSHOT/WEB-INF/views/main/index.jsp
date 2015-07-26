<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>新感觉,新体验</title>
    <link rel="stylesheet" href="css/index.css">
    <script type="application/javascript" src="js/index.js"></script>
    <script type="application/javascript" src="js/jquery.form.js"></script>
</head>
<body>

<div class="mycontent">
    <div id="content-c" class="container">
        <form action="/region.html" id="myform">
            <div class="form-group"><input type="text" id="username" name="username" class="form-control" placeholder="用户名" required></div>
            <div class="form-group"><input type="email" id="email" name="email" class="form-control" placeholder="邮箱" required></div>
            <div class="form-group"><input type="password" id="password" name="password" class="form-control" placeholder="密码" required></div>
            <p class="text-muted">至少使用一个小写字母，一个数字和七个字符。</p>

            <div class="form-group">
                <button  class="btn btn-success btn-block" id="region" type="submit"><b>注册为Awbeci</b></button>
            </div>
            <p class="text-muted">当你点击注册为Awbeci，默认你同意我们的<a href="#" style="color:blue">服务条款</a>和隐私保护的条款.我们将发送一封电子邮件到你注册的邮箱.</p>
        </form>
        <h1>共享网上资源<br>成就自我梦想</h1>
    </div>
</div>

</body>
</html>