package pl.coderslab.controller;

import pl.coderslab.model.User;
import pl.coderslab.model.UserDao;
import pl.coderslab.model.UserGroupDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/groupDelete")
public class GroupDeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String groupIdString = request.getParameter("id");
        int groupId = Integer.parseInt(groupIdString);

        UserDao userDao = new UserDao();

        User[] users = userDao.findAllByGroupId(groupId);

        if(users.length == 0) {
            UserGroupDao groupDao = new UserGroupDao();
            groupDao.delete(groupId);
            response.sendRedirect("/adminGroups");
        } else {
            getServletContext().getRequestDispatcher("/groupcantdelete.jsp").forward(request, response);
        }

    }
}
