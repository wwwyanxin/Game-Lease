<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-21
  Time: 下午 3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>充值</title>
</head>
<body>
<p>
    <a href="menu.jsp">返回到主页</a>&nbsp;
    <a href="login.jsp">退出登录</a>
</p>

<h1 align="center" >
    ${user.name}
</h1>
<form  action="recharge" method="post">
    <table align="center" border="0" cellpadding="7" style="background-color: paleturquoise">
        <tr>
            <td>账户余额:${user.balance}</td>
        </tr>
        <tr>
            <td>
                <select style="background-color: #29deaa" name="platform">
                    <option value="Alipay">支付宝</option>
                    <option value="Wechatpay">微信支付</option>
                </select>
            </td>
            <td>充值金额:<input type="number" value="100" name="amount" min="1"></td>
        </tr>
        <tr>
            <td colspan="2">
                <p style="margin: auto;text-align: center">
                    <input type="submit" value="确认">
                    <input type="button" value="返回" onclick="javascript:history.back(-1)"  >
                </p>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
