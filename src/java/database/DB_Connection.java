package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DB_Connection {

    private static final String url = "jdbc:mysql://localhost";
    private static final String databaseName = "HY360_2022";
    private static final int port = 3306;
    private static final String username = "root";
    private static final String password = "";

    /**
     * Attempts to establish a database connection
     *
     * @return a connection to the database
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Connected to database.");
        return DriverManager.getConnection(url + ":" + port + "/" + databaseName, username, password);
    }

    public static Connection getInitialConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url + ":" + port, username, password);
    }

    public static Connection closeConnection() throws SQLException, ClassNotFoundException {
        closeConnection().close();
        System.out.println("Disconnected from database.");
        return null;
    }

}