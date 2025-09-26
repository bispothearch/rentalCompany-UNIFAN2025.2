package external.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class repoSQLite {
    String url = "jdbc:sqlite:database.db";
    Connection conn = DriverManager.getConnection(url);
}
