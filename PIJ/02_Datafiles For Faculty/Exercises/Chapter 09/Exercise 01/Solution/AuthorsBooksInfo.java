package chapter09;

import java.sql.*;

public class AuthorsBooksInfo 
{

    public static void main(String args[]) {
        try {
            String str = "SELECT a.au_id, a.au_name,b.book_name From Authors a,Books b WHERE a.au_id=b.au_id";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Library;user=sa;password=password@123");
                    Statement stmt = con.createStatement();) {

                ResultSet rs = stmt.executeQuery(str);

                System.out.println("Author Id       Authors Name    Book Name   ");
                System.out.println("----------------------------------------------");

                while (rs.next()) {
                    String au_id = rs.getString("au_id");
                    String au_name = rs.getString("au_name");
                    String bookname = rs.getString("book_name");
                    System.out.print(au_id + "\t\t");
                    System.out.print(au_name + "\t");
                    System.out.print(bookname + "\n");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error occurred");
            System.out.println("Error:" + ex);
        }
    }
}
