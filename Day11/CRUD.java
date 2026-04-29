import java.sql.*;

public class CRUD {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password"
            );

            Statement stmt = con.createStatement();

            // INSERT
            String insert = "INSERT INTO student VALUES (2205650,'Aditya Bajaj',93)";
            stmt.executeUpdate(insert);
            System.out.println("1 record inserted");

            // UPDATE
            String update = "UPDATE student SET marks=95 WHERE rollno=2205650";
            stmt.executeUpdate(update);
            System.out.println("1 record updated");

            // DELETE
            String delete = "DELETE FROM student WHERE rollno=2205650";
            stmt.executeUpdate(delete);
            System.out.println("1 record deleted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}