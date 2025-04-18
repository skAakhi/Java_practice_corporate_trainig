package com.JDBC;

import com.Servlet2.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentDAO {
	
	
    public Student getStudent(int id) throws SQLException, ClassNotFoundException {
    	
        String query = "SELECT name, branch FROM student1 WHERE id = ?";
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(id, rs.getString("name"), rs.getString("branch"));
            } else {
                return null;
            }
        }
    }

    public int addStudent(Student student) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO student1 (id, name, branch) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getBranch());
            return ps.executeUpdate();
        }
    }

    public int updateStudent(Student student) throws SQLException, ClassNotFoundException {
        String query = "UPDATE student1 SET name = ?, branch = ? WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getBranch());
            ps.setInt(3, student.getId());
            return ps.executeUpdate();
        }
    }

    public int deleteStudent(int id) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM student1 WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            return ps.executeUpdate();
        }
    }
}
