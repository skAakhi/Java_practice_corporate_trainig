package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
    public static  String URL = "jdbc:oracle:thin:@localhost:1521/orcl";
    public static  String USER = "sys as sysdba";
    public static  String PASSWORD = "6541";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
      Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

