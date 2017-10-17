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
    <title>简历详情</title>
    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <!-- Data Tables -->
    <link href="css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">
    <link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

    <!-- Calendar -->
    <link href="css/plugins/iCheck/custom.css" rel="stylesheet">

    <link href="css/plugins/fullcalendar/fullcalendar.css" rel="stylesheet">
    <link href="css/plugins/fullcalendar/fullcalendar.print.css" rel="stylesheet" media="print">
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <a target="_self" href='parent_demands?userId=${demand.userId}' class="btn btn-primary btn-sm">返回</a>
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>简历详情</h5>
                </div>

                <div class="ibox-content">
                    <form method="get" class="form-horizontal" id="myForm">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">ID</label>
                            <div class="col-sm-10" id="idDiv">
                                <p class="form-control-static">${demand.id}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">姓名</label>
                            <div class="col-sm-10" id="nameDiv">
                                <p class="form-control-static">${demand.name}</p>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">性别</label>
                            <div class="col-sm-10" id="genderDiv">
                                <p class="form-control-static">${demand.gender}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">生日</label>
                            <div class="col-sm-10" id="birthdayDiv">
                                <p class="form-control-static">${demand.birthday}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">病症</label>
                            <div class="col-sm-10" id="diseaseDiv">
                                <p class="form-control-static">${demand.disease}</p>
                            </div>
                        </div>


                        <div class="form-group">
                            <div class="col-sm-4 col-sm-offset-2">
                                <a class="btn btn-primary" id="modifyBtn" onclick="modifyFunc()" style="display: inline">修改信息</a>
                                <a class="btn btn-primary" id="saveBtn" onclick="saveFunc1()" style="display: none">保存内容</a>
                                <a class="btn btn-default" id="cancelBtn" onclick="inputOff()" style="display: none">取消</a>
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
        var name=$("#name").val();
        var gender=$("#gender").val();
        var birthday=$("#birthday").val();
        var disease=$("#disease").val();
        if(name=="") sweetAlert("姓名不能为空哦~");
        else{
            $.ajax({
                type: "post",
                url: "saveDemandInfo",
                timeout: 80000,
                dataType: "json",
                data: {
                    "demandId":${demand.id},
                    "name":name,
                    "gender":gender,
                    "birthday":birthday,
                    "disease":disease

                },
                //请求成功后的回调函数 data为json格式
                success: function (data) {
                    if (data.retcode == 0)
                        sweetAlert("保存成功！");
                    window.location.reload();
                },
                //请求出错的处理
                error: function () {
                    alert("请求出错");
                }
            });

        }
    }
    function inputOff(){
        document.getElementById("nameDiv").innerHTML="<p class=\"form-control-static\">${demand.name}</p>";
        document.getElementById("genderDiv").innerHTML="<p class=\"form-control-static\">${demand.gender}</p>";
        document.getElementById("birthdayDiv").innerHTML="<p class=\"form-control-static\">${demand.birthday}</p>";
        document.getElementById("diseaseDiv").innerHTML="<p class=\"form-control-static\">${demand.disease}</p>";


        document.getElementById("modifyBtn").setAttribute("style","display:inline");
        document.getElementById("saveBtn").setAttribute("style","display:none");
        document.getElementById("cancelBtn").setAttribute("style","display:none");
    }


    function modifyFunc() {

        document.getElementById("nameDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"name\" value=\"${demand.name}\">";
        document.getElementById("genderDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"gender\" value=\"${demand.gender}\">";
        document.getElementById("birthdayDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"birthday\" value=\"${demand.birthday}\">";
        document.getElementById("diseaseDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"disease\" value=\"${demand.disease}\">";


        document.getElementById("modifyBtn").setAttribute("style","display:none");
        document.getElementById("saveBtn").setAttribute("style","display:inline");
        document.getElementById("cancelBtn").setAttribute("style","display:inline");
    }






</script>




</body>
</html>
