package com.company.java_advanced.homework2.task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomersDAO {
    static String READ_ALL = "select * FROM customers";
    static String INSERT = "insert into customers (first_name, second_name, email) values (Kate, Brown, brown@gmail.com)";
    static String SELECT_ID = "select * FROM book WHERE id = ";
    private Connection connection;
    private PreparedStatement statement;

    public CustomersDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Customers customer) throws SQLException {
        statement = connection.prepareStatement(INSERT);
        statement.setString(1,customer.getFirst_name());
        statement.setString(2,customer.getSecond_name());
        statement.setString(3,customer.getEmail());
    }

    public Customers selectID(int id) throws SQLException {
        statement = connection.prepareStatement(SELECT_ID);
        statement.setInt(0, id);
        return CustomersMapper.map(statement.executeQuery());
    }

    public List<Customers> readAll() throws SQLException {
        List<Customers> customersList = new ArrayList<>();

        statement = connection.prepareStatement(READ_ALL);
        ResultSet result = statement.executeQuery();

        while(result.next()) {
            customersList.add(CustomersMapper.map(result));
        }

        return customersList;
    }
}
