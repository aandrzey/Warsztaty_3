package pl.coderslab.controller;

import pl.coderslab.model.Solution;
import pl.coderslab.model.SolutionDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SolutionDao solutionDao = new SolutionDao();
        int numberSolutions = Integer.parseInt(getServletContext().getInitParameter("number-solutions"));
        Solution[] solutions = solutionDao.getRecent(numberSolutions);

        request.setAttribute("solutions", solutions);

        getServletContext().getRequestDispatcher("/homepage.jsp").forward(request, response);

    }
}
