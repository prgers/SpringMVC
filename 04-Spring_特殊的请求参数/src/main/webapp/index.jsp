<%--
  Created by IntelliJ IDEA.
  User: prgers
  Date: 2021/9/27
  Time: 11:05 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="test" method="post">
      <div>
          <input type="text" name="username">
      </div>
      <div>
          <input type="text" name="password">
      </div>

      <div>
          <button type="submit">提交</button>
      </div>
    </form>
    <form action="fileTest" method="post" enctype="multipart/form-data">
        <div>
            <input type="file" name="photo" accept="image/*">
            <button type="submit">提交</button>
        </div>
    </form>

    <form action="dateTest" method="post">
        <div>
            <input type="date" name="date">
            <button type="submit">提交</button>
        </div>
    </form>
</body>
</html>
