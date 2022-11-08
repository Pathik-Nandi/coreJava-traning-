package com.tarento.JDBCDemo;

import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assesment", "root", "Welcome@123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("user_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
