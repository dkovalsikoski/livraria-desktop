package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection( "jdbc:mysql://localhost:3305/db_livraria?useTimezone=true&serverTimezone=UTC",
                    "livreiro", "Suporte99");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
