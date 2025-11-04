// list of Modifiers:-
// 1 default
// 2 public
// 3 protected
// 4 private 

//default
// class Modifiers1
// {
//     public static void main(String[] args)
//     {
//         System.out.println("hello world!!!");    
//     }    
// }


//public
// public class Modifiers1
// {
//     public static void main(String[] args)
//     {
//         System.out.println("hello world!!!");    
//     }    
// }

// /**
//  * InnerModifiers1
//  */
// class InnerModifiers1 {
// String fname="kamal";
// String lname="nain";
// String mailid="thekamalnain@gmail.com";
// int number=1234;
    
// }
// /**
//  * Modifiers1
//  */
// class Modifiers1 extends InnerModifiers1 {
//     int pincode=110011;
//     public static void main(String[] args) {
//         Modifiers1 mdf=new Modifiers1();
//         System.out.println("the full name is "+mdf.fname+" "+mdf.lname);
//         System.out.println("mail id is "+mdf.mailid);
//         System.out.println("user number "+mdf.number);
//         System.out.println("user pin code "+mdf.pincode);

//     }
// }




// /**
//  * InnerModifiers1
//  */
// class InnerModifiers1 {
//     protected String fname="kamal";
//     protected String lname="nain";
//     protected String mailid="thekamalnain@gmail.com";
//     protected int number=1234;
        
//     }
// /**
//  * Modifiers1
//  */
// class Modifiers1 extends InnerModifiers1 {
//     protected int pincode=110011;
//     public static void main(String[] args) {
//         Modifiers1 mdf=new Modifiers1();
//         System.out.println("the full name is "+mdf.fname+" "+mdf.lname);
//         System.out.println("mail id is "+mdf.mailid);
//         System.out.println("user number "+mdf.number);
//         System.out.println("user pin code "+mdf.pincode);

//     }
// }
    


// private
// /**
//  * Modifiers1
//  */
// public class Modifiers1{
//     private String fname="kamal";
//     private String lname="nain";
//     private String mailid="thekamalnain@gmail.com";
//     private int number=1234;       
//     private int pincode=110011;
//     public static void main(String[] args) {
//         Modifiers1 mdf =new Modifiers1();
//         //InnerModifiers1 mdf=new InnerModifiers1();
//         System.out.println("the full name is "+mdf.fname+" "+mdf.lname);
//         System.out.println("mail id is "+mdf.mailid);
//         System.out.println("user number "+mdf.number);
//         System.out.println("user pin code "+mdf.pincode);
//     }
// }



// NON-Access Modifiers
// 1 final
// 2 abstract

/**
 * InnerModifiers1
 
//  protected String name="xyz";
//  public void print()
//  {
//      System.out.println("this is print function");*/
// final class InnerModifiers1 {
//     protected String fname="xyz";
//     public void print1()
//     {
//         System.out.println("this is print function");
//     }
// }
// /**
//  * Modifiers1
//  *}
//  */
// public class Modifiers1 extends InnerModifiers1{
//     private String lname="xyz1";
//     public static void main(String[] args) {
//         Modifiers1 mdf=new Modifiers1();
//         mdf.print1();
//         System.out.println("user name is "+mdf.fname+" "+mdf.lname);
//     }
// }



/**
 abstractrModifiers1
 */
abstract class InnerModifiers1 {
    public String fname="kamal";
    public String lname="nain";
    public String mailid="thekamalnain";
    public abstract void print1();
}

/**
 * InnerModifiers1_1
 */
class InnerModifiers1_1 extends InnerModifiers1{
    public void print1() {
        System.out.println("this is print function");
    }    
}
/**
 * Modifiers1
 */
public class Modifiers1 {

    public static void main(String[] args) {
    InnerModifiers1_1 imf1=new InnerModifiers1_1();
    System.out.println("name "+imf1.fname+" "+imf1.lname);    
    System.out.println("mail id "+imf1.mailid);
    imf1.print1();//call abstract method
    }
}