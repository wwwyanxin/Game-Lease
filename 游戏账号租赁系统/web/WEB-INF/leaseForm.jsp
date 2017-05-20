<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-20
  Time: 上午 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>出租表单</title>
</head>
<body>
<form action="lease" method="post">
    <table align="center" border="1" cellspacing="1" bgcolor="#fff8dc" >
        <tr>
            <td>
                选择游戏:
                <select name="game">
                    <option value="0">DNF</option>
                    <option value="0">cf</option>
                    <option value="1">11</option>
                </select>
            </td>
            <td>
                价格(元/小时):<input type="text" name="price">
            </td>
        </tr>
        <tr>
            <td>
                账号:<input type="text" value="在此输入账号" name="account">
            </td>
            <td>
                密码:<input type="password"  name="password">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                请填写账号下架收回时间:<input type="datetime-local" value="1997-10-24 3:3:3" name="end"/>
            </td>
        </tr>
        <br>
        <tr>
            <td colspan="2">请添加描述信息</td>
        </tr>
        <tr>
            <td colspan="2"><textarea name="description" style="background-color: lightsteelblue" rows="11" cols="70"></textarea></td>
        </tr>
    </table>
</form>
</body>
</html>
