package game.webgame2023;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Получаем сессию
        HttpSession session = req.getSession();

        //Получаем параметр из html-формы при регистрации
        String name = req.getParameter("name");

        //Устанавливаем новое значение имени
        session.setAttribute("playerName", name);

        //Редирект на основную страницу
        getServletContext().getRequestDispatcher("/mainPage.jsp").forward(req, resp);
    }


}
