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
                                <th>治疗方向</th>
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
                                    <td>${o.recoverOb}</td>
                                    <td>${o.sTime}</td>
                                    <td><a target="_self" href="order_detail?orderId=${o.id}&teacherId=${o.teacherId}&parentId=${o.parentId}&demandId=${o.demandId}">订单详情</a></td>
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
    var orders;
    $(document).ready(function(){
        $(".dataTables-example").dataTable();
        var oTable=$("#editable").dataTable();

//        oTable.$("td").editable("../example_ajax.php", {
//            "callback":function(sValue,y){
//                var aPos=oTable.fnGetPosition(this);
//                oTable.fnUpdate(sValue,aPos[0],aPos[1])
//            },"submitdata":function(value,settings){
//                return{
//                    "row_id":this.parentNode.getAttribute("id"),
//                    "column":oTable.fnGetPosition(this)[2]
//                }
//            },"width":"90%","height":"100%"
//        })

        <%--var tbody = $("#tableBody");--%>
        <%--orders = "${orders}";--%>
        <%--for (var i=0; i<orders.length; i++){--%>
            <%--var row = '<tr class="gradeX" data-index="' + i--%>
                <%--+ '"> <td>' + orders[i].id--%>
                <%--+ '</td><td>' + orders[i].teacherName--%>
                <%--+ '</td><td>' + orders[i].parentName--%>
                <%--+ '</td><td>' + orders[i].demandName--%>
                <%--+ '</td><td>' + orders[i].recoverOb--%>
                <%--+ '</td><td>' + orders[i].sTime--%>
                <%--+ '</td>';--%>
            <%--if (orders[i].isdeleted == true){--%>
                <%--row += '<td>已取消</td>';--%>
            <%--} else if (orders[i].complete == 1) {//???--%>
                <%--row += '<td>已完成</td>';--%>
            <%--} else {--%>
                <%--row += '<td>进行中</td>';--%>
            <%--}--%>

            <%--row += '<td class="center"><a href="javascript:void(0)" onclick="toOrderDetail('--%>
                <%--+ i +')">查看详情</a></td></tr>';--%>

            <%--tbody.append(row);--%>
        <%--}--%>
    });

    function toOrderDetail(index){
        window.location.href="order_detail?orderId=" + orders[index].id
            + "&teacherId=" + orders[index].teacherId
            + "&parentId=" + orders[index].parentId
            + "&demandId=" + orders[index].demandId;
        //从后台获取单个康复日志
    };
</script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>

</body>

</html>
