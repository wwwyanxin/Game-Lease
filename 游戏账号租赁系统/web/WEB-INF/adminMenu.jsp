<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-24
  Time: 上午 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员菜单</title>
</head>
<body>
<p>
    <a href="adminLogin.jsp">退出登录</a>
</p>

<h1 align="center">管理员:${admin.name}</h1>
<p align="center">请选择功能</p>
<table align="center" border="1" cellpadding="10" bgcolor="#fff8dc">
    <td><a href="adminAudit">审核出租单</a></td>
    <td><a href="adminSeeLease">查看所有出租信息</a></td>
    <td><a href="adminSeeOrder">查看所有租赁订单</a> </td>
</table>
</body>
</html>
