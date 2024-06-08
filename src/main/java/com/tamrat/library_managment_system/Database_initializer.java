package com.tamrat.library_managment_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_initializer {

    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "tamr@miracle24!";
    private static final String DATABASE_NAME = "library_db";
    private static final String FULL_URL = URL + DATABASE_NAME;

    public static void main(String[] args) {

        try {
            // Create database if it does not exist
            Connection connection = DriverManager.getConnection(FULL_URL , USER, PASSWORD);
            Statement statement = connection.createStatement();
            /*String db = "CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME;
            statement.executeUpdate(db);
            connection.close();

            connection = DriverManager.getConnection(FULL_URL, USER, PASSWORD);
            statement = connection.createStatement();
            String createTableSql = "CREATE TABLE IF NOT EXISTS book (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "title VARCHAR(100), " +
                    "author VARCHAR(100), " +
                    "isbn VARCHAR(20), " +
                    "available BOOLEAN)";
            statement.executeUpdate(createTableSql);*/


           /* String member = "CREATE TABLE IF NOT EXISTS member (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "title VARCHAR(100), " +
                    "author VARCHAR(100), " +
                    "isbn VARCHAR(20), " +
                    "available BOOLEAN)";
            statement.executeUpdate(member);*/
//            String author = "CREATE TABLE IF NOT EXISTS author (" +
//                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
//                    "title VARCHAR(100), " +
//                    "author VARCHAR(100), " +
//                    "isbn VARCHAR(20), " +
//                    "available BOOLEAN)";
//            statement.executeUpdate(author);

            String writer = "CREATE TABLE IF NOT EXISTS writer (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "title VARCHAR(100), " +
                    "author VARCHAR(100), " +
                    "isbn VARCHAR(20), " +
                    "available BOOLEAN)";
           statement.executeUpdate(writer);


//            String con = "CREATE TABLE IF NOT EXISTS con (" +
//                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
//                    "title VARCHAR(100), " +
//                    "author VARCHAR(100), " +
//                    "isbn VARCHAR(20), " +
//                    "available BOOLEAN)";
//            statement.executeUpdate(con);


            System.out.println("Database created or already exists.");
            System.out.println("Table created or already exists.");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
