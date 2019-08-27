package pl.coderslab.controller;

import pl.coderslab.model.Exercise;
import pl.coderslab.model.ExerciseDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/exerciseEdit")
public class ExerciseEditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String exerciseIdString = request.getParameter("id");
        int exerciseId = Integer.parseInt(exerciseIdString);

        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exercise = exerciseDao.read(exerciseId);

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        exercise.setTitle(title);
        exercise.setDescription(description);

        exerciseDao.update(exercise);
        response.sendRedirect("/adminExercises");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String exerciseIdString = request.getParameter("id");
        int exerciseId = Integer.parseInt(exerciseIdString);

        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exercise = exerciseDao.read(exerciseId);
        request.setAttribute("exercise", exercise);

        getServletContext().getRequestDispatcher("/exerciseedit.jsp").forward(request, response);
    }
}
