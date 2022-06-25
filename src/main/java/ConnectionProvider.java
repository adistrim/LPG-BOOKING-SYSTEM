/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aditya
 */

import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lbs?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "adiadmin123");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
    // table creation of username
    public void createUserSpecficTable(String tableName) throws SQLException {
        Connection conn = getCon();
        Statement stmt = conn.createStatement();

        String sql = String.format("CREATE TABLE IF NOT EXISTS %s (" +
        " ID                INT                                 NOT NULL        AUTO_INCREMENT          PRIMARY KEY , " +
        " category          VARCHAR(255)                        NULL          , " +
        " delivery          VARCHAR(255)                        NULL          , " +
        " deliveredby       VARCHAR(255)                        NULL          , " +
        " address           VARCHAR(255)                        NULL          , " +
        " complain          VARCHAR(255)                        NULL          , " +
        " issuesolved       VARCHAR(255)                        NULL          , " +
        " revenue           INT(255)                            NULL);", tableName);
        stmt.executeUpdate(sql);
        System.out.println("Created user specific table in given database...");
        
    }
    
    // table creation of workname
     public void createworkerSpecficTable(String tableName) throws SQLException {
        Connection conn = getCon();
        Statement stmt = conn.createStatement();

        String sql = String.format("CREATE TABLE IF NOT EXISTS %s (" +
        " date              DATE                                NULL          , " +
        " delivery          VARCHAR(255)                        NULL          , " +
        " ID                INT                                 NULL          , " +
        " address           VARCHAR(255)                        NULL          , " +
        " revenue           INT(255)                            NULL);", tableName);
        stmt.executeUpdate(sql);
        System.out.println("Created WORKER specific table in given database...");
        
    }
}
