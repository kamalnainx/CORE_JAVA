// import java.awt.*;

// /**
//  * CJ37_AWT_Label
//  */
// public class CJ37_AWT_Label
// {
//     public static void main(String[] args)
//     {
//         Frame f = new Frame("Label frame");
//         Label l1,l2;

//         l1=new Label("First label");
//         l2=new Label("First label");

//         l1.setBounds(50,100,100,30);
//         l2.setBounds(50,150,100,30);

//         f.add(l1);
//         f.add(l2);
        
//         f.setSize(400, 400);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
    
// }








































































// import java.awt.*;
// import java.awt.event.*;





// /**
//  * CJ37_AWT_Label
//  */
// public class CJ37_AWT_Label extends Frame implements ActionListener
// {
//     TextField tf;
//     Label l;
//     Button b;

//     CJ37_AWT_Label()
//     {
//         Frame f = new Frame("Label frame");
//         Label l1,l2;

//         l1=new Label("add web address");
//         l1.setBounds(50,50,100,30);

//         l2=new Label("web ip is");
//         l2.setBounds(50,100,100,30);
        
//         tf=new TextField();
//         tf.setBounds(200, 50, 150, 25);
        
//         l=new Label();
//         l.setBounds(200, 100, 300, 25);
        
//         b=new Button("get info");
//         b.setBounds(200, 150, 150, 25);
//         b.addActionListener(this);

//         f.add(b);
//         f.add(tf);
//         f.add(l);
//         f.add(l1);
//         f.add(l2);
    
//         f.setSize(600, 400);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
//     public void actionPerformed(ActionEvent e)
//     {
//         try{
//             String host = tf.getText();
//             String ip=java.net.InetAddress.getByName(host).getHostAddress();
//             l.setText("ip of "+host+" is "+ip);
//         }
//         catch(Exception ex)
//         {
//             System.out.println(ex);
//         }
//     }
//     public static void main(String[] args)
//     {
//         new CJ37_AWT_Label();    
//     }
    
    
// }