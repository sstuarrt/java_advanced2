package com.company.java_advanced.homework2.task1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper {
    public static Book map(ResultSet result) throws SQLException {
        int id = result.getInt("id");
        String name = result.getString("name");
        String author = result.getString("author");
        int pages = result.getInt("pages");

        return new Book(id, name, author, pages);
    }
}
