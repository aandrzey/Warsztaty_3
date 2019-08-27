package pl.coderslab.controller;

import pl.coderslab.model.User;
import pl.coderslab.model.UserDao;
import pl.coderslab.model.UserGroup;
import pl.coderslab.model.UserGroupDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userAdd")
public class UserAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String groupIdString = request.getParameter("groupId");
        int groupId = Integer.parseInt(groupIdString);

        UserGroupDao userGroupDao = new UserGroupDao();
        UserGroup group = userGroupDao.read(groupId);

        User user = new User(username, email, password, group);

        UserDao userDao = new UserDao();
        userDao.create(user);
        response.sendRedirect("/adminUsers");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserGroupDao userGroupDao = new UserGroupDao();
        UserGroup[] groups = userGroupDao.findAll();
        request.setAttribute("groups", groups);

        getServletContext().getRequestDispatcher("/useradd.jsp").forward(request, response);
    }
}
