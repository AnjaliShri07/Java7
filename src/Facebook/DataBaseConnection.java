package Facebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL ="jdbc:mysql://localhost:3306/facebook";
    private static final String USER ="root";
    private static final String PASSWORD ="root";
    //private static final String DRIVER ="com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
