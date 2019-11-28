<%--
  Created by IntelliJ IDEA.
  User: 王智豪
  Date: 2019/11/22
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--学习常用注解--%>
<%--<a href="/anno/testRequestParam?name=哈哈">RequestParam</a>--%>

<%--对于传输json数据时，获得请求体很重要，对于get请求是没有请求体的--%>
<%--<form action="/anno/testRequestBody" method="post">--%>
    <%--用户的姓名：<input type="text" name="username"><br>--%>
    <%--用户年龄：<input type="text" name="age"><br>--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>

<%--<a href="/anno/testPathVariable/10">PathVariable</a>--%>

<%--<a href="/anno/testRequestHeader">RequestHeader</a>--%>

<%--<a href="/anno/testCookieValue">CookieValue</a>--%>

<%--<form action="/anno/testModelAttribute1" method="post">--%>
    <%--用户的姓名：<input type="text" name="username"><br>--%>
    <%--用户年龄：<input type="text" name="age"><br>--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>

<%--<form action="/anno/testModelAttribute2" method="post">--%>
    <%--用户的姓名：<input type="text" name="username"><br>--%>
    <%--用户年龄：<input type="text" name="age"><br>--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>

<a href="/anno/testSessionAttributes">向Session中存入值</a>
<a href="/anno/getSessionAttributes">取出session域值</a>
<a href="/anno/delSessionAttributes">删除session域值</a>
</body>
</html>
