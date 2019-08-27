package pl.coderslab.controller;

import pl.coderslab.model.Solution;
import pl.coderslab.model.SolutionDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/solutionDetails")
public class SolutionDetailsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String solutionIdString = request.getParameter("id");
        int solutionId = Integer.parseInt(solutionIdString);

        SolutionDao solutionDao = new SolutionDao();

        Solution solution = solutionDao.read(solutionId);

        request.setAttribute("solution", solution);

        getServletContext().getRequestDispatcher("/solutiondetails.jsp").forward(request, response);

    }
}
