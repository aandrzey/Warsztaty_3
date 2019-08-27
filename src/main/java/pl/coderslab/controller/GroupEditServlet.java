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

@WebServlet("/groupEdit")
public class GroupEditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String groupIdString = request.getParameter("id");
        int groupId = Integer.parseInt(groupIdString);

        UserGroupDao userGroupDao = new UserGroupDao();

        UserGroup userGroup = userGroupDao.read(groupId);
        userGroup.setName(name);

        userGroupDao.update(userGroup);

        response.sendRedirect("/adminGroups");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String  groupIdString = request.getParameter("id");

        request.setAttribute("id", groupIdString);

        getServletContext().getRequestDispatcher("/groupedit.jsp").forward(request, response);
    }
}
