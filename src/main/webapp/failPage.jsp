<%--
  Created by IntelliJ IDEA.
  User: alanbrooken
  Date: 10.08.2023
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1><%="Вы умерли"%>
</h1>
<p>
    <img src="rsc/dead.jpg" height="500" width="700">
</p>
<p>
<form action="<%=request.getContextPath()%>/restart" method="get">
    <button type="submit" name="restart">Попробовать снова</button>
</form>
</p>
</body>
</html>
