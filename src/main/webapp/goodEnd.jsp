<%--
  Created by IntelliJ IDEA.
  User: alanbrooken
  Date: 15.08.2023
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chill</title>
</head>
<body>
<h1>Можно расслабиться</h1>
<p>
  <img src="rsc/chill.jpg" height="600" width="750">
</p>
<p>
<form action="<%=request.getContextPath()%>/restart" method="get">
    <button type="submit" name="restart">Еще раз?</button>
</form>
</p>
</body>
</html>
