package pl.coderslab.controller;

import pl.coderslab.model.UserGroup;
import pl.coderslab.model.UserGroupDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminGroups")
public class AdminGroupsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserGroupDao userGroupDao = new UserGroupDao();

        UserGroup[] groups = userGroupDao.findAll();

        request.setAttribute("groups", groups);

        getServletContext().getRequestDispatcher("/admingroups.jsp").forward(request, response);

    }
}
