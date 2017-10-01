<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: joy12
  Date: 2017/9/16
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>机构管理</title>

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
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
                            <h5>机构管理</h5>
                        </div>
                        <div class="col-sm-1">
                            <a onclick="emptyModal()" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#organizationModal">添加机构</a>
                        </div>
                    </div>
                </div>
                <div class="ibox-content">
                    <table class="table table-striped table-bordered table-hover " id="editable">
                        <thead>
                        <tr>
                            <th>机构编号</th>
                            <th>机构名称</th>
                            <th>地区</th>
                            <th>地址</th>
                            <th>联系电话</th>
                            <th>规模人数</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${organizations}" var="orga">
                            <tr class="gradeX" data-id="${orga.id}" data-name="${orga.name}">
                                <td>${orga.id}</td>
                                <td>${orga.name}</td>
                                <td>${orga.province}-${orga.city}-${orga.district}</td>
                                <td>${orga.address}</td>
                                <td>${orga.phone}</td>
                                <td class="center">${orga.numpeople}</td>
                                <td class="center">
                                    <a onclick="detailOrganization(this)">查看</a>
                                    <a onclick="deleteOrganization(this)">删除</a>
                                    <a onclick="modifyOrganization(this)">修改</a>
                                </td>
                            </tr>
                        </c:forEach>

                        </tbody>
                    </table>
                    <div class="modal inmodal" id="detailModal" tabindex="-1" role="dialog"  aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content animated fadeIn">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                    <h4 id="orgName" class="modal-title">华爱儿童训练中心</h4>
                                </div>
                                <div class="modal-body">
                                    <div>
                                        <h4>机构简介</h4>
                                        <p id="orgAbstract">上海基督教青年会、女青年会本着 “服务社会、造福人群”的宗旨和“倡导爱心传递”的理念，充分利用自身海内外的资源优势，在香港那打素基金会和香港基督教服务处的支持下，结合专业发展需要，于2008年1月成立了华爱儿童训练中心。招生对象为肢体残疾儿童、听力言语残疾儿童、视力残疾儿童、智力残疾儿童、孤独症（自闭症）儿童。</p>
                                    </div>
                                    <div>
                                        <h4>机构课程</h4>
                                        <p id="orgCourse">感统训练、音乐分享、精细训练、自理训练、社交训练、视听训练，家长沙龙、亲子活动</p>
                                    </div>
                                    <div>
                                        <h4>提供服务</h4>
                                        <p id="orgService">是提供专业的社工介入，注重家长的辅导和支持工作。以一对一形式个别辅导孩子智能、语言、自理等方面的学习。 以小组形式学习社交、参与游戏、练习大小肌肉，让孩子互相了解、增加来往接触和模仿学习的机会，激发孩子的学习动机和兴趣。</p>
                                    </div>
                                    <div>
                                        <h4>硬件设施</h4>
                                        <p id="orgHardware">暂无介绍</p>
                                    </div>
                                    <div>
                                        <h4>治疗团队</h4>
                                        <p id="orgTeam">暂无介绍</p>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal inmodal" id="organizationModal" tabindex="-1" role="dialog"  aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content animated fadeIn">
                                <div class="modal-header">

                                    <h4 class="modal-title">添加机构</h4>

                                </div>
                                <div class="modal-body">
                                    <form id="addOrgForm" role="form" method="post" action="addOrg" target="iframe0">
                                        <div class="form-group">
                                            <label for="name">机构名称</label>
                                            <input type="text" class="form-control" id="name" name="name">
                                        </div>
                                        <div class="form-group">
                                            <label for="province">省</label>
                                            <input type="text" class="form-control" id="province" name="province">
                                        </div>
                                        <div class="form-group">
                                            <label for="city">市</label>
                                            <input type="text" class="form-control" id="city" name="city">
                                        </div>
                                        <div class="form-group">
                                            <label for="district">区</label>
                                            <input type="text" class="form-control" id="district" name="district">
                                        </div>
                                        <div class="form-group">
                                            <label for="address">地址</label>
                                            <input type="text" class="form-control" id="address" name="address">
                                        </div>
                                        <div class="form-group">
                                            <label for="phone">联系电话</label>
                                            <input type="text" class="form-control" id="phone" name="phone">
                                        </div>
                                        <div class="form-group">
                                            <label for="numPeople">规模人数</label>
                                            <input type="number" class="form-control" id="numPeople" name="numpeople">
                                        </div>
                                        <div class="form-group">
                                            <label for="abstract">机构简介</label>
                                            <textarea class="form-control" id="abstract" name="abstract"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label for="course">机构课程</label>
                                            <textarea class="form-control" id="course" name="course"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label for="service">提供服务</label>
                                            <textarea class="form-control" id="service" name="service"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label for="hardware">硬件设施</label>
                                            <textarea class="form-control" id="hardware" name="hardware"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label for="team">治疗团队</label>
                                            <textarea class="form-control" id="team" name="team"></textarea>
                                        </div>
                                    </form>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
                                    <button type="button" class="btn btn-primary" onclick="submitAdd()">保存</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal inmodal" id="modifyModal" tabindex="-1" role="dialog"  aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content animated fadeIn">
                                <div class="modal-header">

                                    <h4 class="modal-title">修改机构信息</h4>

                                </div>
                                <div class="modal-body">
                                    <form id="modifyOrgForm" role="form" method="post" action="modifyOrg" target="iframe0">
                                        <div class="form-group">
                                            <label for="idModify">机构编号</label>
                                            <input type="text" readonly unselectable="on" class="form-control" id="idModify" name="organizationId">
                                        </div>
                                        <div class="form-group">
                                            <label for="nameModify">机构名称</label>
                                            <input type="text" class="form-control" id="nameModify" name="name">
                                        </div>
                                        <div class="form-group">
                                            <label for="provinceModify">省</label>
                                            <input type="text" class="form-control" id="provinceModify" name="province">
                                        </div>
                                        <div class="form-group">
                                            <label for="cityModify">市</label>
                                            <input type="text" class="form-control" id="cityModify" name="city">
                                        </div>
                                        <div class="form-group">
                                            <label for="districtModify">区</label>
                                            <input type="text" class="form-control" id="districtModify" name="district">
                                        </div>
                                        <div class="form-group">
                                            <label for="addressModify">地址</label>
                                            <input type="text" class="form-control" id="addressModify" name="address">
                                        </div>
                                        <div class="form-group">
                                            <label for="phoneModify">联系电话</label>
                                            <input type="text" class="form-control" id="phoneModify" name="phone">
                                        </div>
                                        <div class="form-group">
                                            <label for="numPeopleModify">规模人数</label>
                                            <input type="number" class="form-control" id="numPeopleModify" name="numpeople">
                                        </div>
                                        <div class="form-group">
                                            <label for="abstractModify">机构简介</label>
                                            <textarea class="form-control" id="abstractModify" name="abstract"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label for="courseModify">机构课程</label>
                                            <textarea class="form-control" id="courseModify" name="course"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label for="serviceModify">提供服务</label>
                                            <textarea class="form-control" id="serviceModify" name="service"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label for="hardwareModify">硬件设施</label>
                                            <textarea class="form-control" id="hardwareModify" name="hardware"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label for="teamModify">治疗团队</label>
                                            <textarea class="form-control" id="teamModify" name="team"></textarea>
                                        </div>
                                    </form>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
                                    <button type="button" class="btn btn-primary" onclick="submitModify()">保存</button>
                                </div>
                            </div>
                        </div>
                    </div>

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

    function detailOrganization(obj){
        var id = obj.parentNode.parentNode.getAttribute("data-id");
        var name = obj.parentNode.parentNode.getAttribute("data-name");
        //后台获取机构具体信息并充填modal
        $.ajax({
            url:'getSingleOrg',// 跳转到 action
            data:{
                organizationId : id
            },
            type:'post',
            dataType:'json',
            success:function(data) {
                $('#orgName').text(name);
                $('#orgAbstract').text(data.orgintro.abstract);
                $('#orgCourse').text(data.orgintro.course);
                $('#orgHardware').text(data.orgintro.hardware);
                $('#orgService').text(data.orgintro.service);
                $('#orgTeam').text(data.orgintro.team);

                $('#detailModal').modal();
            },
            error : function() {
                // view("异常！");
                swal("连接错误", "获取数据异常", "error");
            }
        })
    }

    function emptyModal(){
        $('#name').val("");
        $('#address').val("");
        $('#province').val("");
        $('#city').val("");
        $('#district').val("");
        $('#phone').val("");
        $('#numPeople').val("");
        $('#abstrct').val("");
        $('#course').val("");
        $('#service').val("");
        $('#hardware').val("");
        $('#team').val("");
    }

    function submitAdd() {
        $('#addOrgForm').ajaxSubmit(function(message) {
            if (message==null || message.length==0 || message.indexOf("<html>") >= 0) {
                window.location.reload();
            } else if (eval("(" + message + ")").errorPage!=null){
                swal({title: "添加失败！",
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

            }
        });
    }

    function deleteOrganization(obj){
        swal({
            title: "您确定要删除这条信息吗",
            text: "删除后将无法恢复，请谨慎操作！",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "删除",
            closeOnConfirm: false
        }, function () {
            var id = obj.parentNode.parentNode.getAttribute("data-id");
            $.ajax({
                url:'deleteOrg',// 跳转到 action
                data:{
                    organizationId : id
                },
                type:'post',
                dataType:'json',
                success:function(data) {
                    if (data.errorPage!=null){
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
                        swal("删除成功！", "您已经永久删除了这条信息。", "success");
                        window.location.reload();
                    }

                },
                error : function(data) {
                  //  alert(data.errorPage);
                  //  view("删除失败！");
                    if (${not empty sessionScope.isAjax}){
                        noAuth();
                    }else {
                        alert("删除失败！");
                    }
                }
            })

        });
    }

    function submitModify(){
        $('#modifyOrgForm').ajaxSubmit(function(message) {
//            alert(message);
            if (message==null || message.length==0 || message.indexOf("<html>") >= 0) {
                window.location.reload();
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
                window.location.reload();
            }
        });

    }

    function modifyOrganization(obj){
        var tr=obj.parentNode.parentNode;
        var arr=tr.childNodes;
        var id=tr.getAttribute("data-id")
        $('#idModify').val(id);
        $('#nameModify').val(arr[3].innerText);

        var strs = arr[5].innerText.split("-",3)
        $('#provinceModify').val(strs[0]);
        $('#cityModify').val(strs[1]);
        $('#districtModify').val(strs[2]);

        $('#addressModify').val(arr[7].innerText);
        $('#phoneModify').val(arr[9].innerText);
        $('#numPeopleModify').val(arr[11].innerText);

        //继续获取单个组织具体信息并充填
        $.ajax({
            url:'getSingleOrg',// 跳转到 action
            data:{
                organizationId : id
            },
            type:'post',
            dataType:'json',
            success:function(data) {
                $('#abstractModify').text(data.orgintro.abstract);
                $('#courseModify').text(data.orgintro.course);
                $('#hardwareModify').text(data.orgintro.hardware);
                $('#serviceModify').text(data.orgintro.service);
                $('#teamModify').text(data.orgintro.team);

                $('#modifyModal').modal();
            },
            error : function() {
                // view("异常！");
                if (${not empty sessionScope.isAjax}){
                    noAuth();
                }else {
                    alert("获取数据异常");
                }

            }
        })
    }

    function noAuth() {
        if (${not empty sessionScope.errorPage}){
            alert("权限不足！");
            window.location.href=errPage;
        }
    }
</script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>

</body>

</html>
