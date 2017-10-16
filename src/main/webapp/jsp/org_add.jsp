<%--
  Created by IntelliJ IDEA.
  User: joy12
  Date: 2017/10/2
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>机构管理</title>

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="css/plugins/simditor/simditor.css" />


    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>添加机构</h5>
                    <div class="ibox-tools">
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal m-t" id="orgAddForm" action="addOrg" method="post" target="_self">
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="nameAdd">机构名称</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="nameAdd" name="name">
                                <span class="help-block m-b-none"><i class="fa fa-info-circle"></i>这里写点提示的内容</span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="provinceAdd">省</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="provinceAdd" name="province">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="cityAdd">市</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="cityAdd" name="city">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="districtAdd">区</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="districtAdd" name="district">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="addressAdd">地址</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="addressAdd" name="address">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="phoneAdd">联系电话</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="phoneAdd" name="phone">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="numPeopleAdd">规模人数</label>
                            <div class="col-sm-8">
                                <input type="number" class="form-control" id="numPeopleAdd" name="numpeople">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2  control-label" for="abstractAdd">机构简介</label>
                            <div class="col-sm-9 editHolder">
                                <textarea id="abstractAdd" name="abstract">
                                </textarea>
                                <%--<script id="abstractAdd" type="text/plain" style="height:200px;">${orgintroAb}</script>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="courseAdd">机构课程</label>
                            <div class="col-sm-9 editHolder">
                                <textarea id="courseAdd" name="course">
                                </textarea>
                                <%--<script id="courseAdd" type="text/plain" style="height:200px;">${orgintro.course}</script>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="serviceAdd">提供服务</label>
                            <div class="col-sm-9 editHolder">
                                <textarea id="serviceAdd" name="service">
                                </textarea>
                                <%--<script id="serviceAdd" type="text/plain" style="height:200px;">${orgintro.service}</script>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="hardwareAdd">硬件设施</label>
                            <div class="col-sm-9 editHolder">
                                <textarea id="hardwareAdd" name="hardware">
                                </textarea>
                                <%--<script id="hardwareAdd" type="text/plain" style="height:200px;">${orgintro.hardware}</script>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="teamAdd">治疗团队</label>
                            <div class="col-sm-9 editHolder">
                                <textarea id="teamAdd" name="team">
                                </textarea>
                                <%--<script id="teamAdd" type="text/plain" style="height:200px;">${orgintro.team}</script>--%>
                            </div>
                        </div>


                        <div style="text-align: center">
                            <button type="button" class="btn btn-primary" onclick="submitAdd()">提交</button>
                        </div>


                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.5"></script>
<script src="js/content.min.js?v=1.0.0"></script>
<script src="js/plugins/sweetalert/sweetalert.min.js"></script>
<script src="js/plugins/validate/jquery.validate.min.js"></script>
<script src="js/plugins/validate/messages_zh.min.js"></script>
<script src="js/demo/form-validate-demo.min.js"></script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>

<script type="text/javascript" src="js/plugins/simditor/module.js"></script>
<script type="text/javascript" src="js/plugins/simditor/uploader.js"></script>
<script type="text/javascript" src="js/plugins/simditor/hotkeys.js"></script>
<script type="text/javascript" src="js/plugins/simditor/simditor.js"></script>
<script>
    var mytoolbar = [
        'title',
        'bold',
        'italic',
        'underline',
        'strikethrough',
        //  'fontScale',
        'color',
        'ol',
        'ul',
        'blockquote',
        'table',
        'link',
        'image',
        'hr',
        'indent',
        'outdent'
//        'alignment'
    ];

    var editIds = new Array('abstractAdd','courseAdd','serviceAdd','hardwareAdd','teamAdd');
    var editors = new Array(editIds.length);

    function submitAdd(){
        alert("add");
        $('#orgAddForm').ajaxSubmit(function(message) {
            if (message==null || message.length==0 || message.indexOf("<html>") >= 0) {
                window.location.href = "organizations";
            } else if (eval("(" + message + ")").errorPage!=null){
                swal({title: "修改失败！",
                    text: "用户权限不足",
                    type: "info",
                    showCancelButton: true,
                    confirmButtonColor: "#DD6B55",
                    confirmButtonText: "重新登陆",
                    cancelButtonText: "返回",
                    closeOnConfirm: false},function (isConfirm) {
                    if (isConfirm){
                        window.location.href=eval("(" + message + ")").errorPage;
                    }
                });
            }else {
                window.location.href = "organizations";
            }
        });

    }

    $(document).ready(function(){
        for (var i=0; i<editIds.length; i++){
            editors[i] = new Simditor({
                textarea:$("#"+editIds[i]),
                defaultImage:"img/a9.jpg",
//                pasteImage: true,
                toolbar:mytoolbar,
                upload:{
                    url: '/jsp/saveImg',
                    fileKey: "imgFile",
                    leaveConfirm: "正在上传,确定要取消上传文件吗?"
                }
            })
        }

    });



</script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>

</body>

</html>

