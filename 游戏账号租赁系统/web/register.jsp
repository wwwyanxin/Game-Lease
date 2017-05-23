<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-15
  Time: 下午 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册账号</title>
    <style>
        div{
            text-align: right;
            margin:0 auto;
            width:180px;height:63px;
            border:4px  solid #C0C0C0
        }
    </style>
</head>
<body>
<div class="div">
    <form action="register" method="post">
        账号:<input type="text" name="name" value="请输入申请的账号:" required><br>
        密码:<input type="password" name="password" value="密码长度为6-18位" required>
        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>
