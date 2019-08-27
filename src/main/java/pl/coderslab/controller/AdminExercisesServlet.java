package pl.coderslab.controller;

import pl.coderslab.model.Exercise;
import pl.coderslab.model.ExerciseDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminExercises")
public class AdminExercisesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise[] exercises = exerciseDao.findAll();
        request.setAttribute("exercises", exercises);

        getServletContext().getRequestDispatcher("/adminexercises.jsp").forward(request, response);
    }
}
