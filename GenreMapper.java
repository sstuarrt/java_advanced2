package com.company.java_advanced.homework2.task1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreMapper {
    public static Genre map(ResultSet result) throws SQLException {
        int id = result.getInt("id");
        String genre = result.getString("name");

        return new Genre(id, genre);
    }
}
