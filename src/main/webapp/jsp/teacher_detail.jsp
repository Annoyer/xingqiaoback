<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86761
  Date: 2017/9/16
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>治疗师信息</title>
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
    <a target="_self" href='teachers' class="btn btn-primary btn-sm">返回</a>
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>治疗师信息</h5>

                </div>
                <div class="ibox-content">
                    <form method="get" class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">ID</label>
                            <div class="col-sm-10">
                                <h6>${teacher.id}</h6>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户ID</label>
                            <div class="col-sm-10">
                                <h6>${teacher.userId}</h6>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户名</label>
                            <div class="col-sm-10">
                                <h6>${teacher.username}</h6>
                            </div>
                        </div>
                        <div class="hr-line-dashed"></div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">姓名</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" value="${teacher.name}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">简介</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" value="${teacher.abstractteacher}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">毕业院校</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" value="${teacher.school}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">所属机构</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" value="${teacher.unit}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">从业年限</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" value="${teacher.experienceAge}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">领域</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" value="${teacher.domain}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">治疗对象</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" value="${teacher.object}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">上门方式</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control"  value="${teacher.way}">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-4 col-sm-offset-2">
                                <button class="btn btn-primary">保存内容</button>
                                <a class="btn btn-white">取消</a>
                            </div>
                        </div>
                        <div class="hr-line-dashed"></div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">手机</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" value="${teacher.phone}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">邮箱</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control"  value="${teacher.email}">
                            </div>
                        </div>


                        <div class="form-group">
                            <label class="col-sm-2 control-label">密码</label>

                            <div class="col-sm-10">
                                <input type="password" class="form-control" name="password">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-4 col-sm-offset-2">
                                <button class="btn btn-primary" type="submit">保存内容</button>
                                <button class="btn btn-white" type="submit">取消</button>
                            </div>
                        </div>
                    </form>
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
