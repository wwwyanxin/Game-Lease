<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-23
  Time: 下午 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>审核出租单</title>
</head>
<body>

<p>
    <a href="adminLogin">返回到主页</a>&nbsp;
    <a href="adminLogin.jsp">退出登录</a>
</p>

<h1 align="center">${admin.name}</h1><br>

<h2>账号出租单:</h2>
<form action="adminAudit" method="post">
<c:forEach items="${leaseMapList}" var="leaseMap" varStatus="st">
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
        <tr>
           <td colspan="6" align="right">
               <%--<form action="" method="post">--%>
                <label><input name="audit_${leaseMap.leaseId}" type="radio" value="pass"/>通过</label>
                <label><input name="audit_${leaseMap.leaseId}"  type="radio" value="noPass"/>不通过</label>
            <%--</form>--%>
           </td>
        </tr>
    </table>
    <br>
</c:forEach>
    <p align="center"><input type="submit" value="确认"><input type="reset" value="重置"></p>
</form>
</body>

</html>
