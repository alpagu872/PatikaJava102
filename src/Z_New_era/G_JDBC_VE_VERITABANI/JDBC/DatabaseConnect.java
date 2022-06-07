package Z_New_era.G_JDBC_VE_VERITABANI.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnect {

    public static final String DB_URL = "jdbc:postgresql://localhost:5432/Northwind";
    public static final String DB_USERNAME = "postgres";
    public static final String DB_PASSWORD = "1234";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            Statement statement =  connection.createStatement();
            String query = "SELECT * FROM employee_territories";

            String insertSqlQuery = "INSERT INTO employee_territories (territory_id) VALUES (313132)";
            statement.executeUpdate(insertSqlQuery);
            ResultSet data = statement.executeQuery(query);

            while (data.next()){

            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
