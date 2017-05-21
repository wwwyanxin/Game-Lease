<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-15
  Time: 下午 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜单功能</title>
</head>
<body>
<p>
    <a href="login.jsp">退出登录</a>
</p>
<h1 align="center">Hi,${user.name}</h1>
<p align="center">请选择功能</p>
<table align="center" border="1" cellpadding="10" bgcolor="#fff8dc">
    <td><a href="userinfo">用户信息</a></td>
    <td><a href="lease">我要出租账号!</a></td>
    <td><a href="rent">我要租入账号!</a> </td>
</table>
</body>
</html>
