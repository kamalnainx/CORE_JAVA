// encapsulation
// the meaning of encapsulation is to make sure that "sensitive " data is hidden from user.
// in encapsulation we declare calss variables/ attributes as private.
// for encapsulation work provide get and set methods to access and update the value oa a private variable.





// /**
//  * Innercj17_class_encapsulation
//  */
// class Innercj17_class_encapsulation
// {
//     int age=1;
//     void getage()
//     {
//         System.out.println(age);
//     }    
// }
// /**
//  * cj17_class_encapsulation
//  */
// public class cj17_class_encapsulation
// {

//     public static void main(String[] args)
//     {
//         Innercj17_class_encapsulation icj17_1 = new Innercj17_class_encapsulation();
//         icj17_1.getage();
//     }
// }

















// /**
//  * Innercj17_class_encapsulation
//  */
// class Innercj17_class_encapsulation
// {
//     private int age=1;
//     public int getage()
//     {
//         return age;
//     }    
// }
// /**
//  * cj17_class_encapsulation
//  */
// public class cj17_class_encapsulation
// {

//     public static void main(String[] args)
//     {
//         Innercj17_class_encapsulation icj17_1 = new Innercj17_class_encapsulation();
//         System.out.println(icj17_1.getage());
//     }
// }



























// /**
//  * Innercj17_class_encapsulation
//  */
// class Innercj17_class_encapsulation
// {
//     private int age=1;
//     public int getage()
//     {
//         return age;
//     }    
// }
// /**
//  * cj17_class_encapsulation
//  */
// public class cj17_class_encapsulation
// {

//     public static void main(String[] args)
//     {
//         Innercj17_class_encapsulation icj17_1 = new Innercj17_class_encapsulation();
//         icj17_1.age=10;//error The field Innercj17_class_encapsulation.age is not visible
//         System.out.println(icj17_1.getage());
//     }
// }


























/**
 * Innercj17_class_encapsulation
 */
class Innercj17_class_encapsulation
{
    private int age=1;
    public int getage()
    {
        return age;
    }
    
    public void setage(int age1)
    {
        this.age=age1;
    }    
}
/**
 * cj17_class_encapsulation
 */
public class cj17_class_encapsulation
{

    public static void main(String[] args)
    {
        Innercj17_class_encapsulation icj17_1 = new Innercj17_class_encapsulation();
        icj17_1.setage(10);//error The field Innercj17_class_encapsulation.age is not visible
        System.out.println(icj17_1.getage());

    }
}
