package com.company.java_advanced.homework2.task1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        BookDAO bookDAO = new BookDAO(ConnectionUtil.openConnection());
        GenreDAO genreDAO = new GenreDAO(ConnectionUtil.openConnection());
        CustomersDAO customersDAO = new CustomersDAO(ConnectionUtil.openConnection());

        bookDAO.readAll().stream().forEach(System.out::println);
        genreDAO.readAll().stream().forEach(System.out::println);;
        customersDAO.readAll().stream().forEach(System.out::println);;
    }
}
