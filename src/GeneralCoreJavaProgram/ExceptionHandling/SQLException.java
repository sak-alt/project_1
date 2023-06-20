package GeneralCoreJavaProgram.ExceptionHandling;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLException {

    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
    static final String USER = "guest";
    static final String PASS = "guest123";
    static final String QUERY = "{call getEmpName (?, ?)}";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             CallableStatement stmt = conn.prepareCall(QUERY);
        ) {
            // Bind values into the parameters.
            stmt.setInt(1, 1);  // This would set ID
            // Because second parameter is OUT so register it
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            //Use execute method to run stored procedure.
            System.out.println("Executing stored procedure...");
            stmt.execute();
            //Retrieve employee name with getXXX method
            String empName = stmt.getString(2);
            System.out.println("Emp Name with ID: 1 is " + empName);
        } catch (java.sql.SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
