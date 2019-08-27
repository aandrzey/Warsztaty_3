package pl.coderslab.controller;

import pl.coderslab.model.User;
import pl.coderslab.model.UserGroup;
import pl.coderslab.model.UserGroupDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/groupAdd")
public class GroupAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");

        UserGroupDao userGroupDao = new UserGroupDao();

        UserGroup userGroup = new UserGroup(name);

        userGroupDao.create(userGroup);

        response.sendRedirect("/adminGroups");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/groupadd.jsp").forward(request, response);
    }
}
