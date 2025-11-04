// package pack1;

// public class Test
// {
//  public static void main(String[] args)
//  {
//     Student s1=new Student();
//     s1.setname();
//     System.out.print(s1.getname());
//  }   
// }


// package pack1;

// public class Test
// {
//  public static void main(String[] args)
//  {
//     Student s1=new Student();
//     s1.setname("kamal nain");
//     System.out.print(s1.getname());
//  }   
// }

package pack1;

public class Test
{
 public static void main(String[] args)
 {
    Student acc=new Student();
    acc.setacc_mobile(9999820084l);
    acc.setname("kamal nain");
    acc.setemail("thekamalnain@gmail.com");
    acc.setamountfee(123456f);

    System.out.println("user mobile number is :- "+acc.getacc_mobile());
    System.out.println("user full name is :- "+acc.getname());
    System.out.println("user e-mail id is :- "+acc.getemail());
    System.out.println("user fees amount is :- "+acc.getamountfee());    
 }   
}
