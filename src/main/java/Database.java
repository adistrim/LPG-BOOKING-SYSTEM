import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Operations {
    
    private static Connection conn;
    private static Statement stat;
    
    Operations() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lbs", "root", "adiadmin123");
        stat = conn.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS Users (" +
                " ID                 INT               PRIMARY KEY       AUTO_INCREMENT    , " +
                " NAME               VARCHAR(255)                        NOT NULL          , " +
                " USERNAME           VARCHAR(255)                        NOT NULL          , " +
                " AGE                INT                                 NOT NULL          , " +
                " EMAIL              VARCHAR(255)                        NOT NULL          , " +
                " PHONE              VARCHAR(255)                        NOT NULL          , " +
                " PASSWORD           VARCHAR(255)                        NOT NULL);";
        stat.executeUpdate(sql);
        stat.close();
        conn.close();
    }

    public void executeQuery(String sqlQuery) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lbs", "root", "adiadmin123");
        stat = conn.createStatement();
        conn.setAutoCommit(false);
        stat.executeUpdate(sqlQuery);
        conn.commit();
        stat.close();
        conn.close();
    }

    public void create(String table, String name, String username, int age, String email, String phone, String password) {
        String sqlQuery = String.format(
                "INSERT INTO %s (NAME, USERNAME, AGE, EMAIL, PHONE, PASSWORD) VALUES ('%s', '%s', %d, '%s', '%s', '%s');",
                table, name, username, age, email, phone, password);
       try {
           executeQuery(sqlQuery);
       } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
       }
    }
}

public class Database {
    public static void main(String[] args) {
        Operations op;
        try {
            op = new Operations();
            op.create("Users", "name", "username", 1, "mail@gmail.com", "1234576543", "^$2password123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

