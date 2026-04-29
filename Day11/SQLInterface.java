import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class SQLInterface implements ActionListener {

    JFrame f;
    JTextField queryField;
    JTextArea outputArea;
    JButton execute;

    SQLInterface() {

        f = new JFrame("SQL Query Interface");

        JLabel title = new JLabel("SQL Query Interface");
        title.setBounds(120, 20, 250, 30);

        JLabel l1 = new JLabel("Enter SQL Statement:");
        l1.setBounds(30, 70, 150, 30);

        queryField = new JTextField();
        queryField.setBounds(180, 70, 200, 30);

        execute = new JButton("EXECUTE Query");
        execute.setBounds(130, 120, 150, 30);

        outputArea = new JTextArea();
        outputArea.setBounds(30, 180, 350, 150);

        execute.addActionListener(this);

        f.add(title);
        f.add(l1);
        f.add(queryField);
        f.add(execute);
        f.add(outputArea);

        f.setSize(450, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String query = queryField.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password"
            );

            Statement stmt = con.createStatement();

            // Check query type
            if (query.trim().toLowerCase().startsWith("select")) {

                ResultSet rs = stmt.executeQuery(query);

                String result = "";

                while (rs.next()) {
                    result += rs.getString(1) + "\n"; // first column
                }

                outputArea.setText(result);

            } else {
                int rows = stmt.executeUpdate(query);
                outputArea.setText(rows + " row(s) affected");
            }

            con.close();

        } catch (Exception ex) {
            outputArea.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new SQLInterface();
    }
}