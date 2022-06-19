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
        } catch (Exception e) {
            return null;
        }
    }

//    public void createUserSpecficTable(String tableName) throws SQLException {
//        Connection conn = getCon();
//        Statement stmt = conn.createStatement();
//
//        String sql = String.format("CREATE TABLE IF NOT EXISTS %s (" +
//        " ID                 INT               PRIMARY KEY       AUTO_INCREMENT    , " +
//        " NAME               VARCHAR(255)                        NOT NULL          , " +
//        " USERNAME           VARCHAR(255)                        NOT NULL          , " +
//        " EMAIL              VARCHAR(255)                        NOT NULL          , " +
//        " PHONE              VARCHAR(255)                        NOT NULL          , " +
//        " PASSWORD           VARCHAR(255)                        NOT NULL);", tableName);
//        stmt.executeUpdate(sql);
//        System.out.println("Created user specific table in given database...");
//    }
}
