package pl.coderslab.controller;

import pl.coderslab.model.ExerciseDao;
import pl.coderslab.model.Solution;
import pl.coderslab.model.SolutionDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/exerciseDelete")
public class ExerciseDeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String exerciseIdString = request.getParameter("id");
        int exerciseId = Integer.parseInt(exerciseIdString);

        SolutionDao solutionDao = new SolutionDao();
        Solution[] solutions = solutionDao.findAllByExercise(exerciseId);

        if (solutions.length == 0) {
            ExerciseDao exerciseDao = new ExerciseDao();
            exerciseDao.delete(exerciseId);
            response.sendRedirect("/adminExercises");
        } else {
            getServletContext().getRequestDispatcher("/exercisecantdelete.jsp").forward(request, response);
        }

    }
}
