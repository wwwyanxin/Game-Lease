<%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-5-26
  Time: 下午 3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
</head>
<body onload="minDate()">

<script>

    function spend() {//计算花费

        var nowTime = new Date().getTime();
        var end = document.getElementById("end").value;
        end = end.replace("T", " ");
        var endTime = new Date(end).getTime();
        var timeDiff = endTime - nowTime;


        //计算出相差天数
        var days = Math.floor(timeDiff / (24 * 3600 * 1000))//向下取整floor

        //计算出小时数
        var leave1 = timeDiff % (24 * 3600 * 1000)    //计算天数后剩余的毫秒数
        var hours = Math.floor(leave1 / (3600 * 1000))

        //计算相差分钟数
        var leave2 = leave1 % (3600 * 1000)        //计算小时数后剩余的毫秒数
        var minutes = Math.ceil(leave2 / (60 * 1000))//向上取整


        var pricePerHour =${leaseMap.price};
        var pricePreMinute = pricePerHour / 60;//计算每分钟的价格
        var minuteDiff = timeDiff / (60 * 1000);//计算总共花费的分钟数
        var spendMoney = minuteDiff * pricePreMinute;//总共花费
        spendMoney = spendMoney.toFixed(2);//四舍五入保留2位小数
        var balance =${user.balance};


        if (minuteDiff <= 0) {
            document.getElementById("timeDiff").innerHTML = "您输入时间有误";

            // spendHTML = document.getElementById("spend").innerHTML;
            document.getElementById("spend").innerHTML = "您输入时间有误";

        } else if (balance < spendMoney) {//如果余额不足,隐藏确定按钮,出现充值
            document.getElementById("submit").style.display = "none";
            document.getElementById("recharge").style.display = "inline";

            document.getElementById("timeDiff").innerHTML = "您将使用:" + days + "天" + hours + "小时" + minutes + "分钟";
            document.getElementById("spend").innerHTML = "您需要支付:" + spendMoney + "元";
        } else {
            document.getElementById("submit").style.display = "inline";
            document.getElementById("recharge").style.display = "none";

            document.getElementById("timeDiff").innerHTML = "您将使用:" + days + "天" + hours + "小时" + minutes + "分钟";
            document.getElementById("spend").innerHTML = "您需要支付:" + spendMoney + "元";

            document.getElementById("spendMoney").value=spendMoney;
        }

    }

    function minDate() {
        document.getElementById("recharge").style.display = "none";

        clock = nowDate();
        document.getElementById("end").setAttribute("min", clock);

    }

    function nowDate() {//可选的最小时间

        var now = new Date();
        var year = now.getFullYear();       //年
        var month = now.getMonth() + 1;     //月
        var day = now.getDate();            //日
        var hh = now.getHours();            //时
        var mm = now.getMinutes();          //分


        var clock = year + "-";
        if (month < 10)
            clock += "0";
        clock += month + "-";
        if (day < 10)
            clock += "0";
        clock += day + "T";

        if (hh < 10)
            clock += "0";
        clock += hh + ":";

        if (mm < 10)
            clock += '0';
        clock += mm;

        return clock;
    }
</script>

<div style="background-color: paleturquoise">
    <p>
        <a href="menu.jsp">返回到主页</a>&nbsp;
        <a href="login.jsp">退出登录</a>
    </p>
    <p style="text-align: right"><span style="font-size: 25px">${user.name}</span>
        账户余额:${user.balance} &nbsp<a href="recharge">充值</a>&nbsp;</p>
</div>

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
</table>
<br>
<form action="rent" method="post">
    <table align="center" border="1" cellspacing="0" bgcolor="#cd5c5c" width="300px">
        <tr>
            <td align="center">
                <input type="datetime-local" name="end" max="${leaseMap.maxDate}" min=""
                       id="end" onchange="spend()" style="text-align: center" required>
            </td>
        </tr>
        <tr>
            <td id="timeDiff">您将使用:</td>

        </tr>
        <tr>
            <td id="spend">您需要支付:</td>
        </tr>
        <tr id="judgeBalance">
            <td align="right">
                <input type="hidden" name="leaseId" value="${leaseMap.leaseId}">
                <input type="hidden" name="spendMoney" id="spendMoney">
                <input id="submit" type="submit" value="确定" onclick="alert('租赁成功,感谢您的使用')">
            </td>
        </tr>

        <tr id="recharge">
            <td align="right">
                您的余额不足请<a href='recharge'>充值</a>
            </td>
        </tr>


    </table>
</form>
</body>
</html>
