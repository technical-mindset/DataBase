# Implementation

package com.DesignPattern;

import java.sql.*;
import java.sql.ResultSet;

public class DBConnection {
    private static DBConnection dbinstance;
    private Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/mydatabase";
    private String username = "user";
    private String password = "1234567890";

    private DBConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
    public static DBConnection getInstance() throws SQLException {
        if (dbinstance == null) {
            dbinstance = new DBConnection();
        } else if (dbinstance.getConnection().isClosed()) {
            dbinstance = new DBConnection();
        }

        return dbinstance;
    }
}

