package databaseconnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    final String DB_URL = "jdbc:postgresql://localhost:5432/FirstDatabase";
    final String USER = "postgres";
    final String PASS = "Listdetelinka007";

    private Connection conn;

    @Before
    public void setUp() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    @Test
    public void checkUserTest() throws SQLException {
        String sql = "SELECT * FROM users WHERE id=2";

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        rs.next();

        System.out.println(rs.getString("username"));
        System.out.println(rs.getString("password"));

        assertEquals("username2", rs.getString("username"));
        assertEquals("password2", rs.getString("password"));
    }

    @After
    public void tearDown() throws SQLException {
        conn.close();
    }
}
