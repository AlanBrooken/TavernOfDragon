<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Web game in 2023 lol</title>
</head>
<body>
<div>
    <h1><%= "Пролог" %>
    </h1>
    <p>
        <%="Проснувшись, вы неожиданным образом оказались в таверне. Вокруг было пусто, только пустые столики" +
                " и мухи окружали вас. Проверив всё ли на месте, вы нашли свой паспорт и решили проверить, не забыли " +
                "ли Вы как Вас зовут." %>
    </p>
    <p>
        <img src="rsc/prologue.jpg" height="400" width="900">
    </p>
    <p>
    <form action="<%=request.getContextPath() %>/register" method="get">
            <label>
                <input type="text" name="name">
            </label>
        <button type="submit">Отправить</button>
    </form>
    </p>

</div>
</body>
</div>

</html>