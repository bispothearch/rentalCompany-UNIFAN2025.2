package external.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class repoSQLite {
    String url = "jdbc:sqlite:database.db";

    public repoSQLite() {
        try {
            Connection conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco SQLite", e);
        }
    }
}
