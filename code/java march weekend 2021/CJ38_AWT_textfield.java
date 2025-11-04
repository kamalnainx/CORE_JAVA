import java.awt.Frame;
import java.awt.TextField;

/**
 * CJ38_AWT_textfield
 */
public class CJ38_AWT_textfield 
{
    public static void main(String[] args)
    {
        Frame f = new Frame("textField ");
        
        TextField t1, t2;
        
        t1 = new TextField("this is text filed");
        t1.setBounds(50,100,200,30);

        t2 = new TextField("this is 2nd text filed");
        t2.setBounds(50,150,200,30);

        f.add(t1);
        f.add(t2);

        f.setSize(400,400);
        
        f.setLayout(null);

        f.setVisible(true);
    }
    
}

















// import java.awt.*;

// import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

// /**
//  * CJ38_AWT_textfield
//  */
// public class CJ38_AWT_textfield 
// {
//     public static void main(String[] args)
//     {
//         Frame f = new Frame("textField ");
        
//         TextField t1, t2;
        
//         t1 = new TextField();
//         t1.setBounds(50,100,200,30);

//         t2 = new TextField();
//         t2.setBounds(50,150,200,30);

//         f.add(t1);
//         f.add(t2);

//         f.setSize(400,400);
        
//         f.setLayout(null);

//         f.setVisible(true);
//     }
    
// }


















// import java.awt.*;
// import java.awt.event.*;

// import javax.swing.Action;

// /**
//  * CJ38_AWT_textfield
//  */
// public class CJ38_AWT_textfield extends Frame implements ActionListener
// {

//     TextField tf1,tf2,tf3;
//     Button b1,b2;
//     CJ38_AWT_textfield()
//     {
//         tf1 = new TextField();
//         tf1.setBounds(50,50, 150, 20);

//         tf2 = new TextField();
//         tf2.setBounds(50,100, 150, 20);

//         tf3 = new TextField();
//         tf3.setBounds(50,150, 150, 20);

//         b1 = new Button("+");
//         b1.setBounds(50,200, 50, 20);

//         b2 = new Button("-");
//         b2.setBounds(100,200, 50, 20);

//         b1.addActionListener(this);
//         b1.addActionListener(this);

//         add(tf1);
//         add(tf2);
//         add(tf3);
//         add(b1);
//         add(b2);

//         setSize(300,300);
//         setLayout(null);
//         setVisible(true);
        
//     }
//     public void Actionpersormed(ActionEvent e)
//     {
//         String s1=tf1.getText();
//         String s2=tf2.getText();

//         int a=Integer.parseInt(s1);
//         int b=Integer.parseInt(s2);

//         int c=0;
//         if(e.getSource()==b1)
//         {
//             c=a+b;
//         }
//         else if(e.getSource()==b2)
//         {
//             c=a-b;
//         }
//         String result = String.valueOf(c);
//         tf3.setText(result);        
//     }

//     public static void main(String[] args)
//     {
//         new CJ38_AWT_textfield();    
//     }
// }