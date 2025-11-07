package book;

import java.sql.*;

public class AuthorsInfo 
{
    public static void main(String args[]) 
    {
        try 
        {
            String str = "SELECT * FROM Authors WHERE city LIKE 'S%'";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=Library;user=sa;password=password@123");
                    Statement stmt = con.createStatement();) 
            {
                ResultSet rs = stmt.executeQuery(str);

                System.out.println("Author ID\tAuthor Name\tCity");
                System.out.println("----------------------------------------------");

                while (rs.next()) 
                {
                    String id = rs.getString("au_id");
                    String name = rs.getString("au_name");
                    String city = rs.getString("city");
                    System.out.print(id + "\t");

                    if (name.length() <= 7) 
                    {
                        System.out.print(name + "\t\t");
                    } 
                    else 
                    {
                        System.out.print("\t" + name + "\t");
                    }
                    System.out.println(city);
                }
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Error occurred");
            System.out.println("Error:" + ex);
        }
    }
}
