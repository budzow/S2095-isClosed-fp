import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseExample {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:your_database_url", "username", "password");
        PreparedStatement ps = null;
        try {

            ps = connection.prepareStatement("SELECT * FROM DUAL");
        } finally {
            if (ps != null && !ps.isClosed()) { // FP raised
                ps.close();
            }
        }

    }
	
}