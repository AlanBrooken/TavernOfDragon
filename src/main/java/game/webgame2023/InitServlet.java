package game.webgame2023;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "InitServlet", value = "/start")
public class InitServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //Создание сессии
        HttpSession session = request.getSession();

        //Добавление аттрибута имени
        session.setAttribute("playerName", "unknown");

        //Установление количества попыток
        Integer attempts = (Integer) session.getAttribute("attempts");
        if (attempts == null)
            session.setAttribute("attempts", 1);
         else
            session.setAttribute("attempts", attempts + 1);

        //Устанавливаем стартовые значения ивентов и варианты ответов
        session.setAttribute("event", "Пора выйти наружу и разобраться, что здесь происходит. Подойдя к двери, вы слышите звук приближающихся шагов.");
        session.setAttribute("choiceOne", "Спрятаться под столом");
        session.setAttribute("choiceTwo", "Выйти");

        //Редирект на стартовую страницу
        getServletContext().getRequestDispatcher("/startPage.jsp").forward(request, response);
    }
}