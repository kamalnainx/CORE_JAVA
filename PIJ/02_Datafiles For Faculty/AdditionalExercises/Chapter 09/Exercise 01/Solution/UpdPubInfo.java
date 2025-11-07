package chapter09;

import java.sql.*;

public class UpdPubInfo 
{

    public static void main(String args[]) 
    {

        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Library;user=sa;password=password@123");) {
                Statement stmt = con.createStatement();
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("SELECT pub_id, pub_name, city, state FROM Publishers WHERE pub_id='P002'");
                rs.next();
                rs.updateString("state", "QX");
                rs.updateString("city", "Oxford");
                rs.updateRow();
                System.out.println("The details have been udpated");

            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Error occurred");
            System.out.println("Error:" + ex);
        }
    }
}
