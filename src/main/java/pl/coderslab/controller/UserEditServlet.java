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

@WebServlet("/userEdit")
public class UserEditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userIdString = request.getParameter("id");
        int userId = Integer.parseInt(userIdString);

        UserDao userDao = new UserDao();
        User user = userDao.read(userId);

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String groupIdString = request.getParameter("groupId");
        int groupId = Integer.parseInt(groupIdString);

        user.setUsername(username);
        user.setEmail(email);
        //todo jak hasło nie zostanie wpisane przy edycji to zahashowane hasło zostanie ustawione jako hasło
        user.setPassword(password);


        UserGroupDao userGroupDao = new UserGroupDao();
        UserGroup group = userGroupDao.read(groupId);
        user.setGroup(group);

        userDao.update(user);
        response.sendRedirect("/adminUsers");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userIdString = request.getParameter("id");
        int userId = Integer.parseInt(userIdString);

        UserDao userDao = new UserDao();
        User user = userDao.read(userId);
        request.setAttribute("user", user);

        UserGroupDao userGroupDao = new UserGroupDao();
        UserGroup[] groups = userGroupDao.findAll();
        request.setAttribute("groups", groups);

        getServletContext().getRequestDispatcher("/useredit.jsp").forward(request, response);
    }
}
