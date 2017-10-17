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

    <!-- Calendar -->
    <link href="css/plugins/iCheck/custom.css" rel="stylesheet">

    <link href="css/plugins/fullcalendar/fullcalendar.css" rel="stylesheet">
    <link href="css/plugins/fullcalendar/fullcalendar.print.css" rel="stylesheet" media="print">
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <a target="_self" href='teachers' class="btn btn-primary btn-sm">返回</a>
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>治疗师资料</h5>
                            </div>

                            <div class="ibox-content">
                                <form method="get" class="form-horizontal" id="myForm">

                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">姓名</label>
                                        <div class="col-sm-10" id="nameDiv">
                                            <p class="form-control-static">${teacher.name}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">PID</label>
                                        <div class="col-sm-10" id="pidDiv">
                                            <p class="form-control-static">${teacher.pid}</p>
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label class="col-sm-2 control-label">地址</label>
                                        <div class="col-sm-10" id="addressDiv">
                                            <p class="form-control-static">${teacher.address}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">具体地址</label>
                                        <div class="col-sm-10" id="detailaddressDiv">
                                            <p class="form-control-static">${teacher.detailaddress}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">简介</label>
                                        <div class="col-sm-10" id="abstractDiv">
                                            <p class="form-control-static">${teacher.abstractteacher}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">从业年限</label>
                                        <div class="col-sm-10" id="experienceAgeDiv">
                                            <p class="form-control-static">${teacher.experienceAge}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">毕业院校</label>
                                        <div class="col-sm-10" id="schoolDiv">
                                            <p class="form-control-static">${teacher.school}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">所属机构</label>
                                        <div class="col-sm-10" id="unitDiv">
                                            <p class="form-control-static">${teacher.unit}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">领域</label>
                                        <div class="col-sm-10" id="domainDiv">
                                            <p class="form-control-static">${teacher.domain}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">擅长问题</label>
                                        <div class="col-sm-10" id="questionDiv">
                                            <p class="form-control-static">${teacher.question}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">治疗对象</label>
                                        <div class="col-sm-10" id="objectDiv">
                                            <p class="form-control-static">${teacher.object}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">上门方式</label>
                                        <div class="col-sm-10" id="wayDiv">
                                            <p class="form-control-static">${teacher.way}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">治疗师上门价格</label>
                                        <div class="col-sm-10" id="priceTDiv">
                                            <p class="form-control-static">${teacher.priceT}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">学生上门价格</label>
                                        <div class="col-sm-10" id="priceSDiv">
                                            <p class="form-control-static">${teacher.priceS}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">在线授课价格</label>
                                        <div class="col-sm-10" id="priceODiv">
                                            <p class="form-control-static">${teacher.priceO}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">治疗师上门区域</label>
                                        <div class="col-sm-10" id="tGroundDiv">
                                            <p class="form-control-static">${teacher.tGround}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">学生上门区域</label>
                                        <div class="col-sm-10" id="sGroundDiv">
                                            <p class="form-control-static">${teacher.sGround}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">日程</label>
                                        <div class="col-sm-10">
                                            <p class="form-control-static">${teacher.schedule}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-sm-4 col-sm-offset-2">
                                            <a class="btn btn-primary" id="modifyBtn" onclick="modifyFunc()" style="display: inline">修改治疗师信息</a>
                                            <a class="btn btn-primary" id="saveBtn" onclick="saveFunc1()" style="display: none">保存内容</a>
                                            <a class="btn btn-default" id="cancelBtn" onclick="inputOff()" style="display: none">取消</a>
                                        </div>
                                    </div>
                                    <div class="hr-line-dashed"></div>


                    </form>
                </div>
                <div class="ibox-content">
                    <div id="calendar"></div>
                    <div class="form-group">
                            <a class="btn btn-primary" id="saveScheduleBtn" style="display: inline">保存当前日程表</a>
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
    $(document).ready(function(){$(".dataTables-example").dataTable();var oTable=$("#editable").dataTable();});function fnClickAddRow(){$("#editable").dataTable().fnAddData(["Custom row","New row","New row","New row","New row"])};
</script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>

<script src="js/jquery-ui.custom.min.js"></script>
<script src="js/plugins/iCheck/icheck.min.js"></script>
<script src="js/plugins/fullcalendar/fullcalendar.min.js"></script>
<script>
    $(document).ready(function(){
        $(".i-checks").iCheck({
            checkboxClass:"icheckbox_square-green",
            radioClass:"iradio_square-green",
        });
        $("#external-events div.external-event").each(function(){
            var d={title:$.trim($(this).text())};
            $(this).data("eventObject",d);
            $(this).draggable({zIndex:999,revert:true,revertDuration:0})
        });
        var b=new Date();
        var c=b.getDate();
        var a=b.getMonth();
        var e=b.getFullYear();
        var day=b.getDay();  //星期天：0
        if(day=='0') day=7;
        var str="${teacher.schedule}";
        var arr=0;
        if(str!=""){
            arr=str.split('#');
        }

        $("#calendar").fullCalendar({
            header:{left:"",center:"",right:""},

            defaultView:"agendaWeek",
            firstDay:1,
            minTime:6,
            maxTime:22,
            navLinks: true,
            selectable: true,
            selectHelper: true,
            select: function(start, end) {
                var title = "可用时间";
                var eventData;
                if (title) {
                    eventData = {
                        title: title,
                        start: start,
                        end: end,
                        allDay:false
                    };
                    $('#calendar').fullCalendar('renderEvent', eventData, true);
                }
                $('#calendar').fullCalendar('unselect');
            },
            editable:true,
            eventLimit: true,
            droppable:true,
            eventClick: function() {
                alert('clicked!');
            } ,

        });
        if(arr!=null) {
            for (var i = 0; i < arr.length; i++) {
                if (arr[i] != '0') {
                    var start = arr[i].split('-')[0].split(':')[0];
                    var end = arr[i].split('-')[1].split(':')[0];

                    var schdata = {
                        title: "可用时间",
                        start: new Date(e, a, c - day + 1 + i, start, 0),
                        end: new Date(e, a, c - day + 1 + i, end, 0),
                        allDay: false
                    };
                    $('#calendar').fullCalendar('renderEvent', schdata, true);
                }
            }
        }

        //保存日程修改
        $("#saveScheduleBtn").click(function(){
           // alert("saveSchedule");
            var events = $('#calendar').fullCalendar('clientEvents');
           // alert(events.length);
            var dayCount=1;
            var strArr=['0','0','0','0','0','0','0'];
            function fix(num, length) { //时间格式化
                return ('' + num).length < length ? ((new Array(length + 1)).join('0') + num).slice(-length) : '' + num;
            }
            for(var i=0;i<events.length;i++){
                var eventStart=new Date(events[i].start);
                var eventEnd=new Date(events[i].end);
                var day=eventStart.getDay();
                if(day==0) day=7;
                strArr[day-1]=fix(eventStart.getHours(),2)+':'+fix(eventStart.getMinutes(),2)+'-'+
                    fix(eventEnd.getHours(),2)+':'+fix(eventEnd.getMinutes(),2);
               // alert(day-1+":"+strArr[day-1]);
            }
            var scheduleStr=strArr.join('#');
            //alert(scheduleStr);
            //数据库更新schedule...
            $.ajax({
                type: "post",
                url: "saveTeacherSchedule",
                timeout: 80000,
                dataType: "json",
                data: {
                    "schedule":scheduleStr,
                    "teacherId":${teacher.id}

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
        });


    });
</script>
<script type="text/javascript">
    function saveFunc1(){
        var teacherId = ${teacher.id};
        var name=$("#name").val();
        var pid=$("#pid").val();
        var address=$("#address").val();
        var detailaddress=$("#detailaddress").val();
        var abstractT=$("#abstractT").val();
        var experienceAge=$("#experienceAge").val();
        var school=$("#school").val();
        var unit=$("#unit").val();
        var domain=$("#domain").val();
        var question=$("#question").val();
        var object="";

        var way=$("#way").val();
        var priceT=$("#priceT").val();
        var priceS=$("#priceS").val();
        var priceO=$("#priceO").val();
        var tGround=$("#tGround").val();
        var sGround=$("#sGround").val();

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
                    "pid":pid,
                    "address":address,
                    "detailaddress":detailaddress,
                    "abstractT":abstractT,
                    "experienceAge":experienceAge,
                    "school": school,
                    "unit": unit,
                    "domain": domain,
                    "question":question,
                    "object": object,
                    "way": way,
                    "priceT":priceT,
                    "priceS":priceS,
                    "priceO":priceO,
                    "tGround":tGround,
                    "sGround":sGround,

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
        document.getElementById("nameDiv").innerHTML="<p class=\"form-control-static\">${teacher.name}</p>";
        document.getElementById("pidDiv").innerHTML="<p class=\"form-control-static\">${teacher.pid}</p>";
        document.getElementById("addressDiv").innerHTML="<p class=\"form-control-static\">${teacher.address}</p>";
        document.getElementById("detailaddressDiv").innerHTML="<p class=\"form-control-static\">${teacher.detailaddress}</p>";
        document.getElementById("detailaddressDiv").innerHTML="<p class=\"form-control-static\">${teacher.detailaddress}</p>";
        document.getElementById("abstractDiv").innerHTML="<p class=\"form-control-static\">${teacher.abstractteacher}</p>";
        document.getElementById("experienceAgeDiv").innerHTML="<p class=\"form-control-static\">${teacher.experienceAge}</p>";
        document.getElementById("schoolDiv").innerHTML="<p class=\"form-control-static\">${teacher.school}</p>";
        document.getElementById("unitDiv").innerHTML="<p class=\"form-control-static\">${teacher.unit}</p>";
        document.getElementById("domainDiv").innerHTML="<p class=\"form-control-static\">${teacher.domain}</p>";
        document.getElementById("questionDiv").innerHTML="<p class=\"form-control-static\">${teacher.question}</p>";
        document.getElementById("objectDiv").innerHTML="<p class=\"form-control-static\">${teacher.object}</p>";
        document.getElementById("wayDiv").innerHTML="<p class=\"form-control-static\">${teacher.way}</p>";
        document.getElementById("priceTDiv").innerHTML="<p class=\"form-control-static\">${teacher.priceT}</p>";
        document.getElementById("priceSDiv").innerHTML="<p class=\"form-control-static\">${teacher.priceS}</p>";
        document.getElementById("priceODiv").innerHTML="<p class=\"form-control-static\">${teacher.priceO}</p>";
        document.getElementById("tGroundDiv").innerHTML="<p class=\"form-control-static\">${teacher.tGround}</p>";
        document.getElementById("sGroundDiv").innerHTML="<p class=\"form-control-static\">${teacher.sGround}</p>";

        document.getElementById("modifyBtn").setAttribute("style","display:inline");
        document.getElementById("saveBtn").setAttribute("style","display:none");
        document.getElementById("cancelBtn").setAttribute("style","display:none");
    }


    function modifyFunc() {

        document.getElementById("nameDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"name\" value=\"${teacher.name}\">";
        document.getElementById("pidDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"pid\" value=\"${teacher.pid}\">";
        document.getElementById("addressDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"address\" value=\"${teacher.address}\">";
        document.getElementById("detailaddressDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"detailaddress\" value=\"${teacher.detailaddress}\">";
        document.getElementById("abstractDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"abstractT\" value=\"${teacher.abstractteacher}\">";
        document.getElementById("experienceAgeDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"experienceAge\" value=\"${teacher.experienceAge}\">";
        document.getElementById("schoolDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"school\" value=\"${teacher.school}\">";
        document.getElementById("unitDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"unit\" value=\"${teacher.unit}\">";
        document.getElementById("domainDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"domain\" value=\"${teacher.domain}\">";
        document.getElementById("questionDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"question\" value=\"${teacher.question}\">";
        document.getElementById("objectDiv").innerHTML=
            "<label class=\"checkbox-inline\"><input type=\"checkbox\" class=\"object_checkbox\" name=\"object[]\" value=\"0-3岁\">0-3岁 </label>"+
            "<label class=\"checkbox-inline\"><input type=\"checkbox\" class=\"object_checkbox\" name=\"object[]\" value=\"3-6岁\">3-6岁 </label>"+
            "<label class=\"checkbox-inline\"> <input type=\"checkbox\" class=\"object_checkbox\" name=\"object[]\" value=\"6-18岁\">6-18岁 </label>"+
            "<label class=\"checkbox-inline\"> <input type=\"checkbox\" class=\"object_checkbox\" name=\"object[]\" value=\"成人\">成人 </label>";
        $(".object_checkbox").each(function () {
            if("${teacher.object}".indexOf($(this).val())!=-1){
                $(this).prop("checked",true);
            }
        });
        document.getElementById("wayDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"way\" value=\"${teacher.way}\">";
        document.getElementById("priceTDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"priceT\" value=\"${teacher.priceT}\">";
        document.getElementById("priceSDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"priceS\" value=\"${teacher.priceS}\">";
        document.getElementById("priceODiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"priceO\" value=\"${teacher.priceO}\">";
        document.getElementById("tGroundDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"tGround\" value=\"${teacher.tGround}\">";
        document.getElementById("sGroundDiv").innerHTML="<input type=\"text\" class=\"form-control\" id=\"sGround\" value=\"${teacher.sGround}\">";

//        var newInput=document.createElement("input");
//        newInput.setAttribute("class","form-control");
//        newInput.setAttribute("value","2333");
//        var myDiv=document.getElementById("nameTest");
//        myDiv.appendChild(newInput);
//        myDiv.removeChild(myDiv.childNodes[0]);

        document.getElementById("modifyBtn").setAttribute("style","display:none");
        document.getElementById("saveBtn").setAttribute("style","display:inline");
        document.getElementById("cancelBtn").setAttribute("style","display:inline");
    }






</script>




</body>
</html>
