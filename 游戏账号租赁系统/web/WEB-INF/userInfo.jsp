<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-19
  Time: 下午 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>

<p>
    <a href="menu.jsp">返回到主页</a>&nbsp;
    <a href="login.jsp">退出登录</a>
</p>

<h1 align="center">${user.name}</h1>
<p align="center">账户余额:${user.balance} &nbsp<a href="recharge">充值</a></p>

<h2>账号出租单:</h2>

<c:forEach items="${leaseMapList}" var="leaseMap" varStatus="st">
    <table align="center" border="1" cellspacing="0" bgcolor="#add8e6" width="700px">
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
            <td>账号:${leaseMap.account}<br> 密码:${leaseMap.password}</td>
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
</c:forEach>


<h2>账号租赁单:</h2>
<c:forEach items="${rentMapList}" var="rentMap" varStatus="st">
    <table align="center" border="1" cellspacing="0" bgcolor="#add8e6" width="800px">
        <tr>
            <td>game</td>
            <td>account-info</td>
            <td>start</td>
            <td>end</td>
            <td>lease-user</td>
            <td>price</td>
            <td>cost</td>
        </tr>
        <tr>
            <td>${rentMap.game}</td>
            <td>账号:${rentMap.account}<br> 密码:${rentMap.password}</td>
            <td>${rentMap.start}</td>
            <td>${rentMap.end}</td>
            <td>${rentMap.leaseUser}</td>
            <td>${rentMap.price}</td>
            <td>${rentMap.cost}</td>
        </tr>
    </table>
    <br>
</c:forEach>

</body>
</html>
