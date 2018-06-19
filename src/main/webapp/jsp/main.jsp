<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%--
  Created by IntelliJ IDEA.
  User: joy12
  Date: 2017/9/11
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <title>星桥后台管理系统</title>

    <!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet">
    <style type="text/css">
        .flex-container{
            display: -webkit-flex;
            display: flex;
            align-items: center;
        }

    </style>
</head>

<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
<div id="wrapper">
    <!--左侧导航开始-->
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="nav-close"><i class="fa fa-times-circle"></i>
        </div>
        <div class="sidebar-collapse">
            <ul class="nav" id="side-menu">

                <!--当前管理员-->
                <li class="nav-header">
                    <div class="dropdown profile-element">
                        <span><img alt="image" class="img-circle" src="img/profile_small.jpg" /></span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="clear"></span>
                            <c:if test="${user != null}">
                            <span class="block m-t-xs"><strong class="font-bold">${user}</strong></span>
                            </c:if>
                        </a>
                        <a onclick="$('#logoutForm').submit();">注销</a>
                        <!-- csrt for log out-->
                        <form action="/logout" method="post" id="logoutForm">
                            <%--<input type="hidden"--%>
                                   <%--name="${_csrf.parameterName}"--%>
                                   <%--value="${_csrf.token}" />--%>
                        </form>
                    </div>
                </li>

                <li class="flex-container">
                    <a class="J_menuItem" href="msg_admin" onclick="javascript:document.getElementById('unreadMsgNum').style.display='none';"><i class="fa fa-bell"></i>
                        <span class="nav-label">我的消息</span>
                        <c:if test="${unreadMsgNum > 0}">
                            <i class="label label-primary" id="unreadMsgNum">${unreadMsgNum}</i>
                        </c:if>
                    </a>
                </li>

                <!--用户管理-->
                <li>
                    <a href="#">
                        <i class="fa fa-users"></i>
                        <span class="nav-label">用户管理</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="teachers" data-index="0">治疗师管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="parents">家长管理</a>
                        </li>
                    </ul>

                </li>
                <!--订单管理-->
                <li>
                    <a href="#">
                        <i class="fa fa-tasks"></i>
                        <span class="nav-label">订单管理</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="orders" data-index="0">全部订单</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="refund_check">终止审核</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="refund_deal">退款处理</a>
                        </li>
                    </ul>

                </li>

                <!--机构管理-->
                <li>
                    <a class="J_menuItem" href="organizations"><i class="fa fa-building"></i> <span class="nav-label">机构管理</span></a>
                </li>

            </ul>
        </div>
    </nav>
    <!--左侧导航结束-->

    <!--右侧部分开始-->
    <div id="page-wrapper" class="gray-bg dashbard-1">

        <!--页面选项卡栏-->
        <div class="row content-tabs">
            <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
            </button>
            <nav class="page-tabs J_menuTabs">
                <div class="page-tabs-content">
                </div>
            </nav>
            <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>
                </button>
                <ul role="menu" class="dropdown-menu dropdown-menu-right">
                    <li class="J_tabShowActive"><a>定位当前选项卡</a>
                    </li>
                    <li class="divider"></li>
                    <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                    </li>
                    <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                    </li>
                </ul>
            </div>
            <a href="login.html" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
        </div>

        <!--页面内容-->
        <div class="row J_mainContent" id="content-main">
            <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="" frameborder="0" data-id="" seamless></iframe>
        </div>

        <div class="footer">
            <div class="pull-right">星桥</div>
        </div>
    </div>
    <!--右侧部分结束-->

</div>
<script src="js/jquery.min.js?v=2.1.4"  charset="UTF-8"></script>
<script src="js/bootstrap.min.js?v=3.3.5"  charset="UTF-8"></script>
<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="js/plugins/layer/layer.min.js"></script>
<script src="js/hplus.min.js?v=4.0.0"></script>
<script type="text/javascript" src="js/contabs.min.js"></script>
<script src="js/plugins/pace/pace.min.js"></script>
</body>

</html>
<script type="text/javascript">

</script>
