package pl.coderslab.controller;

import pl.coderslab.model.Solution;
import pl.coderslab.model.SolutionDao;
import pl.coderslab.model.User;
import pl.coderslab.model.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userDelete")
public class UserDeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userIdString = request.getParameter("id");
        int userId = Integer.parseInt(userIdString);

        SolutionDao solutionDao = new SolutionDao();
        Solution[] solutions = solutionDao.findAllByUser(userId);

        if(solutions.length == 0) {
            UserDao userDao = new UserDao();
            userDao.delete(userId);
            response.sendRedirect("/adminUsers");
        } else {
            getServletContext().getRequestDispatcher("/usercantdelete.jsp").forward(request, response);
        }

    }
}
