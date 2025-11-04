// import javax.swing.*;
// /**
//  * ACJ17_swing3_checkbox_radio_combobox
//  */
// public class ACJ17_swing3_checkbox_radio_combobox
// {
//     public static void main(String[] args)
//     {
//         JFrame jf3= new JFrame("java frame 3");
        
//         JCheckBox jcb1= new JCheckBox("option 1");
//         jcb1.setBounds(50,50,100,25);
//         jf3.add(jcb1);
//         jf3.setSize(300, 300);
//         jf3.setLayout(null);
//         jf3.setVisible(true);
//     }   
// }











// import javax.swing.*;
// /**
//  * ACJ17_swing3_checkbox_radio_combobox
//  */
// public class ACJ17_swing3_checkbox_radio_combobox
// {
//     ACJ17_swing3_checkbox_radio_combobox()
//     {
//         JFrame jf3= new JFrame("java frame 3");
        
//         JCheckBox jcb1= new JCheckBox("option 1");
//         jcb1.setBounds(50,50,100,25);
//         jf3.add(jcb1);

//         JCheckBox jcb2= new JCheckBox("option 2");
//         jcb2.setBounds(50,100,100,25);
//         jf3.add(jcb2);

//         jf3.setSize(300, 300);
//         jf3.setLayout(null);
//         jf3.setVisible(true);

//     }
//     public static void main(String[] args)
//     {
//         ACJ17_swing3_checkbox_radio_combobox acj17_1= new ACJ17_swing3_checkbox_radio_combobox();
//     }   
// }













// import javax.swing.*;
// import java.awt.event.*;
// /**
//  * ACJ17_swing3_checkbox_radio_combobox
//  */
// public class ACJ17_swing3_checkbox_radio_combobox extends JFrame implements ActionListener
// {
//     JLabel jl1;
//     JCheckBox cb1,cb2,cb3,cb4;
//     JButton jb1;
//     ACJ17_swing3_checkbox_radio_combobox()
//     {
//         jl1=new JLabel("Select your item");
//         jl1.setBounds(50, 50, 250, 25);

//         cb1 = new JCheckBox("apple @100");
//         cb1.setBounds(100, 50, 200, 25);

//         cb2 = new JCheckBox("Banana @50");
//         cb2.setBounds(100, 100, 200, 25);

//         cb3 = new JCheckBox("cheey @250");
//         cb3.setBounds(100, 150, 200, 25);

//         cb4 = new JCheckBox("date @150");
//         cb4.setBounds(100, 200, 200, 25);

//         jb1 = new JButton("total amount");
//         jb1.setBounds(100, 250, 200, 25);

//         jb1.addActionListener(this);
//         add(jl1);
//         add(cb1);
//         add(cb2);
//         add(cb3);
//         add(cb4);
//         add(jb1);
        
        
//         setSize(400, 400);
//         setLayout(null);
//         setVisible(true);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }
//     public void actionPerformed(ActionEvent e)
//     {
//         float amount1=0;
//         String msg="";
//         if(cb1.isSelected())
//         {
//             amount1+=100;
//             msg+="apple amount is 100\n";
//         }
//         if(cb2.isSelected())
//         {
//             amount1+=50;
//             msg+="banana amount is 50\n";
//         }
//         if(cb3.isSelected())
//         {
//             amount1+=250;
//             msg+="cherry amount is 250\n";
//         }
//         if(cb4.isSelected())
//         {
//             amount1+=150;
//             msg+="Date amount is 150\n";
//         }
//         msg+="___________________\n";
//         JOptionPane.showMessageDialog(this, msg+" total amount:-"+amount1);
        
//     }
//     public static void main(String[] args)
//     {
//         ACJ17_swing3_checkbox_radio_combobox acj17_1= new ACJ17_swing3_checkbox_radio_combobox();
//     }   
// }
