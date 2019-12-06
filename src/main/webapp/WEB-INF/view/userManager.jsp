<%--
  Created by IntelliJ IDEA.
  User: 62302
  Date: 2019/12/6
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2 align="center">欢迎登陆！${sessionScope.user.username}</h2>
    <shiro:hasPermission name="user:query">
        <h1><a href="/user/query.action">查询账户</a></h1>
    </shiro:hasPermission>

    <shiro:hasPermission name="user:add">
        <h1><a href="/user/add.action">添加账户</a></h1>
    </shiro:hasPermission>

    <shiro:hasPermission name="user:delete">
        <h1><a href="/user/delete.action">删除账户</a></h1>
    </shiro:hasPermission>

    <shiro:hasPermission name="user:modity">
        <h1><a href="/user/modify.action">修改账户</a></h1>
    </shiro:hasPermission>

    <shiro:hasPermission name="user:export">
        <h1><a href="/user/export.action">导出账户</a></h1>
    </shiro:hasPermission>
</body>
</html>
