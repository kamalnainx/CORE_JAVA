// import java.awt.*;
// import java.awt.event.*;

// public class java45_form3_event_button_anonymous extends Frame
// {
//     TextField tf;
//     java45_form3_event_button_anonymous()
//     {
//         tf=new TextField();
//         tf.setBounds(60,50,170,20);
//         Button b =new Button("click me");
//         b.setBounds(100, 120, 80, 30);

//         b.addActionListener(new ActionListener(){
//             public void actionPerformed(){
//                 tf.setText("Hello");
//             }
//         });

//         add(b); add(tf);
//         setSize(300,300);
//         setLayout(null);
//         setVisible(true);
//     } 

//     public static void main(String[] args)
//     {
//         new java45_form3_event_button_anonymous();
//     }    
// }