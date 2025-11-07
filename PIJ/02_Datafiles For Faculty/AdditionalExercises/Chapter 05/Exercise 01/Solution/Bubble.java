package chapter05;

import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Bubble extends Object
{
    static Vector allBub=new Vector();
    static Dimension size;
    public static class BubTimer extends Thread{
        Container bc;
        BubTimer(Container p){ bc=p ;
        size =bc.getSize();
        }
        public void addBub(int x,int y){
            
            allBub.addElement(
                    new Bubble(Color.red,20,x,y));
        }
public void run(){
    System.out.println("BubTimer started");
    while(true){
        if (allBub !=null && allBub.size()>0){
            Enumeration e=allBub.elements();
            while(e.hasMoreElements()){
            ((Bubble)e.nextElement()).move();
            }
            bc.repaint();
        }
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){}
    }
}
public void paintAll(Graphics g){
    if (allBub==null ||allBub.size()==0)return;
    Enumeration e=allBub.elements();
    while(e.hasMoreElements()){
        ((Bubble)e.nextElement()).paint(g);
    }}}
    

private Color clr;
private int radius,x,y,dx,dy;
private Bubble(Color c,int r,int xx, int yy){
clr=c;radius =r;x=xx;y=yy;
dx=dy=r/2;
}   
private void move(){
x+=dx;y+=dy;
if(x>size.width)dx=-dx;
else if (x<0)dx=-dx;
if(y>size.height)dy=-dy;
else if (y<0)dy=-dy;
}
private void paint(Graphics g){
g.setColor(clr);
g.fillOval(x,y,radius,radius);
}
}
