<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-26
  Time: 下午 3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
</head>
<body <%--style="background-color: paleturquoise"--%>>
<div style="background-color: paleturquoise">
    <p>
        <a href="menu.jsp">返回到主页</a>&nbsp;
        <a href="login.jsp">退出登录</a>
    </p>
    <p style="text-align: right"><span style="font-size: 25px">${user.name}</span>
        账户余额:${user.balance} &nbsp<a href="recharge">充值</a>&nbsp;</p>
</div>

<table align="center" border="1" cellspacing="0" bgcolor="#add8e6" width="700px">
    <tr>
        <td>用户:${leaseMap.user}</td>
        <td colspan="5">出租单号:${leaseMap.leaseId}</td>
    </tr>
    <tr>
        <td>game</td>
        <td>account-info</td>
        <td>start</td>
        <td>end</td>
        <td>price</td>
        <td>status</td>
    </tr>
    <tr>
        <td>${leaseMap.game}</td>
        <td>账号:${leaseMap.account}<br> 密码:********</td>
        <td>${leaseMap.start}</td>
        <td>${leaseMap.end}</td>
        <td>${leaseMap.price}</td>
        <td>${leaseMap.status}</td>
    </tr>
    <tr>
        <td>description</td>
        <td colspan="5">${leaseMap.description}</td>
    </tr>
</table>
<br>
<form action="" method="post">
    <table align="center" border="1" cellspacing="0" bgcolor="#cd5c5c" width="700px">
        <tr>
            <td>
                <input type="datetime-local" name="end" max="2017-11-25T00:00">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="确定">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
