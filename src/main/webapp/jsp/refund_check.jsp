<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: joy12
  Date: 2017/9/15
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>订单终止审核</title>
    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeIn">
    <div class="row">
        <div class="col-sm-12">
            <div class="tabs-container">
                <ul class="nav nav-tabs">
                    <li class="active"><a data-toggle="tab" href="#tab-parentCancel" aria-expanded="true">家长终止审核</a>
                    </li>
                    <li class=""><a data-toggle="tab" href="#tab-teacherCancel" aria-expanded="false">治疗师终止审核</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div id="tab-parentCancel" class="tab-pane active">
                        <div class="panel-body">
                            <div class="ibox-content">
                                <table class="table table-striped table-bordered table-hover ">
                                    <thead>
                                    <tr>
                                        <th>订单编号</th>
                                        <th>治疗师姓名</th>
                                        <th>家长姓名</th>
                                        <th>患者姓名</th>
                                        <th>订单金额（实付/总额）</th>
                                        <th>支付方式</th>
                                        <th>下单时间</th>
                                        <th>退款理由</th>
                                        <th></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${parentCancelList}" var="p">
                                        <tr class="gradeX">
                                            <td>${p.id}</td>
                                            <td>${p.teacherName}</td>
                                            <td>${p.parentName}</td>
                                            <td>${p.demandName}</td>
                                            <td> <c:if test="${empty p.realpay}"> 0.0 </c:if>${p.realpay} / <c:if test="${empty p.totalpay}"> 0.0 </c:if>${p.totalpay}</td>
                                            <td>${p.payWay}</td>
                                            <td>${p.sTime}</td>
                                            <td>${p.reason}</td>
                                            <td>
                                                <a onclick="checkRefund(${p.id},'p',true)">通过</a>
                                                <%--<a onclick="checkRefund(${p.id},'p',false)">拒绝</a>--%>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div id="tab-teacherCancel" class="tab-pane">
                        <div class="panel-body">
                            <div class="ibox-content">
                                <table class="table table-striped table-bordered table-hover ">
                                    <thead>
                                    <tr>
                                        <th>订单编号</th>
                                        <th>治疗师姓名</th>
                                        <th>家长姓名</th>
                                        <th>患者姓名</th>
                                        <th>订单金额（实付/总额）</th>
                                        <th>支付方式</th>
                                        <th>下单时间</th>
                                        <th>退款理由</th>
                                        <th></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${teacherCancelList}" var="t">
                                        <tr class="gradeX">
                                            <td>${t.id}</td>
                                            <td>${t.teacherName}</td>
                                            <td>${t.parentName}</td>
                                            <td>${t.demandName}</td>
                                            <td> <c:if test="${empty t.realpay}"> 0.0 </c:if>${t.realpay} / <c:if test="${empty t.totalpay}"> 0.0 </c:if>${t.totalpay}</td>
                                            <td>${t.payWay}</td>
                                            <td>${t.sTime}</td>
                                            <td>${t.remark}</td>
                                            <td>
                                                <a onclick="checkRefund(${t.id},'t',true)">通过</a>
                                                <%--<a onclick="checkRefund(${t.id}),'t',false">拒绝</a>--%>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>

</div>
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.5"></script>
<script src="js/content.min.js?v=1.0.0"></script>
<script src="js/plugins/sweetalert/sweetalert.min.js"></script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>
<script>
    function checkRefund(orderId,subject,isAccept) {
        $.ajax({
            url:'checkRefund',// 跳转到 action
            data:{
                orderId : orderId,
                requestSubject: subject,
                isAccept : isAccept
            },
            type:'post',
            success:function(data) {
                swal("操作成功！", "success");
                window.location.reload();
            },
            error : function() {
                alert("error");
            }
        })
    }
</script>

</html>