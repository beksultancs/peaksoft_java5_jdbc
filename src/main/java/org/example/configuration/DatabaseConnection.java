package org.example.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Beksultan
 */
public class DatabaseConnection {

    private final Connection connection;

    public DatabaseConnection() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5678/jdbc"
        );
    }

    public Connection getConnection() {
        return connection;
    }
}
