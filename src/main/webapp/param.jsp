<%--
  Created by IntelliJ IDEA.
  User: 王智豪
  Date: 2019/11/22
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<a href="/param/testParam?username=wzh&password=123">入门程序</a>--%>

<%--把数据封装到Account中--%>
<%--<form action="/param/saveAccount" method="post">--%>
    <%--姓名：<input type="text" name="username"><br>--%>
    <%--密码：<input type="text" name="password"><br>--%>
    <%--金额：<input type="text" name="money"><br>--%>
    <%--用户的姓名：<input type="text" name="user.uname"><br>--%>
    <%--用户年龄：<input type="text" name="user.age"><br>--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>

<%--把数据封装到Account中，类中存在list和map的集合--%>
<%--<form action="/param/saveAccount" method="post">--%>
    <%--姓名：<input type="text" name="username"><br>--%>
    <%--密码：<input type="text" name="password"><br>--%>
    <%--金额：<input type="text" name="money"><br>--%>

    <%--用户的姓名：<input type="text" name="list[0].uname"><br>--%>
    <%--用户年龄：<input type="text" name="list[0].age"><br>--%>

    <%--用户的姓名：<input type="text" name="map['one'].uname"><br>--%>
    <%--用户年龄：<input type="text" name="map['one'].age"><br>--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>


<%--把数据封装进User中，但是User中Date格式不是yyyy/MM/dd改为了yyyy-MM-dd需要自定义类型转换器--%>
<%--<form action="/param/saveUser" method="post">--%>
    <%--用户的姓名：<input type="text" name="uname"><br>--%>
    <%--用户年龄：<input type="text" name="age"><br>--%>
    <%--用户生日：<input type="text" name="date"><br>--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>

<%--测试原生的Servlet的API--%>
<%--<a href="/param/testServlet">Servlet原生API</a>--%>

</body>
</html>
