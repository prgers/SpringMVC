<%--
  Created by IntelliJ IDEA.
  User: PRG
  Date: 2021/9/28
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

添加
<form action="jobs/save" method="post">
    <input type="text" name="name">
    <input type="text" name="duty">
    <button type="submit">添加</button>
</form>

删除
<form action="jobs/update" method="post">
    <input type="text" name="id">
    <input type="text" name="name">
    <input type="text" name="duty">
    <button type="submit">更新</button>
</form>

</body>
</html>
