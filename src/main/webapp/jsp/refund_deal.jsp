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


    <title>退款处理</title>
    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeIn">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <div class="row">
                        <div class="col-sm-11">
                            <h5>退款处理</h5>
                        </div>
                    </div>
                </div>
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
                        <c:forEach items="${refundToDealList}" var="p">
                            <tr class="gradeX">
                                <td>${p.id}</td>
                                <td>${p.teacherName}</td>
                                <td>${p.parentName}</td>
                                <td>${p.demandName}</td>
                                <td> <c:if test="${empty p.realpay}"> 0.0 </c:if>${p.realpay} / <c:if test="${empty p.totalpay}"> 0.0 </c:if>${p.totalpay}</td>
                                <td>${p.payWay}</td>
                                <td>${p.sTime}</td>
                                <td>${p.remark}</td>
                                <td>
                                    <a onclick="dealRefund(${p.id}, ${p.statusP})">处理</a>
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
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.5"></script>
<script src="js/content.min.js?v=1.0.0"></script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
<script>
    function dealRefund(orderId,status) {
        var amount = prompt('请输入退款金额：', '0');
        if (checknum(amount)){
            var requestSubject = "";
            if (status == 6){
                requestSubject = "p";
            } else if (status == 9){
                requestSubject = "t";
            }
            $.ajax({
                url:'dealRefund',// 跳转到 action
                data:{
                    orderId : orderId,
                    requestSubject: requestSubject,
                    refundAmount : parseFloat(amount)
                },
                type:'post',
                success:function(data) {
                    alert("退款成功");
                },
                error : function() {
                    alert("退款失败");
                }
            })
        }

    }

    function checknum(v) {
        if (isNaN(v)) {
            alert("请输入数字");
            return false;
        } else if (parseFloat(v) <= 0){
            alert("请输入正数");
            return false;
        } else return true;
    }
</script>
</body>

</html>