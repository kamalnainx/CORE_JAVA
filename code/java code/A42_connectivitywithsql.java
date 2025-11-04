// for connect java with sql
// 1. driver class-->(com.mysql.jdbc.driver)
// 2. connection URL jdbc::mysql://localhost:3306/sonoo
// 3. username = root file
// 4. password = root file login password

import java.sql.*;
/**
 * A42_connectivitywithsql
 */
public class A42_connectivitywithsql
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "sa", "Niit@123");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp;");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3));
                con.close();
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}