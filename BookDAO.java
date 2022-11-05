package com.company.java_advanced.homework2.task1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    static String READ_ALL = "select * FROM book";
    static String INSERT = "insert into book (name, author, pages) values (Alice in Wonderland, Luis Carrol, 345)";
    static String SELECT_ID = "select * FROM book WHERE id = ";
    static String UPDATE_ID = "update book set (name, author) WHERE id = ";
    static String DELETE_ID = "delete from book WHERE id = ";
    private Connection connection;
    private PreparedStatement statement;

    public BookDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Book book) throws SQLException {
        statement = connection.prepareStatement(INSERT);
        statement.setString(1,book.getName());
        statement.setString(2,book.getAuthor());
        statement.setInt(3, 345);
    }

    public Book selectID(int id) throws SQLException {
        statement = connection.prepareStatement(SELECT_ID);
        statement.setInt(0, id);
        return BookMapper.map(statement.executeQuery());
    }

    public void updateID(Book book) throws SQLException {
        statement = connection.prepareStatement(UPDATE_ID);
        statement.setString(1, book.getName());
        statement.setString(2, book.getAuthor());
        statement.setInt(0, book.getId());
        statement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        statement = connection.prepareStatement(DELETE_ID);
        statement.setInt(0, id);
        statement.executeUpdate();
    }

    public List<Book> readAll() throws SQLException {
        List<Book> bookList = new ArrayList<>();

        statement = connection.prepareStatement(READ_ALL);
        ResultSet result = statement.executeQuery();

        while(result.next()) {
            bookList.add(BookMapper.map(result));
        }

        return bookList;
    }
}
