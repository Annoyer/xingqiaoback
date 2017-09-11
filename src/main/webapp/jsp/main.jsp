<%--
  Created by IntelliJ IDEA.
  User: joy12
  Date: 2017/9/11
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>星桥后台管理系统</title>
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
</head>
<body>
HELLO WORLD!
<input type="text" id="orderId">
<button id="confirm" onclick="find()">查询</button>
<div id="remark">remark = </div>
</body>
</html>
<script type="text/javascript">
    function find() {
        var orderId = $('#orderId').val();
        $.ajax({
            type: "post",//请求方式
            url: "test/getOrderByOrderId",
            timeout: 80000,//超时时间：8秒
            dataType: "json",//设置返回数据的格式
            data: {
                "orderId": orderId
            },
            //请求成功后的回调函数 data为json格式
            success: function (data) {
                $('#remark').append(data.order.remark);
            },
            //请求出错的处理
            error: function () {
                alert("请求出错");
            }
        });
    }
</script>
