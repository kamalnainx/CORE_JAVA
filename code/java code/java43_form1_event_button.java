import java.awt.*;
import java.awt.event.*;
class java43_form1_event_button extends Frame implements ActionListener
{
    TextField tf;
    java43_form1_event_button()
    {
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b =new Button("click me");
        b.setBounds(100, 120, 80, 30);

        b.addActionListener(this);

        add(b); add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    } 

    public void actionPerformed(ActionEvent e)
    {
        tf.setText("welcome");
    }

    public static void main(String[] args)
    {
        new java43_form1_event_button();    
    }    
}









// import java.awt.*;  
// import java.awt.event.*;  
// class java43_form1_event_button extends Frame{  
// TextField tf;  
// java43_form1_event_button(){  
// //create components  
// tf=new TextField();  
// tf.setBounds(60,50,170,20);  
// Button b=new Button("click me");  
// b.setBounds(100,120,80,30);  
// //register listener  
// Outer o=new Outer(this);  
// b.addActionListener(o);//passing outer class instance  
// //add components and set size, layout and visibility  
// add(b);add(tf);  
// setSize(300,300);  
// setLayout(null);  
// setVisible(true);  
// }  
// public static void main(String args[]){  
// new java43_form1_event_button();  
// }  
// }  
