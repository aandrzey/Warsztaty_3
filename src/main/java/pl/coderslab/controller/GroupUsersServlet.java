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

@WebServlet("/groupUsers")
public class GroupUsersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String groupIdString = request.getParameter("id");
        int groupId = Integer.parseInt(groupIdString);

        UserGroupDao userGroupDao = new UserGroupDao();
        UserGroup group = userGroupDao.read(groupId);
        request.setAttribute("group", group);

        UserDao userDao = new UserDao();
        User[] users = userDao.findAllByGroupId(groupId);
        request.setAttribute("users", users);

        getServletContext().getRequestDispatcher("/groupusers.jsp").forward(request, response);
    }
}
