// import java.awt.*;
// /**
//  * CJ39_AWT_texttext
//  */
// public class CJ41_AWT_checkboxgroup
// {
//     CJ41_AWT_checkboxgroup()
//     {
//         Frame f =new Frame("checkboxgroup");
        
//         CheckboxGroup cbg1 = new CheckboxGroup();

//         Checkbox cb1 = new Checkbox("core java",cbg1,true);
//         cb1.setBounds(100,30,300,300);
//         f.add(cb1);
        
//         f.setSize(400,400);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
//     public static void main(String[] args)
//     {
//         new CJ41_AWT_checkboxgroup();
//     }
    
// }























import java.awt.*;
/**
 * CJ39_AWT_texttext
 */
public class CJ41_AWT_checkboxgroup
{
    CJ41_AWT_checkboxgroup()
    {
        Frame f =new Frame();

        CheckboxGroup cbg1 = new CheckboxGroup();

        Checkbox cb1 = new Checkbox("c",cbg1,true);
        cb1.setBounds(100,30,30,30);
        f.add(cb1);

        Checkbox cb2 = new Checkbox("c++",cbg1,true);
        cb2.setBounds(100,60,30,30);
        f.add(cb2);
        
        Checkbox cb3 = new Checkbox("core java",cbg1,true);
        cb3.setBounds(100,90,30,30);
        f.add(cb3);
        
        Checkbox cb4 = new Checkbox("adv. java",cbg1,true);
        cb4.setBounds(100,120,30,30);
        f.add(cb4);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new CJ41_AWT_checkboxgroup();
    }
}









