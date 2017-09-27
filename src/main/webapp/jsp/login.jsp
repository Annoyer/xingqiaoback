<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>登录</title>

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen animated fadeInDown">
    <div>
        <%--<c:if test="${not empty logoutMsg}">--%>
        <%--<div>--%>
            <%--<h4>${logoutMsg}</h4>--%>
        <%--</div>--%>
        <%--</c:if>--%>
        <div>
            <h2>星桥后台管理系统 - 入口</h2>
        </div>
        <form class="m-t" role="form" action="/login" method="post">
            <div class="form-group">
                <input type="text" id="username" name="username" class="form-control" placeholder="账号" required="">
            </div>
            <div class="form-group">
                <input type="password" id="password" name="password" class="form-control" placeholder="密码" required="">
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>
            <%--<input type="hidden"--%>
                   <%--name="${_csrf.parameterName}" value="${_csrf.token}" />--%>
        </form>
        <p style="color: red; display: ${noAccountMsg}">账号密码错误</p>
        <p style="color: #1e90ff; display: ${logoutMsg}">注销成功</p>
    </div>
</div>
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.5"></script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>
<script>

</script>