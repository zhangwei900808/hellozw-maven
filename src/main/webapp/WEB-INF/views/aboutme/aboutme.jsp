<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>关于我</title>
    <link href="${path}/css/aboutme.css" rel="stylesheet">
    <link href="${path}/js/Font-Awesome-3.2.1/css/font-awesome.css" rel="stylesheet">
</head>
<body>
<div class="container" id="content-h">
    <div class="demo-browser" style="position:relative;">
        <div class="demo-browser-side">
            <img src="/images/mywx.jpg" class="qrcode_pic" width="90" height="90" style="
    position: absolute;
    left: 46px;
    top: 286px;
">

            <div class="demo-browser-author"></div>
            <div class="demo-browser-action">
                <a class="btn btn-danger btn-block" href="https://twitter.com/zhangwei0808" target="_blank">
                    <span class="octicon octicon-plus" style="margin-right: 10px;"></span>关注我 </a>
            </div>
            <h5>@zhangwei0808</h5>
            <h6>
                读书. 设计师. 合肥<br> <a href="https://www.facebook.com/weiruan.zw?ref=tn_tnmn">
                <img alt="facebook" src="/images/fb.png" width="16" height="16"></a> <a href="http://weibo.com/waishow">
                <img alt="sina" src="/images/sina.png"></a>
                <a href="https://github.com/zhangwei900808"><img src="/images/github.png" alt="github"></a>

            </h6>
        </div>
        <div class="tooltip-arrow"></div>
        <div class="demo-browser-content">
            我来自一个古老的星球，1609年来到地球，在地球上居住了将近400年(这可是真的，我不是说和我有同样经历的都教授)<br> <br>
            我的名字叫张威(多好听的名字啊)，毕业于哈弗大学(之前和比尔·盖次是同学，自从那家伙创立了威软，我和他的关系就不太好，我发誓要打败他，然后进入安徽机电职业技术学院学习软件技术，你们觉得我会成功么)，
            现在在一家世界五百强公司任职CEO(想问我是什么公司?叫合肥优尔电子科技有限公司，什么，查不到这个公司?额，嗯，这个。。。也许你该换个搜索引擎了)<br> <br>
            我做事刻苦认真(大家都这么说)，而且我的技术已经达到炉火纯青的地步，相信不久的将来我可以统治全美的网络了<br> <br> 真是一段高大上的介绍啊^_^
        </div>

    </div>
</div>
</body>
</html>
