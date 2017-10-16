<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: joy12
  Date: 2017/9/15
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>订单管理</title>

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <!-- Data Tables -->
    <link href="css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">

    <link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">

    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>订单管理</h5>
                </div>
                <div class="ibox-content">
                    <table class="table table-striped table-bordered table-hover " id="editable">
                        <thead>
                            <tr>
                                <th>订单编号</th>
                                <th>治疗师姓名</th>
                                <th>家长姓名</th>
                                <th>患者姓名</th>
                                <th>订单金额（实付/总额）</th>
                                <th>支付方式</th>
                                <th>下单时间</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody id="tableBody">
                            <c:forEach items="${orders}" var="o">
                                <tr class="gradeX">
                                    <td>${o.id}</td>
                                    <td>${o.teacherName}</td>
                                    <td>${o.parentName}</td>
                                    <td>${o.demandName}</td>
                                    <td> <c:if test="${empty o.realpay}"> 0.0 </c:if>${o.realpay} / <c:if test="${empty o.totalpay}"> 0.0 </c:if>${o.totalpay}</td>
                                    <td>${o.payWay}</td>
                                    <td>${o.sTime}</td>
                                    <td>
                                        <a target="_self" href="order_detail?orderId=${o.id}&teacherId=${o.teacherId}&parentId=${o.parentId}&demandId=${o.demandId}">订单详情</a>
                                        <a onclick="deleteOrder(${o.id})">删除订单</a>
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
<script src="js/plugins/jeditable/jquery.jeditable.js"></script>
<script src="js/plugins/dataTables/jquery.dataTables.js"></script>
<script src="js/plugins/dataTables/dataTables.bootstrap.js"></script>
<script src="js/content.min.js?v=1.0.0"></script>
<script src="js/plugins/sweetalert/sweetalert.min.js"></script>
<script>
    $(document).ready(function(){
        $(".dataTables-example").dataTable();
        var oTable=$("#editable").dataTable();
    });

    function deleteOrder(obj){
        //alert(obj);
        swal({
            title: "您确定要删除这条信息吗",
            text: "删除后将无法恢复，请谨慎操作！",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "删除",
            closeOnConfirm: false
        }, function () {
            $.ajax({
                url:'deleteOrder',// 跳转到 action
                data:{
                    orderId : obj
                },
                type:'post',
                dataType:'json',
                success:function(data) {
                    if (data.retCode == 0){
                        swal("删除成功！", "您已经永久删除了这条信息", "success");
                        window.location.reload();
                    } else if (data.errorPage != null){
                        swal({title: "删除失败！",
                            text: "用户权限不足",
                            type: "info",
                            showCancelButton: true,
                            confirmButtonColor: "#DD6B55",
                            confirmButtonText: "重新登陆",
                            cancelButtonText: "返回",
                            closeOnConfirm: false},function (isConfirm) {
                            if (isConfirm){
                                window.location.href=data.errorPage;
                            }
                        });
                    }else {
                        swal("删除失败！", data.retMsg, "error");
                    }
                },
                error : function() {
                    //  view("删除失败！");
                    if (${not empty sessionScope.isAjax}){
                        noAuth();
                    }else {
                        swal("连接错误", "请稍后重试", "error");
                    }
                }
            })

        });
    }

    function noAuth() {
        if (${not empty sessionScope.errorPage}){
            alert("权限不足！");
            window.location.href=errPage;
        }
    }
</script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>

</body>

</html>
