
package chapter08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener
{
    JLabel fno, sno, rno;
    JButton add, sub, mult, div;
    JTextField ftno, scno, rtno;
    int n1, n2, result;
    
    public Calculator()
    {
        fno = new JLabel("Enter First No:");
        sno = new JLabel("Enter Second No:");
        rno = new JLabel("Result:");
        
        add = new JButton("+");
        sub = new JButton("-");
        mult = new JButton("*");
        div = new JButton("/");
        
        ftno = new JTextField();
        scno = new JTextField();
        rtno = new JTextField();
        rtno.setEditable(false);
        
        n1=0;
        n2=0;
        result=0;
        
        setTitle("Calculator");
        setVisible(true);
        setSize(300,220);
        
        add.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
    }
    
    public void addComponent()
    {
        setLayout(null);
        
        fno.setBounds(10,20,100,20);
        add(fno);
        
        sno.setBounds(10,60,100,20);
        add(sno);
        
        rno.setBounds(10,100,100,20);
        add(rno);
        
        add.setBounds(10,140,50,20);
        add(add);
        
        sub.setBounds(80,140,50,20);
        add(sub);
        
        mult.setBounds(150,140,50,20);
        add(mult);
        
        div.setBounds(220,140,50,20);
        add(div);
        
        ftno.setBounds(130,20,100,25);
        add(ftno);
        
        scno.setBounds(130,60,100,25);
        add(scno);
        
        rtno.setBounds(130,100,100,25);
        add(rtno);
       
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == add)
        {
            n1 = Integer.parseInt(ftno.getText());
            n2 = Integer.parseInt(scno.getText());
            result = n1 + n2;
            String temp = String.valueOf(result);
            rtno.setText(temp);
            
        }
        if(e.getSource() == sub)
        {
            n1 = Integer.parseInt(ftno.getText());
            n2 = Integer.parseInt(scno.getText());
            result = n1 - n2;
            String temp = String.valueOf(result);
            rtno.setText(temp);
            
        }
        if(e.getSource() == mult)
        {
            n1 = Integer.parseInt(ftno.getText());
            n2 = Integer.parseInt(scno.getText());
            result = n1 * n2;
            String temp = String.valueOf(result);
            rtno.setText(temp);
            
        }
        if(e.getSource() == div)
        {
            n1 = Integer.parseInt(ftno.getText());
            n2 = Integer.parseInt(scno.getText());
            result = n1 / n2;
            String temp = String.valueOf(result);
            rtno.setText(temp);
            
        }
    }
    
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        obj.addComponent();
    }
    
}
