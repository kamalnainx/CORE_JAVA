package chapter05;

import java.awt.*;
import java.awt.event.*;
public class FloatingBubbles extends java.awt.Frame {
    Bubble.BubTimer timer;
    FloatingBubbles(){
        super("Bubble Play");
        setSize(600,400);
        timer=new Bubble.BubTimer(this);
        timer.start();
        MouseListener ml=new ClickCatcher();
        addMouseListener(ml);
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }});
        setSize(400,400);
        setVisible(true);
}
public void paint(Graphics g){
timer.paintAll(g);
}
        
    class ClickCatcher extends MouseAdapter{
    public void mouseClicked(MouseEvent ev){
        timer.addBub(ev.getX(), ev.getY());
        repaint();
    }
    }
      public static void main(String args[]){
        FloatingBubbles f=new FloatingBubbles();
        
    }
}

