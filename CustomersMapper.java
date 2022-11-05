package com.company.java_advanced.homework2.task1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomersMapper {
    public static Customers map(ResultSet result) throws SQLException {
        int id = result.getInt("id");
        String first_name = result.getString("first_name");
        String second_name = result.getString("second_name");
        String email = result.getString("email");

        return new Customers(id, first_name, second_name, email);
    }
}
