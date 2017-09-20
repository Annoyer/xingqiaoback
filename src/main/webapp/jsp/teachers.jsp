<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86761
  Date: 2017/9/16
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>治疗师管理</title>

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
                    <h5>治疗师管理</h5>
                </div>
                <div class="ibox-content">
                    <table class="table table-striped table-bordered table-hover " id="editable">
                        <thead>
                        <tr>
                            <th>治疗师ID</th>
                            <th>用户ID</th>
                            <th>姓名</th>
                            <th>等级</th>
                            <th>住址</th>
                            <th>所属机构</th>
                            <th>从业年限</th>
                            <th>简介</th>
                            <th>领域</th>
                            <th>治疗对象</th>
                            <th>性别</th>
                            <th>手机</th>
                            <th>email</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${teachers}" var="t">
                            <tr class="gradeX" id="trId">
                                <td>${t.id}</td>
                                <td>${t.userId}</td>
                                <td>${t.name}</td>
                                <td>${t.level}</td>
                                <td>${t.detailaddress}</td>
                                <td>${t.unit}</td>
                                <td>${t.experienceAge}</td>
                                <td>${t.abstractteacher}</td>
                                <td>${t.domain}</td>
                                <td>${t.object}</td>
                                <td>${t.gender}</td>
                                <td>${t.phone}</td>
                                <td>${t.email}</td>
                                <td>
                                    <a target="_self" href="teacher_detail?id=${t.id}">账户管理</a>
                                    <a target="_self" href="parent_demands?userId=${p.userid}">治疗师订单</a>
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
    $(document).ready(function(){$(".dataTables-example").dataTable();var oTable=$("#editable").dataTable();});function fnClickAddRow(){$("#editable").dataTable().fnAddData(["Custom row","New row","New row","New row","New row"])};
</script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>

<script type="text/javascript">
    $(document).ready(function(){
        $("#modifyBtn").click(function(){
            tr=$(this).parent().parent();
            var arr=tr.children();
            $('#userId').val(arr[0].innerText);
            $('#name').val(arr[1].innerText);
            $('#pid').val(arr[2].innerText);
            $('#address').val(arr[3].innerText);
            $('#phone').val(arr[4].innerText);
            $('#email').val(arr[5].innerText);
        });
        $("#insertBtn").click(function(){
            $('#userId').val("");
            $('#name').val("");
            $('#pid').val("");
            $('#address').val("");
            $('#phone').val("");
            $('#email').val("");
        });
        $("#deleteBtn").click(function(){
            swal({
                title: "您确定要删除这条信息吗",
                text: "删除后将无法恢复，请谨慎操作！",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#DD6B55",
                confirmButtonText: "删除",
                closeOnConfirm: false
            }, function () {
                //后台数据库操作……
                swal("删除成功！", "您已经永久删除了这条信息。", "success");
            });
        });
    });



</script>

</body>
</html>
