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
                    <h5>修改机构信息</h5>
                    <div class="ibox-tools">
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal m-t" role="form" id="orgModifyForm" action="modifyOrg" method="post" target="_self">
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="idModify">机构编号</label>
                            <div class="col-sm-8">
                            <input type="text" readonly unselectable="on" class="form-control" id="idModify" name="organizationId">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="nameModify">机构名称</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="nameModify" name="name">
                                <span class="help-block m-b-none"><i class="fa fa-info-circle"></i> 这里写点提示的内容</span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="provinceModify">省</label>
                            <div class="col-sm-8">
                            <input type="text" class="form-control" id="provinceModify" name="province">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="cityModify">市</label>
                            <div class="col-sm-8">
                            <input type="text" class="form-control" id="cityModify" name="city">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="districtModify">区</label>
                            <div class="col-sm-8">
                            <input type="text" class="form-control" id="districtModify" name="district">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="addressModify">地址</label>
                            <div class="col-sm-8">
                            <input type="text" class="form-control" id="addressModify" name="address">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="phoneModify">联系电话</label>
                            <div class="col-sm-8">
                            <input type="text" class="form-control" id="phoneModify" name="phone">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="numPeopleModify">规模人数</label>
                            <div class="col-sm-8">
                            <input type="number" class="form-control" id="numPeopleModify" name="numpeople">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2  control-label" for="abstractModify">机构简介</label>
                            <%--<textarea class="form-control" id="abstractModify" name="abstract"></textarea>--%>
                            <div class="col-sm-9 editHolder">
                                <textarea id="abstractModify" name="abstract">
                                    ${orgintroAb}
                                </textarea>
                            <%--<script id="abstractModify" type="text/plain" style="height:200px;">${orgintroAb}</script>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="courseModify">机构课程</label>
                            <%--<textarea class="form-control" id="courseModify" name="course"></textarea>--%>
                            <div class="col-sm-9 editHolder">
                                <textarea id="courseModify" name="course">
                                    ${orgintro.course}
                                </textarea>
                            <%--<script id="courseModify" type="text/plain" style="height:200px;">${orgintro.course}</script>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="serviceModify">提供服务</label>
                            <%--<textarea class="form-control" id="serviceModify" name="service"></textarea>--%>
                            <div class="col-sm-9 editHolder">
                                <textarea id="serviceModify" name="service">
                                    ${orgintro.service}
                                </textarea>
                            <%--<script id="serviceModify" type="text/plain" style="height:200px;">${orgintro.service}</script>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="hardwareModify">硬件设施</label>
                            <%--<textarea class="form-control" id="hardwareModify" name="hardware"></textarea>--%>
                            <div class="col-sm-9 editHolder">
                                <textarea id="hardwareModify" name="hardware">
                                    ${orgintro.hardware}
                                </textarea>
                            <%--<script id="hardwareModify" type="text/plain" style="height:200px;">${orgintro.hardware}</script>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="teamModify">治疗团队</label>
                            <%--<textarea class="form-control" id="teamModify" name="team"></textarea>--%>
                            <div class="col-sm-9 editHolder">
                                <textarea id="teamModify" name="team">
                                    ${orgintro.team}
                                </textarea>
                            <%--<script id="teamModify" type="text/plain" style="height:200px;">${orgintro.team}</script>--%>
                            </div>
                        </div>


                        <div style="text-align: center">
                            <button type="button" class="btn btn-primary" onclick="submitModify()">提交</button>
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

    var editIds = new Array('abstractModify','courseModify','serviceModify','hardwareModify','teamModify');
    var editors = new Array(editIds.length);

    function submitModify(){
        $('#orgModifyForm').ajaxSubmit(function(message) {
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
//        alert("开始初始化");
        $('#idModify').val('${org.id}');
        $('#nameModify').val('${org.name}');
        $('#provinceModify').val('${org.province}');
        $('#cityModify').val('${org.city}');
        $('#districtModify').val('${org.district}');
        $('#addressModify').val('${orgintro.address}');
        $('#phoneModify').val('${orgintro.phone}');
        $('#numPeopleModify').val('${org.numpeople}');

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

