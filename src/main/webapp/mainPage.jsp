<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Глава 1</title>
</head>
<body>
<h1>
    <%= "Глава 1" %>
</h1>
<p>
    <%=session.getAttribute("event")%>
</p>
<p>
<form action="<%=request.getContextPath() %>/logic" method="get">
    <fieldset>
        <legend>Сделать выбор</legend>
        <label>
            <input type="radio" name="choice" value="<%=session.getAttribute("choiceOne")%>">
            <%=session.getAttribute("choiceOne")%>
        </label>
        <label>
            <input type="radio" name="choice" value="<%=session.getAttribute("choiceTwo")%>">
            <%=session.getAttribute("choiceTwo")%>
        </label>
        <button type="submit">Подтвердить</button>
    </fieldset>
</form>
</p>
<%="Имя игрока: " + session.getAttribute("playerName")%>
<%="Попытка №" + session.getAttribute("attempts")%>
</body>
</html>
