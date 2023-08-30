import java.sql.*;
import java.util.Scanner;

public class Database {
    // JDBC driver name, database URL, username, and password
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/java";
    static final String USER = "root";
    static final String PASS = "qwerty";

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            System.out.print("Enter name: ");
            String namein = sc.nextLine();
            System.out.print("Enter age: ");
            int agein = sc.nextInt();

            try {
                // Register JDBC driver
                Class.forName(JDBC_DRIVER);

                // Open a connection to the database
                conn = DriverManager.getConnection(DB_URL, USER, PASS);

                // Create a table to store details
                stmt = conn.createStatement();
                String createTableSql = "CREATE TABLE IF NOT EXISTS details " +
                        "(id INT PRIMARY KEY AUTO_INCREMENT, " +
                        "name VARCHAR(50), " +
                        "age INT)";
                stmt.execute(createTableSql);

                // Insert data into the details table
                String insertDataSql = "INSERT INTO details (name, age) VALUES (?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(insertDataSql);
                pstmt.setString(1, namein);
                pstmt.setInt(2, agein);
                pstmt.execute();

                // Fetch data from the details table
                String fetchDataSql = "SELECT * FROM details";
                rs = stmt.executeQuery(fetchDataSql);

                // Print fetched data
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // Close resources
                    if (rs != null)
                        rs.close();
                    if (stmt != null)
                        stmt.close();
                    if (conn != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }
}
