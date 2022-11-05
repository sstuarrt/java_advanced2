package com.company.java_advanced.homework2.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static String USER_NAME = "root";
    private static String USER_PASSWORD = "root";
    private static String URL = "jdbc:mysql://localhost/library";

    public static Connection openConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
        return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
    }
}
