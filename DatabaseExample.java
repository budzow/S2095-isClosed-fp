import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseExample {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        
        try {
			connection = DriverManager.getConnection("jdbc:your_database_url"); //java:S2095 raises an fp when !connection.isClosed() is used on line 14
            
        } finally {
			if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

    }
	
}