package game.webgame2023;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Map;

@WebServlet("/logic")
public class LogicServlet extends HttpServlet {
    //Создаем мапу для вопросов и ответов, заполняем ее
    private Map<Integer, String> events = Map.ofEntries(
            Map.entry(0, "Вы спрятались под столом. В таверну зашли два дракона, поднялись на второй этаж и стали громко рыгать."),
            Map.entry(1, "Оказавшись за дверью, вы понимаете, что находитесь на самом дне вулкана. Вы можете воспользоваться своей рубашкой как парашутом и взлететь\n" +
                    "на горячих парах от вулкана или медленно идти вверх пешком"),
            Map.entry(2, "Вы улетели из вулкана и приземлились на Гавайах. Можно и отдохнуть"),
            Map.entry(3, "Уйти через дверь"),
            Map.entry(4, "Взлететь"),
            Map.entry(5, "Идти"),
            Map.entry(6, "Отдохнуть"));

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        //Получение значения выбора из mainPage.jsp
        String choice = request.getParameter("choice");

        //Смена текста в зависимости от ответа
        if (choice != null) {
            switch (choice) {
                case "Спрятаться под столом":
                    session.setAttribute("event", events.get(0));
                    session.setAttribute("choiceOne", events.get(3));
                    session.setAttribute("choiceTwo", events.get(3));
                    getServletContext().getRequestDispatcher("/mainPage.jsp").forward(request, response);
                    break;
                case "Выйти":
                case "Идти":
                    getServletContext().getRequestDispatcher("/failPage.jsp").forward(request, response);
                    break;
                case "Уйти через дверь":
                    session.setAttribute("event", events.get(1));
                    session.setAttribute("choiceOne", events.get(4));
                    session.setAttribute("choiceTwo", events.get(5));
                    getServletContext().getRequestDispatcher("/mainPage.jsp").forward(request, response);
                    break;
                case "Взлететь":
                    session.setAttribute("event", events.get(2));
                    session.setAttribute("choiceOne", events.get(6));
                    session.setAttribute("choiceTwo", events.get(6));
                    getServletContext().getRequestDispatcher("/mainPage.jsp").forward(request, response);
                    break;
                case "Отдохнуть":
                    getServletContext().getRequestDispatcher("/goodEnd.jsp").forward(request,response);
            }
            response.sendRedirect("/mainPage.jsp");
        } else {
            getServletContext().getRequestDispatcher("/mainPage.jsp").forward(request, response);
            response.sendRedirect("/mainPage.jsp");
        }
    }
}
