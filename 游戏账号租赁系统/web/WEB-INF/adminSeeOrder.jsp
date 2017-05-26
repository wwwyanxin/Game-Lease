<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-24
  Time: 上午 1:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看所有租赁订单</title>
</head>
<body>
<p>
    <a href="adminLogin">返回到主页</a>&nbsp;
    <a href="adminLogin.jsp">退出登录</a>
</p>

<h2>账号租赁单:</h2>
<c:forEach items="${rentMapList}" var="rentMap" varStatus="st">
    <table align="center" border="1" cellspacing="0" bgcolor="#add8e6" width="700px">
        <tr>
            <td>租赁者:${rentMap.rentUser}</td>
            <td colspan="6">订单号:${rentMap.rentId}</td>
        </tr>
        <tr>
            <td>game</td>
            <td>account-info</td>
            <td>start</td>
            <td>end</td>
            <td>lease-user</td>
            <td>price</td>
            <td>status</td>
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
