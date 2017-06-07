<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: wyx11
  Date: 2017-6-7
  Time: 上午 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Context initContext=new InitialContext();
    Context envContext=(Context)initContext.lookup("java:comp/env");
    DataSource ds=(DataSource)envContext.lookup("jdbc/test");
    Connection connection=ds.getConnection();
    Statement statement=connection.createStatement();
    ResultSet resultSet=statement.executeQuery("select * from admin");
    while(resultSet.next()) {
        out.print(resultSet.getString("name"));
        out.print("<br />");
    }

    resultSet.close();
    statement.close();
    connection.close();
%>
</body>
</html>
