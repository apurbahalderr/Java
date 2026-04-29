import java.sql.*;
import java.util.Scanner;

public class DisplayOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password"
            );

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM student WHERE rollno=" + roll;

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getInt(3)
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}