// /*Online Java Paper Test*/

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// class OT extends JFrame implements ActionListener
// {
// 	JLabel l;
// 	JRadioButton jb[]=new JRadioButton[5];
// 	JButton b1,b2,b3,b4;
// 	ButtonGroup bg;
// 	int count=0,current=0,x=1,y=1,now=0;
// 	int m[]=new int[10];	
// 	OT(String s)
// 	{
// 		super(s);
// 		l=new JLabel();
// 		add(l);
// 		bg=new ButtonGroup();
// 		for(int i=0;i<5;i++)
// 		{
// 			jb[i]=new JRadioButton();	
// 			add(jb[i]);
// 			bg.add(jb[i]);
// 		}
// 		b1=new JButton("Next");
// 		b3=new JButton("Notepad");
// 		b4=new JButton("calc");


// 		b1.addActionListener(this);

// 		b3.addActionListener(this);

// 		b4.addActionListener(this);
	
// 		add(b1);add(b3);add(b4);
// 		set();
// 		l.setBounds(30,40,450,20);
// 		jb[0].setBounds(50,80,100,20);
// 		jb[1].setBounds(50,110,100,20);
// 		jb[2].setBounds(50,140,100,20);
// 		jb[3].setBounds(50,170,100,20);
// 		b1.setBounds(100,240,100,30);
		
		
		
		
// 		b3.setBounds(320,240,100,30);
// 		b4.setBounds(420,240,100,30);
		
		
		
		
		
		
// 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		setLayout(null);
// 		setLocation(250,100);
// 		setVisible(true);
// 		setSize(600,350);
// 	}
// 	public void actionPerformed(ActionEvent e)
// 	{
// 		if(e.getSource()==b1)
// 		{
// 			if(check())
// 				count=count+1;
// 			current++;
// 			set();	
// 			if(current==9)
// 			{
// 				b1.setText("Result");
// 			}
// 		}
// 		if(e.getActionCommand().equals("Result"))
// 		{
// 			if(check())
// 				count=count+1;
// 			current++;
// 			//System.out.println("correct ans="+count);
// 			JOptionPane.showMessageDialog(this,"correct ans="+count);
// 			System.exit(0);
// 		}
		
// 		Runtime r=Runtime.getRuntime();
// try
// {
// 	if(e.getSource()==b3)
// 		r.exec("notepad");
// 	if(e.getSource()==b4)
// 		r.exec("calc");
// 	}
// catch(Exception ae)
// {}




// 	}
// 	void set()
// 	{
// 		jb[4].setSelected(true);
// 		if(current==0)
// 		{
// 			l.setText("Que1: Which one among these is not a datatype");
// 			jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");	
// 		}
// 		if(current==1)
// 		{
// 			l.setText("Que2: 2^10=");
// 			jb[0].setText("1022");jb[1].setText("1024");jb[2].setText("512");jb[3].setText("128");
// 		}
// 		if(current==2)
// 		{
// 			l.setText("Que3: Which package is directly available to our class without importing it");
// 			jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");
// 		}
// 		if(current==3)
// 		{
// 			l.setText("Que4: String class is defined in which package");
// 			jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");
// 		}
// 		if(current==4)
// 		{
// 			l.setText("Que5: what is the 18th letter of alphabet?");
// 			jb[0].setText("U");jb[1].setText("o");jb[2].setText("r");jb[3].setText("k");
// 		}
// 		if(current==5)
// 		{
// 			l.setText("Que6: Which one among these is not a keyword");
// 			jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");
// 		}
// 		if(current==6)
// 		{
// 			l.setText("Que7: Which one among these is not a class ");
// 			jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");jb[3].setText("Button");
// 		}
// 		if(current==7)
// 		{
// 			l.setText("Que8: which one among these is not a function of Object class");
// 			jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");jb[3].setText("getDocumentBase");		
// 		}
// 		if(current==8)
// 		{
// 			l.setText("Que9: which function is not present in Applet class");
// 			jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");
// 		}
// 		if(current==9)
// 		{
// 			l.setText("Que10: Which one among these is not a valid component");
// 			jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");jb[3].setText("JTextArea");
// 		}
// 		l.setBounds(30,40,450,20);
// 		for(int i=0,j=0;i<=90;i+=30,j++)
// 			jb[j].setBounds(50,80+i,200,20);
// 	}
// 	boolean check()
// 	{
// 		if(current==0)
// 			return(jb[1].isSelected());
// 		if(current==1)
// 			return(jb[1].isSelected());
// 		if(current==2)
// 			return(jb[3].isSelected());
// 		if(current==3)
// 			return(jb[0].isSelected());
// 		if(current==4)
// 			return(jb[2].isSelected());
// 		if(current==5)
// 			return(jb[2].isSelected());
// 		if(current==6)
// 			return(jb[1].isSelected());
// 		if(current==7)
// 			return(jb[3].isSelected());
// 		if(current==8)
// 			return(jb[1].isSelected());
// 		if(current==9)
// 			return(jb[2].isSelected());
// 		return false;
// 	}
// 	public static void main(String s[])
// 	{
// 		new OT("Online Test Of Java");
// 	}


// }
