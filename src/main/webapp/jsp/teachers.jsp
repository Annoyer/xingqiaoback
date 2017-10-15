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
                    <div class="row">
                        <div class="col-sm-11">
                        <h5>治疗师管理</h5>
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-primary btn-sm" data-toggle="modal" data-target="#addTeacherModal">添加治疗师</a>
                        </div>
                    </div>
                </div>

                <div class="ibox-content">
                    <div class="modal inmodal" id="addTeacherModal" tabindex="-1" role="dialog"  aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content animated fadeIn">
                                <div class="modal-header">
                                    <h4 class="modal-title">添加治疗师</h4>
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
                                        <div class="form-group">
                                            <label for="schoolAdd">毕业院校</label>
                                            <input type="text" class="form-control" id="schoolAdd" name="school">
                                        </div>
                                        <div class="form-group">
                                            <label for="unitAdd">所属机构</label>
                                            <input type="text" class="form-control" id="unitAdd" name="unit">
                                        </div>
                                        <div class="form-group">
                                            <label for="tGroundAdd">治疗师地址</label>
                                            <input type="text" class="form-control" id="tGroundAdd" name="tGround">
                                        </div>
                                        <div class="form-group">
                                            <label for="sGroundAdd">治疗师上门地址</label>
                                            <input type="text" class="form-control" id="sGroundAdd" name="sGround">
                                        </div>
                                        <div class="form-group">
                                            <label for="domainAdd">康复领域</label>
                                            <input type="text" class="form-control" id="domainAdd" name="domain">
                                        </div>
                                        <div class="form-group">
                                            <label for="questionAdd">问题类型</label>
                                            <input type="text" class="form-control" id="questionAdd" name="question">
                                        </div>
                                        <div class="form-group">
                                            <label for="objectAdd">康复对象</label>
                                            <input type="text" class="form-control" id="objectAdd" name="object">
                                        </div>
                                        <div class="form-group">
                                            <label for="wayAdd">上门方式</label>
                                            <input type="text" class="form-control" id="wayAdd" name="way">
                                        </div>
                                        <div class="form-group">
                                            <label for="priceSAdd">学生上门价格</label>
                                            <input type="text" class="form-control" id="priceSAdd" name="priceS">
                                        </div>
                                        <div class="form-group">
                                            <label for="priceTAdd">治疗师上门价格</label>
                                            <input type="text" class="form-control" id="priceTAdd" name="priceT">
                                        </div>
                                        <div class="form-group">
                                            <label for="priceOAdd">在线授课价格</label>
                                            <input type="text" class="form-control" id="priceOAdd" name="priceO">
                                        </div>

                                    </form>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
                                    <button type="button" class="btn btn-primary" onclick="submitTeachersAdd()">保存</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <table class="table table-striped table-bordered table-hover " id="editable">
                        <thead>
                        <tr>
                            <th>治疗师ID</th>
                            <th>姓名</th>
                            <th>等级</th>
                            <th>所属机构</th>
                            <th>康复领域</th>
                            <th>治疗对象</th>
                            <th>从业年限</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${teachers}" var="t">
                            <tr class="gradeX" id="trId">
                                <td>${t.id}</td>
                                <td>${t.name}</td>
                                <td>${t.level}</td>
                                <td>${t.unit}</td>
                                <td>${t.domain}</td>
                                <td>${t.object}</td>
                                <td>${t.experienceAge}</td>
                                <td>
                                    <a target="_self" href="teacher_detail?id=${t.id}">治疗师详情</a>
                                    <a target="_self" href="teacher_sysuser?userId=${t.userId}">账户管理</a>
                                    <a target="_self" href="teacher_detail?id=${t.id}">我的患者</a>
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
    function submitTeachersAdd(){
        var username=$("#usernameAdd").val();
        var password=$("#passwordAdd").val();
        var name=$("#nameAdd").val();
        var pid=$("#pidAdd").val();
        var gender=$("#genderAdd").val();
        var address=$("#addressAdd").val();
        var phone=$("#phoneAdd").val();
        var email=$("#emailAdd").val();
        var school=$("#schoolAdd").val();
        var unit=$("#unitAdd").val();
        var tGround=$("#tGroundAdd").val();
        var sGround=$("#sGroundAdd").val();
        var domain=$("#domainAdd").val();
        var question=$("#questionAdd").val();
        var object=$("#objectAdd").val();
        var way=$("#wayAdd").val();
        var priceS=$("#priceSAdd").val();
        var priceT=$("#priceTAdd").val();
        var priceO=$("#priceOAdd").val();

        $.ajax({
            type: "post",
            url: "addTeacher",
            timeout: 80000,
            dataType: "json",
            data: {
                "username":username,
                "password":password,
                "name":name,
                "pid":pid,
                "gender":gender,
                "address": address,
                "phone":phone,
                "email": email,
                "school": school,
                "unit":unit,
                "tGround":tGround,
                "sGround":sGround,
                "domain": domain,
                "question":question,
                "object":object,
                "way":way,
                "priceS":priceS,
                "priceT":priceT,
                "priceO":priceO

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

</script>

</body>
</html>
