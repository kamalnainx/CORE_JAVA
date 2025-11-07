package metadata;

import java.sql.*;
import java.util.Scanner;

public class ColumnInfo 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        String tablename;

        try 
        {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Library;user=sa;password=password@123");) 
            {
                System.out.println("Enter the table name: ");
                tablename = sc.nextLine();

                String str = "SELECT * FROM " +  tablename + " ";
                try (Statement stmt = con.createStatement();) 
                {
                    ResultSet rs = stmt.executeQuery(str);
                    ResultSetMetaData rsmd = rs.getMetaData();
                    rs.next();

                    System.out.println("==================================================================");
                    System.out.println("Number of Attributes in the authors Table: " + rsmd.getColumnCount());
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    System.out.println("Attributes of the " + tablename + " Table");
                    System.out.println("-------------------------------------");

                    for (int i = 1; i <= rsmd.getColumnCount(); i++) 
                    {
                        System.out.println(rsmd.getColumnName(i) + " : " + rsmd.getColumnTypeName(i));
                    }

                }
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error : " + e);
        }
    }
}
