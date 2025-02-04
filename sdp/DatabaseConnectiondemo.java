import java.sql.*;
import java.io.*;

class DatabaseConnection {
    private static Connection con;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            if (con == null) {
                synchronized (DatabaseConnection.class) {
                    if (con == null) {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:8080/sms", "root", "root");
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (DatabaseConnection) con;
    }
}

class DatabaseConnectiondemo {
    public static void main(String[] args) {
        Connection con = (Connection) DatabaseConnection.getConnection();
        try {
            if (con.isClosed()) {
                System.out.println("connection is not create.....");
            }
            else{
                System.out.println("connection is crate sussucessfully....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
