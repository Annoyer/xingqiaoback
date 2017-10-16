<!DOCTYPE html>
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

    <title>家长管理</title>

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
                    <div class="row">
                        <div class="col-sm-11">
                            <h5>家长管理</h5>
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-primary btn-sm" data-toggle="modal" data-target="#addParentModal">添加家长</a>
                        </div>
                    </div>
                </div>
                <div class="ibox-content">
                    <div class="modal inmodal" id="addParentModal" tabindex="-1" role="dialog"  aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content animated fadeIn">
                                <div class="modal-header">
                                    <h4 class="modal-title">添加家长</h4>
                                </div>
                                <div class="modal-body">
                                    <form id="modifyUserForm" role="form" method="post" target="iframe0">
                                        <div class="form-group">
                                            <label for="usernameAdd">用户名</label>
                                            <input type="text" class="form-control" id="usernameAdd" name="username">
                                        </div>
                                        <div class="form-group">
                                            <label for="passwordAdd">密码</label>
                                            <input type="text" class="form-control" id="passwordAdd" name="password">
                                        </div>
                                        <div class="form-group">
                                            <label for="nameAdd">姓名</label>
                                            <input type="text" class="form-control" id="nameAdd" name="name">
                                        </div>
                                        <div class="form-group">
                                            <label for="pidAdd">身份证号</label>
                                            <input type="text" class="form-control" id="pidAdd" name="pid">
                                        </div>
                                        <div class="form-group">
                                            <label for="genderAdd">性别</label>
                                            <input type="text" class="form-control" id="genderAdd" name="gender">
                                        </div>
                                        <div class="form-group">
                                            <label for="groundAdd">区域</label>
                                            <input type="text" class="form-control" id="groundAdd" name="ground">
                                        </div>
                                        <div class="form-group">
                                            <label for="addressAdd">地址</label>
                                            <input type="text" class="form-control" id="addressAdd" name="address">
                                        </div>
                                        <div class="form-group">
                                            <label for="phoneAdd">手机</label>
                                            <input type="text" class="form-control" id="phoneAdd" name="phone">
                                        </div>
                                        <div class="form-group">
                                            <label for="emailAdd">邮箱</label>
                                            <input type="text" class="form-control" id="emailAdd" name="email">
                                        </div>



                                    </form>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
                                    <button type="button" class="btn btn-primary" onclick="submitParentsAdd()">保存</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <table class="table table-striped table-bordered table-hover " id="editable">
                        <thead>
                        <tr>
                            <th>家长ID</th>
                            <th>用户ID</th>
                            <th>姓名</th>
                            <th>住址</th>
                            <th>范围</th>
                            <th>手机</th>
                            <th>Email</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${parents}" var="p">
                        <tr class="gradeX" id="trId">
                            <td>${p.id}</td>
                            <td>${p.userid}</td>
                            <td>${p.realname}</td>
                            <td>${p.address}</td>
                            <td>${p.ground}</td>
                            <td>${p.phone}</td>
                            <td>${p.email}</td>

                            <td>
                                <a target="_self" href="parent_detail?parentId=${p.id}">账户管理</a>
                                <a target="_self" href="parent_demands?userId=${p.userid}">需求简历</a>
                                <a target="_self" href="parent_teachers?parentId=${p.id}">我的治疗师</a>
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


    function submitParentsAdd(){
        var username=$("#usernameAdd").val();
        var password=$("#passwordAdd").val();
        var name=$("#nameAdd").val();
        var pid=$("#pidAdd").val();
        var gender=$("#genderAdd").val();
        var ground=$("#groundAdd").val();
        var address=$("#addressAdd").val();
        var phone=$("#phoneAdd").val();
        var email=$("#emailAdd").val();


        $.ajax({
            type: "post",
            url: "addParent",
            timeout: 80000,
            dataType: "json",
            data: {
                "username":username,
                "password":password,
                "name":name,
                "pid":pid,
                "gender":gender,
                "ground":ground,
                "address": address,
                "phone":phone,
                "email": email,

            },
            //请求成功后的回调函数 data为json格式
            success: function (data) {
                if (data.retcode == 0)
                    sweetAlert("添加成功！");
                window.location.reload();
            },
            //请求出错的处理
            error: function () {
                alert("请求出错");
            }
        });
    }


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
