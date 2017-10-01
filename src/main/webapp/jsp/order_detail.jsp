<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: joy12
  Date: 2017/9/15
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>订单详情</title>
    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeIn">
    <a target="_self" href='orders' class="btn btn-primary btn-sm">返回</a>
    <div class="row">
        <div class="col-sm-12">
            <div class="tabs-container">
                <ul class="nav nav-tabs">
                    <li class="active"><a data-toggle="tab" href="#tab-order" aria-expanded="true">订单详情</a>
                    </li>
                    <li class=""><a data-toggle="tab" href="#tab-demand" aria-expanded="false">患者详情</a>
                    </li>
                    <li class=""><a data-toggle="tab" href="#tab-parent" aria-expanded="false">家长详情</a>
                    </li>
                    <li class=""><a data-toggle="tab" href="#tab-teacher" aria-expanded="false">治疗师详情</a>
                    </li>
                    <li class=""><a data-toggle="tab" href="#tab-recoverylog" aria-expanded="false">康复日志</a>
                    </li>
                    <li class=""><a data-toggle="tab" href="#tab-trace" aria-expanded="false">订单追踪</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div id="tab-order" class="tab-pane active">
                        <div class="panel-body">
                            <div>
                                <h4>订单编号</h4>
                                <p>${order.id}</p>
                            </div>
                            <div>
                                <h4>课时总数</h4>
                                <p>${order.amount}</p>
                            </div>
                            <div>
                                <h4>治疗方向</h4>
                                <p>${order.way}</p>
                            </div>
                            <div>
                                <h4>订单状态</h4>
                                <p>【家长】    ：  ${statusP}</p>
                                <p>【治疗师】  ：  ${statusT}</p>
                            </div>
                            <div>
                                <h4>支付情况</h4>
                                <p>【应付款】  ：  ${order.totalpay}</p>
                                <p>【实付款】  ：  ${order.realpay}</p>
                                <p>【支付方式】：  ${order.payWay}</p>
                            </div>
                            <div>
                                <h4>订单备注</h4>
                                <p>${order.remark}</p>
                            </div>
                        </div>
                    </div>
                    <div id="tab-demand" class="tab-pane">
                        <div class="panel-body">
                            <div>
                                <h4>患者信息</h4>
                                <p>【ID】    ：  ${demand.id}</p>
                                <p>【姓名】    ：  ${demand.name}</p>
                                <p>【性别】    ：  ${demand.gender}</p>
                                <p>【生日】    ：  ${demand.birthday}</p>
                            </div>
                            <div>
                                <h4>诊断信息</h4>
                                <p>【诊断报告】    ：    ${demand.disease}</p>
                                <p>【病史】     ：    ${demand.diseaseHis}</p>
                                <p>【过敏史】    ：    ${demand.allergyHis}</p>
                                <p>【备注】    ：    ${demand.remark}</p>
                            </div>
                            <div>
                                <h4>就诊记录</h4>
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>历史康复机构</th>
                                        <th>康复起止时间</th>
                                        <th>康复频次（周）</th>
                                        <th>康复形式及康复内容</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${recoveryHis}" var="r">
                                        <tr class="gradeX">
                                            <td>${r.organization}</td>
                                            <td>${r.period}</td>
                                            <td>${r.frequent}</td>
                                            <td>${r.content}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div id="tab-parent" class="tab-pane">
                        <div class="panel-body">
                            <div>
                                <h4>家长信息</h4>
                                <p>【用户ID】    ：    ${parent.userid}</p>
                                <p>【姓名】    ：    ${parent.realname}</p>
                                <p>【性别】    ：    ${parent.gender}</p>
                                <p>【联系电话】    ：    ${parent.phone}</p>
                                <p>【e-mail】    ：    ${parent.email}</p>
                                <p>【地址】    ：    ${parent.address}</p>
                                <p>【所属区域】    ：    ${parent.ground}</p>
                            </div>
                        </div>
                    </div>
                    <div id="tab-teacher" class="tab-pane">
                        <div class="panel-body">
                            <div>
                                <h4>治疗师信息</h4>
                                <p>【用户ID】    ：    ${teacher.userId}</p>
                                <p>【姓名】    ：    ${teacher.name}</p>
                                <p>【性别】    ：  ${teacher.gender}</p>
                                <p>【星级】    ：  ${teacher.level}</p>
                                <p>【联系电话】    ：    ${teacher.phone}</p>
                                <p>【e-mail】    ：    ${teacher.email}</p>
                                <p>【个人简介】    ：    ${teacher.abstractteacher}</p>
                            </div>
                            <div>
                                <h4>专业信息</h4>
                                <p>【毕业院校】    ：    ${teacher.school}</p>
                                <p>【所属机构】    ：    ${teacher.unit}</p>
                                <p>【康复经验年限】    ：    ${teacher.experienceAge}</p>
                                <p>【专业证书】    ：    ${teacher.certificate}</p>
                                <p>【奖励荣誉】    ：    ${teacher.award}</p>
                                <p>【工作经历】    ：    ${teacher.recoveryHis}</p>
                                <p>【成功案例】    ：    ${teacher.successCase}</p>
                            </div>
                            <div>
                                <h4>服务信息</h4>
                                <p>【康复项目】    ：    ${teacher.domain}</p>
                                <p>【康复对象】    ：    ${teacher.object}</p>
                                <p>【康复方式】    ：    ${teacher.way}</p>
                                <p>【可用时间】    ：    ${teacher.availableTime}</p>
                                <p>【诊费(元/小时)】    ：    学生上门-<c:choose>
                                    <c:when test="${teacher.priceS > 0}">${teacher.priceS}</c:when>
                                    <c:otherwise>不提供该服务</c:otherwise></c:choose>
                                                            治疗师上门-<c:choose>
                                        <c:when test="${teacher.priceT > 0}">${teacher.priceT}</c:when>
                                        <c:otherwise>不提供该服务</c:otherwise></c:choose>
                                                            在线授课-<c:choose>
                                        <c:when test="${teacher.priceT > 0}">${teacher.priceT}</c:when>
                                        <c:otherwise>不提供该服务</c:otherwise></c:choose></p>
                                <p>【治疗师上门区域】    ：    ${teacher.sGround}</p>
                                <p>【患者上门地址】    ：    ${teacher.tGround} ${teacher.detailaddress}</p>
                            </div>
                        </div>
                    </div>
                    <div id="tab-recoverylog" class="tab-pane">
                        <div class="panel-body">
                            <div class="ibox-content timeline">
                                <c:choose>
                                <c:when test='${empty trace}'>
                                    暂无信息
                                </c:when>
                                <c:otherwise>
                                    <c:forEach items="${recoveryLog}" var="l">
                                        <div class="timeline-item">
                                            <div class="row">
                                                <div class="col-xs-3 date">
                                                    <i class="fa fa-bookmark"></i> ${l.time}
                                                </div>
                                                <div class="col-xs-7 content no-top-border">
                                                    <div class="row">
                                                        <div class="col-xs-7">
                                                            <p class="m-b-xs"><strong>诊疗记录</strong></p>
                                                            <p>${l.content}</p>
                                                            <p class="m-b-xs"><strong>状态</strong></p>
                                                            <c:choose>
                                                                <c:when test="${l.confirmStatus == 1}">
                                                                    <p>已确认</p>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <p>未确认</p>
                                                                </c:otherwise>
                                                            </c:choose>
                                                            <c:if test="${l.confirmTime != null}">
                                                                <p>于 ${l.confirmTime}</p>
                                                            </c:if>

                                                        </div>
                                                        <div class="col-xs-3">
                                                            <button class="btn btn-info btn-sm" type="button">改变确认状态</button>
                                                            <button class="btn btn-info btn-sm" type="button" style="margin-top: 10px">删除记录</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </c:otherwise>
                                </c:choose>
                            </div>
                        </div>
                    </div>
                    <div id="tab-trace" class="tab-pane">
                        <div class="panel-body">
                            <div class="ibox-content timeline">
                                <c:choose>
                                <c:when test='${empty trace}'>
                                    暂无信息
                                </c:when>
                                <c:otherwise>
                                    <c:forEach items="${trace}" var="t">
                                        <c:if test="${t.isError == false}">
                                            <div class="timeline-item">
                                                <div class="row">
                                                    <div class="col-xs-3 date">
                                                        <i class="fa fa-bookmark"></i> ${t.time}
                                                    </div>
                                                    <div class="col-xs-7 content no-top-border">
                                                        <div class="row">
                                                            <div class="col-xs-7">
                                                                <p class="m-b-xs">${t.content}</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:if>
                                    </c:forEach>
                                </c:otherwise>
                                </c:choose>
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
<script src="js/content.min.js?v=1.0.0"></script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>