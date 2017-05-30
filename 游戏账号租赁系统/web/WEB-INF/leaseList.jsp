<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-25
  Time: 下午 6:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出租信息</title>
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
<form style="text-align: center;" action="rentList" method="post">
    <select name="game" style="background-color: #29deaa">
        <option value="all">所有游戏</option>
        <c:forEach items="${gameList}" var="game">
            <option value="${game.id}">${game.name}</option>
        </c:forEach>
    </select>
    <input type="search" name="description" style="height: 30px;width:200px;">
    <input type="submit" value="搜索" style="width: 65px;height: 27px">
</form>
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

        <c:if test="${user.name ne leaseMap.user}">  <%--如果是本人出租的账单,则不显示租赁按钮--%>
            <tr>
                <form action="cart" method="post">
                    <td colspan="6" align="right">
                        <input type="hidden" name="leaseId" value="${leaseMap.leaseId}">
                        <input type="submit" value="租赁" style="background-color: #deb858;height: 25px;width: 65px">
                    </td>
                </form>
            </tr>
        </c:if>

    </table>
    <br>
</c:forEach>
</body>
</html>
