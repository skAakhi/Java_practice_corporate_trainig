package com.Servlet2;
import com.JDBC.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
  //  private static final long serialVersionUID = 1L;
    private StudentDAO studentDAO;

    public void init() {
        studentDAO = new StudentDAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "view":
                    viewStudent(request, response);
                    break;
                case "delete":
                    deleteStudent(request, response);
                    break;
                default:
                    response.sendRedirect("index.html");
                    break;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException("Database error: " + ex.getMessage(), ex);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "insert":
                    insertStudent(request, response);
                    break;
                case "update":
                    updateStudent(request, response);
                    break;
                default:
                    response.sendRedirect("index.html");
                    break;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException("Database error: " + ex.getMessage(), ex);
        }
    }

    private void viewStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ClassNotFoundException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = studentDAO.getStudent(id);
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            if (student != null) {
                out.println("<h2>Student Details:</h2>");
                out.println("<p>ID: " + student.getId() + "</p>");
                out.println("<p>Name: " + student.getName() + "</p>");
                out.println("<p>Branch: " + student.getBranch() + "</p>");
            } else {
                out.println("<h2>No student found with ID: " + id + "</h2>");
            }
        }
    }

    private void insertStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ClassNotFoundException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String branch = request.getParameter("branch");
        Student newStudent = new Student(id, name, branch);
        int result = studentDAO.addStudent(newStudent);
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            if (result > 0) {
                out.println("<h2>Student added successfully!</h2>");
            } else {
                out.println("<h2>Error adding student.</h2>");
            }
        }
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ClassNotFoundException {
        int id = Integer.parseInt(request.getParameter("id"));
        int result = studentDAO.deleteStudent(id);
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            if (result > 0) {
                out.println("<h2>Student deleted successfully!</h2>");
            } else {
                out.println("<h2>Error deleting student.</h2>");
            }
        }
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ClassNotFoundException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String branch = request.getParameter("branch");
        Student updatedStudent = new Student(id, name, branch);
        int result = studentDAO.updateStudent(updatedStudent);
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            if (result > 0) {
                out.println("<h2>Student updated successfully!</h2>");
            } else {
                out.println("<h2>Error updating student.</h2>");
            }
        }
    }
}