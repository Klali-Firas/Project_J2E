package org.example.demo.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleTonConnection {
    private static Connection con;
    static{
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/j2e", "postgres", "CondorA8");
    } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() {
        return con;
    }

    public static void main(String[] args) {
        System.out.println(SingleTonConnection.getConnection());
    }
}

