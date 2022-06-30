package fr.afpa.tppreferencesdusage.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "EnvoieServlet", value = "/EnvoieServlet")
public class EnvoieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        // Je créé un nouveau cookie
        Cookie monCookie = new Cookie("font", "color");
        // J'ajoute le nouveau cookie au tableau de cookie
        response.addCookie(monCookie);

        // --------------- SESSION ---------------
        HttpSession session = request.getSession();
        session.setAttribute("background", request.getParameter("bg"));
        session.getAttribute("background");
        session.getAttribute("cpt");

        // Je redirige vers la page index.jsp
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("WEB-INF/affichage.jsp").forward(request, response);

    }
}
