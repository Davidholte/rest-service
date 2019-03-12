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
        String url = "jdbc:sqlite:test.db";
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
     * @param username
     * @param password
     * @param email
     */
    public void insert(String username, String password, String email) {

        String sql = "INSERT INTO accounts(username, password, email) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
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
        app.insert("Dave", "1234", "dave@dave.dave");
        app.insert("Sven", "admin", "sven@sven.sven");
        app.insert("Lars", "admin1234", "lars@lars.lars");
    }

}