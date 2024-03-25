package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    static String URL = "jdbc:postgresql://localhost:5432/postgres";
    static String USERNAME = "postgres";
    static String PASSWORD = "postgres";

    public static Connection getConnectToDatabase() throws SQLException, ClassNotFoundException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}


