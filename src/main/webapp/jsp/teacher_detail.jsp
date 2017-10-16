<!DOCTYPE html>
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
                    <h5>账户管理</h5>
                </div>
                <div class="ibox-content">
                    <div class="modal inmodal" id="modifyModal" tabindex="-1" role="dialog"  aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content animated fadeIn">
                                <div class="modal-header">
                                    <h4 class="modal-title">修改账户信息</h4>
                                </div>
                                <div class="modal-body">
                                    <form id="modifyUserForm" role="form" method="post" target="iframe0" onsubmit="submitUserModify()">
                                        <div class="form-group">
                                            <label for="idModify">用户Id</label>
                                            <input type="text" readonly unselectable="on" class="form-control" id="idModify" name="userId">
                                        </div>
                                        <div class="form-group">
                                            <label for="phoneModify">手机</label>
                                            <input type="text" class="form-control" id="phoneModify" name="phone">
                                        </div>
                                        <div class="form-group">
                                            <label for="emailModify">邮箱</label>
                                            <input type="text" class="form-control" id="emailModify" name="email">
                                        </div>
                                    </form>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
                                    <button type="button" class="btn btn-primary" onclick="submitUserModify()">保存</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal inmodal" id="modifyPwModal" tabindex="-1" role="dialog"  aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content animated fadeIn">
                                <div class="modal-header">
                                    <h4 class="modal-title">修改密码</h4>
                                </div>
                                <div class="modal-body">
                                    <form id="modifyPwForm" role="form" method="post" target="iframe0" onsubmit="submitPwModify()">
                                        <div class="form-group">
                                            <label for="pwOld">旧密码</label>
                                            <input type="text" readonly unselectable="on" class="form-control" id="pwOld" name="pwOld">
                                        </div>
                                        <div class="form-group">
                                            <label for="pwModify">新密码</label>
                                            <input type="text" class="form-control" id="pwModify" name="pw">
                                        </div>
                                    </form>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
                                    <button type="button" class="btn btn-primary" onclick="submitPwModify()">保存</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <form method="get" class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">ID</label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${teacher.id}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户ID</label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${teacher.userId}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户名</label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${teacher.username}</p>
                            </div>
                        </div>
                        <div class="hr-line-dashed"></div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">手机</label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${teacher.phone}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">邮箱</label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${teacher.email}</p>
                            </div>

                        </div>
                        <div class="form-group">
                            <div class="col-sm-4 col-sm-offset-2">
                                <a class="btn btn-primary" onclick="modifyUserFunc()">修改账户信息</a>
                                <a class="btn btn-warning" onclick="modifyPwFunc()">修改密码</a>
                                <a class="btn btn-danger" id="deleteBtn">删除账户</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>账户管理</h5>
                            </div>
                            <div class="ibox-content">
                                <form method="get" class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">姓名</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="name" value="${teacher.name}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">简介</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="abstractT" value="${teacher.abstractteacher}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">从业年限</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="experienceAge" value="${teacher.experienceAge}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">毕业院校</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="school" value="${teacher.school}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">所属机构</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="unit" value="${teacher.unit}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">领域</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="domain" value="${teacher.domain}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">治疗对象</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="object" value="${teacher.object}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">上门方式</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="way" value="${teacher.way}">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-4 col-sm-offset-2">
                                <a class="btn btn-primary" onclick="saveFunc1()">保存内容</a>
                            </div>
                        </div>
                        <div class="hr-line-dashed"></div>


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
    function saveFunc1(){
        var teacherId = ${teacher.id};
        var name=$("#name").val();
        var abstractT=$("#abstractT").val();
        var experienceAge=$("#experienceAge").val();
        var school=$("#school").val();
        var unit=$("#unit").val();
        var domain=$("#domain").val();
        var object=$("#object").val();
        var way=$("#way").val();

        if(name=="") sweetAlert("姓名不能为空哦~");
        else{
            $.ajax({
                type: "post",
                url: "saveTeacherInfo",
                timeout: 80000,
                dataType: "json",
                data: {
                    "teacherId":teacherId,
                    "name":name,
                    "abstractT":abstractT,
                    "experienceAge":experienceAge,
                    "school": school,
                    "unit": unit,
                    "domain": domain,
                    "object": object,
                    "way": way
                },
                //请求成功后的回调函数 data为json格式
                success: function (data) {
                    if (data.retcode == 0)
                        sweetAlert("保存成功！");
                },
                //请求出错的处理
                error: function () {
                    alert("请求出错");
                }
            });
        }
    }
    function submitUserModify(){
        var phone=$("#phoneModify").val();
        var email=$("#emailModify").val();
        var userId=${teacher.userId};

            $.ajax({
                type: "post",
                url: "modifyUser",
                timeout: 80000,
                dataType: "json",
                data: {
                    "userId":userId,
                    "phone": phone,
                    "email":email
                },
                //请求成功后的回调函数 data为json格式
                success: function (data) {
                    if (data.retcode == 0)
                        sweetAlert("修改成功！");
                      window.location.reload();
                },
                //请求出错的处理
                error: function () {
                    alert("请求出错");
                }
            });

    }
    function modifyUserFunc(){
        var userId=${teacher.userId};
        $.ajax({
            url:'getSysuserInfo',
            data:{
                "userId" : userId
            },
            type:'post',
            dataType:'json',
            success:function(data) {
                $('#idModify').val(userId);
                $('#phoneModify').val(data.user.phone);
                $('#emailModify').val(data.user.email);

                $('#modifyModal').modal();
            },
            error : function() {
                // view("异常！");
                alert("获取数据异常");
            }
        })
    }
    function modifyPwFunc(){
        var userId=${teacher.userId};
        $.ajax({
            type: "post",
            url: "getSysuserInfo",
            timeout: 80000,
            dataType: "json",
            data: {
                "userId":userId,
            },
            //请求成功后的回调函数 data为json格式
            success: function (data) {
                $('#pwOld').val(data.user.password);
                $('#modifyPwModal').modal();
            },
            //请求出错的处理
            error: function () {
                alert("请求出错");
            }
        });
    }
    function submitPwModify(){
        var pw=$("#pwModify").val();
        $.ajax({
            type: "post",
            url: "modifyPw",
            timeout: 80000,
            dataType: "json",
            data: {
                "userId":${teacher.userId},
                "pw":pw
            },
            success: function (data) {
                if (data.retcode == 0)
                    sweetAlert("修改成功！");
            },
            //请求出错的处理
            error: function () {
                alert("请求出错");
            }
        });
    }

    $(document).ready(function(){
        $("#deleteBtn").click(function(){
            swal({
                title: "您确定要删除该账户吗",
                text: "删除后将无法恢复，请谨慎操作！",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#DD6B55",
                confirmButtonText: "删除",
                closeOnConfirm: false
            }, function () {
                $.ajax({
                    type: "post",
                    url: "deleteTeacher",
                    timeout: 80000,
                    dataType: "json",
                    data: {
                        "teacherId":${teacher.id},
                        "userId":${teacher.userId}
                    },
                    success: function (data) {
                        if (data.retcode == 0)
                            swal("删除成功！", "您已经永久删除了这条信息。", "success");
                            window.location.href="teachers";
                    },
                    //请求出错的处理
                    error: function () {
                        alert("请求出错");
                    }
                });

            });
        });
    });



</script>

</body>
</html>
