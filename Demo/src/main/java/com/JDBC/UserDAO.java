package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO {
    
    public boolean validateUser(String username, String password) throws SQLException, ClassNotFoundException {
        String query = "SELECT * from users where username=? and password=?";
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                System.out.println("User found: " + rs.getString("username")); 
                return true;
            } else {
                System.out.println("No user found with given credentials.");
            }
            
        }
        
        return false;
    }
    
    
    
    
    
    public boolean validatePizzaUser(String username, String password, String email) throws SQLException, ClassNotFoundException {
    	
    	
    	String emailquery = "SELECT * from PizzaCustomer1 where email=?";
    	try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(emailquery)) {
               ps.setString(1, email);
               ResultSet rs = ps.executeQuery();
               
               if (rs.next()) {
                   System.out.println("User found: " + rs.getString("username")); 
                   return false;
               } else {
                   System.out.println("No user found with given credentials.");
               }
    	}
    	
    	
        String query = "SELECT * from PizzaCustomer1 where username=? and password=? and email=?";
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                System.out.println("User found: " + rs.getString("username")); 
                return false;
            } else {
                System.out.println("No user found with given credentials.");
            }
            
        }
        
        return true;
    }
	
    
    
    
    
    
    public boolean validatePizzaUser(String username, String password) throws SQLException, ClassNotFoundException {
        String query = "SELECT * from PizzaCustomer1 where username=? and password=?";
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                System.out.println("User found: " + rs.getString("username")); 
                return true;
            } else {
                System.out.println("No user found with given credentials.");
            }
            
        }
        
        return false;
    }
	
	
}
