<%--
  Created by IntelliJ IDEA.
  User: 62302
  Date: 2019/12/6
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2 align="center">用户陆</h2>
    <form action="${pageContext.request.contextPath}/login/login.action" method="post">
        <table width="50%" align="center" cellpadding="2" cellspacing="2">
            <tr>
                <td align="right">用户名:</td>
                <td>
                    <input type="text" name="username">
                </td>
            </tr>

            <tr>
                <td align="right">密码:</td>
                <td>
                    <input type="text" name="password">
                </td>
            </tr>


            <tr>
                <td align="center" colspan="2">
                    <input type="submit" value="登陆">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
