<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-23
  Time: 下午 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员通道</title>
    <style>
        body {
            text-align: right
        }.div {
            margin: 0 auto;
            width: 180px;
            height: 120px;
            border: 4px solid #C0C0C0;
            background-color: cadetblue;
        }
    </style>
</head>
<body>
<h1 align="center">游戏账号租赁平台管理员通道!</h1>
<div class="div">
    <form action="adminLogin" method="post">
        账号:<input type="text" name="name" required><br>
        密码:<input type="password" name="password" required>
        <input type="submit" value="登录">
    </form>
    <br>
</div>
</body>
</html>
