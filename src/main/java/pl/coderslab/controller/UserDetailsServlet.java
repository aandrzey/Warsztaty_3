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

@WebServlet("/userDetails")
public class UserDetailsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userIdString = request.getParameter("id");
        int userId = Integer.parseInt(userIdString);

        UserDao userDao = new UserDao();
        User user = userDao.read(userId);
        request.setAttribute("user", user);

        SolutionDao solutionDao = new SolutionDao();
        Solution[] solutions = solutionDao.findAllByUser(userId);
        request.setAttribute("solutions", solutions);

        getServletContext().getRequestDispatcher("/userdetails.jsp").forward(request, response);
    }
}
