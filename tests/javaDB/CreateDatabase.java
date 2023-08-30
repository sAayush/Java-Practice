import java.sql.*;

class CreateDatabase {
    public static void main(String args[]) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "qwerty");

            stmt = con.createStatement();

            stmt.executeUpdate("CREATE DATABASE dbName");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}