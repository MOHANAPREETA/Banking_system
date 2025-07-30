package com.bsSystem;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Customer_data {
	public static List<Customer> Viewall(Connection connection) {
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT * FROM Accounts";
        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Customer customer = new Customer(
                    rs.getLong("account_number"),
                    rs.getString("full_name"),
                    rs.getString("email"),
                    rs.getDouble("balance"), rs.getDate("sqlDate")
                );
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public static Customer View(Connection connection, long accNum) {
        String query = "SELECT * FROM Accounts WHERE account_number = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setLong(1, accNum);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Customer(
                    rs.getLong("account_number"),
                    rs.getString("full_name"),
                    rs.getString("email"),
                    rs.getDouble("balance"), rs.getDate("sqlDate")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; 
    }
}
