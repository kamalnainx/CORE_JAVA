package chapter10;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AuthorsInfo implements ActionListener, ListSelectionListener 
{

    JLabel heading, lauid, lau_name, lphone, laddress, lcity, lstate, lzip;
    JTextField au_idField, au_nameField, phoneField, addressField, cityField, stateField, zipField;
    JButton insert, update, delete, clear, exit;
    JList idlist;
    DefaultListModel dlm;
    JScrollPane lt;
    Connection con;
    PreparedStatement stat;
    Statement stmt;
    ResultSet rs;
    Font f;
    JPanel p1;
    JFrame f1;
    String error;
    boolean flag;

    public AuthorsInfo() 
    {
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=Library;user=sa;password=password@123");

            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT au_id FROM Authors");
            idlist = new JList();
            dlm = new DefaultListModel();
            idlist.setModel(dlm);

            while (rs.next()) 
            {
                dlm.addElement(rs.getString(1));

            }
            con.close();
        } catch (Exception e) 
        {
            System.out.println("Error : " + e);
        }
        flag = true;

    }

    public void compshow() 
    {
        f1 = new JFrame("The Park Library");
        p1 = new JPanel();
        heading = new JLabel("AUTHORS INFORMATION");
        lauid = new JLabel("Author ID:");
        lau_name = new JLabel("Author Name:");
        lphone = new JLabel("Phone Number:");
        laddress = new JLabel("Address:");
        lcity = new JLabel("City:");
        lstate = new JLabel("State:");
        lzip = new JLabel("Zip:");

        au_idField = new JTextField(6);
        au_nameField = new JTextField(50);
        phoneField = new JTextField(15);
        addressField = new JTextField(50);
        cityField = new JTextField(50);
        stateField = new JTextField(50);
        zipField = new JTextField(20);

        insert = new JButton("Insert");
        update = new JButton("Update");
        delete = new JButton("Delete");
        clear = new JButton("Clear");
        exit = new JButton("Exit");
        lt = new JScrollPane(idlist);
        lt.setVisible(true);

        p1.setLayout(null);
        heading.setBounds(250, 35, 200, 40);
        p1.add(heading);

        lauid.setBounds(75, 90, 200, 30);
        au_idField.setBounds(400, 90, 100, 25);
        lt.setBounds(275, 90, 100, 25);

        p1.add(lauid);
        p1.add(au_idField);
        p1.add(lt);

        lau_name.setBounds(75, 120, 200, 30);
        au_nameField.setBounds(400, 120, 200, 25);
        p1.add(lau_name);
        p1.add(au_nameField);

        lphone.setBounds(75, 150, 200, 30);
        phoneField.setBounds(400, 150, 150, 25);
        p1.add(lphone);
        p1.add(phoneField);

        laddress.setBounds(75, 180, 200, 30);
        addressField.setBounds(400, 180, 250, 25);
        p1.add(laddress);
        p1.add(addressField);

        lcity.setBounds(75, 210, 200, 30);
        cityField.setBounds(400, 210, 200, 25);
        p1.add(lcity);
        p1.add(cityField);

        lstate.setBounds(75, 240, 200, 30);
        stateField.setBounds(400, 240, 200, 25);
        p1.add(lstate);
        p1.add(stateField);

        lzip.setBounds(75, 270, 200, 30);
        zipField.setBounds(400, 270, 200, 25);
        p1.add(lzip);
        p1.add(zipField);

        insert.setBounds(25, 350, 100, 30);
        update.setBounds(150, 350, 100, 30);
        delete.setBounds(275, 350, 100, 30);
        clear.setBounds(400, 350, 100, 30);
        exit.setBounds(525, 350, 100, 30);

        p1.add(insert);
        p1.add(update);
        p1.add(delete);
        p1.add(clear);
        p1.add(exit);
        p1.add(exit);

        f1.add(p1);
        f1.setSize(680, 500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        insert.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);
        idlist.addListSelectionListener(this);

    }

    public void actionPerformed(ActionEvent ae) 
    {

        boolean status = false;

        if ((au_idField.getText().equals("")) || (au_nameField.getText().equals("")) || (phoneField.getText().equals("")) || (addressField.getText().equals("")) || (cityField.getText().equals("")) || (stateField.getText().equals("")) || (zipField.getText().equals(""))) 
        {
            status = true;
        }

        if (ae.getActionCommand() == "Exit") 
        {
            System.exit(0);
        }

        if (ae.getActionCommand() == "Insert") 
        {

            if (status == false) 
            {
                for (int i = 0; i < dlm.getSize(); i++) 
                {
                    if ((au_idField.getText().equals(dlm.getElementAt(i).toString()))) 
                    {
                        JOptionPane.showMessageDialog(f1, "Data for " + au_idField.getText() + " is already exists", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                }
                try 
                {

                    con = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=Library;user=sa;password=password@123");

                    stmt = con.createStatement();
                    
                    stat = con.prepareStatement("INSERT INTO Authors VALUES(?, ?, ?, ?, ?,?,?)");
                    String aid = au_idField.getText();
                    String aname = au_nameField.getText();
                    String aphone = phoneField.getText();
                    String aadd = addressField.getText();
                    String acity = cityField.getText();
                    String astate = stateField.getText();
                    String azip = zipField.getText();

                    stat.setString(1, aid);
                    stat.setString(2, aname);
                    stat.setString(3, aphone);
                    stat.setString(4, aadd);
                    stat.setString(5, acity);
                    stat.setString(6, astate);
                    stat.setString(7, azip);

                    stat.executeUpdate();
                    au_idField.setText("");
                    au_nameField.setText("");
                    phoneField.setText("");
                    addressField.setText("");
                    cityField.setText("");
                    stateField.setText("");
                    zipField.setText("");
                    flag = false;
                    dlm.clear();
                    updateValue();
                    JOptionPane.showMessageDialog(f1, "Record has been inserted", "Information", JOptionPane.INFORMATION_MESSAGE);
                    
                    con.close();
                } 
                catch (Exception e) 
                {
                    System.out.println("Error : " + e);
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(f1, "Please fill the details properly.", "Warning", JOptionPane.WARNING_MESSAGE);
                status = false;
            }
        }

        if (ae.getActionCommand() == "Update") {
            
            if (status == false) 
            {
                try 
                {
                    con = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=Library;user=sa;password=password@123");

                    stat = con.prepareStatement("UPDATE Authors SET au_name = ?,phone = ?,address = ?,  city = ?, state = ?, zip = ? where au_id = ?");
                    String aid = au_idField.getText();
                    String aname = au_nameField.getText();
                    String aphone = phoneField.getText();
                    String aadd = addressField.getText();
                    String acity = cityField.getText();
                    String astate = stateField.getText();
                    String azip = zipField.getText();

                    stat.setString(1, aname);
                    stat.setString(2, aphone);
                    stat.setString(3, aadd);
                    stat.setString(4, acity);
                    stat.setString(5, astate);
                    stat.setString(6, azip);
                    stat.setString(7, aid);
                    stat.executeUpdate();
                    au_idField.setText("");
                    au_nameField.setText("");
                    phoneField.setText("");
                    addressField.setText("");
                    cityField.setText("");
                    stateField.setText("");
                    zipField.setText("");
                    JOptionPane.showMessageDialog(f1, "Record has been updated", "Information", JOptionPane.INFORMATION_MESSAGE);
                    con.close();
                } 
                catch (Exception e) 
                {
                    System.out.println("Error " + e.getMessage());
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(f1, "Please fill the details properly.", "Warning", JOptionPane.WARNING_MESSAGE);
                status = false;
            }
        }

        if (ae.getActionCommand() == "Delete") 
        {
            if (status == false) 
            {
                try 
                {
                    con = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=Library;user=sa;password=password@123");

                    String selected_id = au_idField.getText();
                    stat = con.prepareStatement("DELETE from Authors WHERE au_id = ?");
                    stat.setString(1, selected_id);

                    stat.executeUpdate();

                    au_idField.setText("");
                    au_nameField.setText("");
                    phoneField.setText("");
                    addressField.setText("");
                    cityField.setText("");
                    stateField.setText("");
                    zipField.setText("");
                    flag = false;
                    dlm.removeAllElements();

                    updateValue();
                    JOptionPane.showMessageDialog(f1, "Record has been deleted", "Information", JOptionPane.INFORMATION_MESSAGE);


                    con.close();

                } 
                catch (Exception e) 
                {
                    System.out.println("Error " + e);
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(f1, "Select Author ID to delete it.", "Warning", JOptionPane.WARNING_MESSAGE);
                status = false;
            }
        }

        if (ae.getActionCommand() == "Clear") 
        {

            au_idField.setText("");
            au_nameField.setText("");
            phoneField.setText("");
            addressField.setText("");
            cityField.setText("");
            stateField.setText("");
            zipField.setText("");

        }
    }

    public void updateValue() 
    {
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=Library;user=sa;password=password@123");

            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT au_id FROM Authors");


            while (rs.next()) {
                dlm.addElement(rs.getString(1));

            }
            

            con.close();
        } 
        catch (Exception e) 
        {
            System.out.println("ErrorUpdate Value : " + e);
        }
        flag = true;
    }

    public void valueChanged(ListSelectionEvent ae) 
    {
        if (!ae.getValueIsAdjusting()) 
        {
            if (flag == true) 
            {
                try 
                {
                   
                    con = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=Library;user=sa;password=password@123");
                    String selected_id = idlist.getSelectedValue().toString();
                    
                    stmt = con.createStatement();
                    rs = stmt.executeQuery("SELECT au_id, au_name, phone, address,city,state,zip FROM Authors WHERE au_id ='" + selected_id + "'");
                    rs.next();
                    au_idField.setText(rs.getString("au_id"));
                    au_nameField.setText(rs.getString("au_name"));
                    phoneField.setText(rs.getString("phone"));
                    addressField.setText(rs.getString("address"));
                    cityField.setText(rs.getString("city"));
                    stateField.setText(rs.getString("state"));
                    zipField.setText(rs.getString("zip"));
                    con.close();
                } 
                catch (Exception e) 
                {
                    System.out.println("Error : " + e);
                }
            }
        }
    }

    public static void main(String args[]) 
    {
        AuthorsInfo a = new AuthorsInfo();
        a.compshow();
    }
}
