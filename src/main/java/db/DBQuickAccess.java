package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBQuickAccess {

    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect() {

        // SQLite connection string
        String url = "jdbc:sqlite:database.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * Insert a new row into the test table
     *
     * @param label
     * @param content
     */
    public void insert(String label, String content) {

        String sql = "INSERT INTO test(label, content) VALUES(?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, label);
            pstmt.setString(2, content);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DBQuickAccess app = new DBQuickAccess();
        // insert three new rows
        app.insert("Best", "Besteth me nought!");
        app.insert("Better", "Bestter than best?");
        app.insert("Nonsense", "Absolute nonsense!");
    }

}