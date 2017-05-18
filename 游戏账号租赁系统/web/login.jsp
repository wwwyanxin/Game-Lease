<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-14
  Time: 下午 4:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>游戏账号租赁平台</title>
    <style>
        body{text-align:right}.div{
            margin:0 auto;
            width:180px;height:120px;
            border:4px  solid #C0C0C0
                               }
    </style>
</head>
<body>
<h1 align="center">欢迎使用游戏账号租赁平台!</h1>
<div class="div">
    <form action="login" method="post">
        账号:<input type="text" name="name"><br>
        密码:<input type="password" name="password">
        <input type="submit" value="登录">
    </form>

    <br>
    没有账号?点击
    <a href="register.jsp" type="button" value="注册">注册账号</a>
</div>
</body>
</html>
