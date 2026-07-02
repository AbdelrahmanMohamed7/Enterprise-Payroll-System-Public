package employee.payroll.system;

import java.sql.*;
import javax.swing.*;

public class db {
    
    public static Connection java_db() {
        try {
            Class.forName("org.sqlite.JDBC");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlite:empnet.sqlite");
            
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database Connection Error: " + e.getMessage());
            return null;
        }
    }
}