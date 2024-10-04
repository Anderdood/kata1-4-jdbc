package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/katadb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connect true..");
        } catch (SQLException e) {
            System.err.println("Ошибка подключения к базе данных.");
            e.printStackTrace();
        }
        return connection;
    }
}
