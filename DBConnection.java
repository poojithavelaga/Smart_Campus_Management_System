import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con = null;

    public static Connection getConnection() {

        try {

            if (con == null || con.isClosed()) {

                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/smart_campus",
                        "root",
                        "@23471A04e7");

                System.out.println("Database Connected Successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}