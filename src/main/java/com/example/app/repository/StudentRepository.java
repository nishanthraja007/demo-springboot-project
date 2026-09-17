package com.example.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRepository {
    private final String url = "jdbc:mysql://localhost:3306/jdbc";
    private final String username = "root";
    private final String password = "nishanth8590804396";
    private final String query = "INSERT INTO student (name, id, dept) VALUES (?, ?, ?)";

    public void create(String name, int id, String dept) {
        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setInt(2, id);
            ps.setString(3, dept);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student inserted successfully");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
