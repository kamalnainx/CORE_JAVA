// import java.awt.*;
// /**
//  * CJ39_AWT_texttext
//  */
// public class CJ39_AWT_texttext
// {
//     CJ39_AWT_texttext()
//     {
//         Frame f =new Frame();
//         TextArea area = new TextArea("this is text area box");
//         area.setBounds(10,30,300,300);
//         f.add(area);
//         f.setSize(400,400);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
//     public static void main(String[] args)
//     {
//         new CJ39_AWT_texttext();
//     }
    
// }



























// import java.awt.*;
// import java.awt.event.*;
// /**
//  * CJ39_AWT_texttext
//  */
// public class CJ39_AWT_texttext extends Frame implements ActionListener
// {
//     Label l1,l2;
//     TextArea area;
//     Button b;

//     CJ39_AWT_texttext()
//     {
//         l1= new Label();
//         l1.setBounds(50,30,100,30);
        
//         l2= new Label();
//         l1.setBounds(100,30,100,30);


//         area = new TextArea();
//         area.setBounds(100,100,300,300);
        
//         b= new Button("count words");
//         b.setBounds(100,450,100,30);
//         b.addActionListener(this);
        
//         add(l1);
//         add(l2);
//         add(area);
        
//         add(b);
        

//         setSize(500,500);
//         setLayout(null);
//         setVisible(true);
//     }
//     public void actionPerformed(ActionEvent e)
//     {
//         String text= area.getText();
//         String words[] = text.split("\\s");
//         l1.setText("words: "+words.length);
//         l2.setText("characters "+ text.length());
//         }
//     public static void main(String[] args)
//     {
//         new CJ39_AWT_texttext();
//     }    
// }
