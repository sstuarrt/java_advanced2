package com.company.java_advanced.homework2.task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GenreDAO {
    static String READ_ALL = "select * FROM genre";
    static String INSERT = "insert into genre (name) values (Tale)";
    static String SELECT_ID = "select * FROM genre WHERE id = ";
    static String UPDATE_ID = "update genre set (name) WHERE id = ";
    static String DELETE_ID = "delete from genre WHERE id = ";

    private Connection connection;
    private PreparedStatement statement;

    public GenreDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Genre genre) throws SQLException {
        statement = connection.prepareStatement(INSERT);
        statement.setString(1,genre.getName());
    }

    public Genre selectID(int id) throws SQLException {
        statement = connection.prepareStatement(SELECT_ID);
        statement.setInt(0, id);
        return GenreMapper.map(statement.executeQuery());
    }

    public void updateID(Genre genre) throws SQLException {
        statement = connection.prepareStatement(UPDATE_ID);
        statement.setString(1, genre.getName());
        statement.setInt(0, genre.getId());
        statement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        statement = connection.prepareStatement(DELETE_ID);
        statement.setInt(0, id);
        statement.executeUpdate();
    }

    public List<Genre> readAll() throws SQLException {
        List<Genre> genreList = new ArrayList<>();

        statement = connection.prepareStatement(READ_ALL);
        ResultSet result = statement.executeQuery();

        while(result.next()) {
            genreList.add(GenreMapper.map(result));
        }

        return genreList;
    }
}
