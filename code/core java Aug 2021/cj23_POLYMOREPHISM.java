// /**
//  * Innercj23_POLYMOREPHISM
//  */
// class Innercj23_POLYMOREPHISM
// {
//     public void run()
//     {
//         System.out.println("this is sub class 1 class function.");
//     }
    
// }
// /**
//  * cj23_POLYMOREPHISM
//  */
// public class cj23_POLYMOREPHISM
// {
//     public void run()
//     {
//         System.out.println("this is main class function.");
//     }
//     public static void main(String[] args)
//     {
//         cj23_POLYMOREPHISM cj23_1 = new cj23_POLYMOREPHISM();
//         cj23_1.run();    

        
//         Innercj23_POLYMOREPHISM icj23_1_1 = new Innercj23_POLYMOREPHISM();
//         icj23_1_1.run();
//     }
// }



















// /**
//  * Innercj23_POLYMOREPHISM
//  */
// class Innercj23_POLYMOREPHISM
// {
//     public void run()
//     {
//         System.out.println("this is sub class 1 class function.");
//     }
    
// }
// /**
//  * cj23_POLYMOREPHISM
//  */
// public class cj23_POLYMOREPHISM extends Innercj23_POLYMOREPHISM
// {
//     public void run()
//     {
//         System.out.println("this is main class function.");
//     }
//     public static void main(String[] args)
//     {
//         cj23_POLYMOREPHISM cj23_1 = new cj23_POLYMOREPHISM();
//         cj23_1.run();    
//         cj23_1.run();
//     }
// }
























// /**
//  * Innercj23_POLYMOREPHISM
//  */
// class Innercj23_POLYMOREPHISM
// {
//     public void run()
//     {
//         System.out.println("this is sub class 1 class function.");
//     }
    
// }
// /**
//  * Innercj23_POLYMOREPHISM_1
//  */
// class Innercj23_POLYMOREPHISM_1 extends Innercj23_POLYMOREPHISM
// {

//     public void run(float f)
//     {
//         System.out.println("this is 2nd sub class class function.");
//     }
    
    
// }
// /**
//  * cj23_POLYMOREPHISM
//  */
// public class cj23_POLYMOREPHISM extends Innercj23_POLYMOREPHISM_1
// {
//     public void run( int i)
//     {
//         System.out.println("this is main class function.");
//     }
//     public static void main(String[] args)
//     {
//         cj23_POLYMOREPHISM cj23_1 = new cj23_POLYMOREPHISM();
//         cj23_1.run();    
//         cj23_1.run(5);
//         cj23_1.run(5.5f);
//     }
// }








/**
 * Innercj23_POLYMOREPHISM
 */
class Innercj23_POLYMOREPHISM
{
    public void salary(int tax)
    {
        int i=tax*0;
        System.out.println("Total tax is "+i);
    } 
}


/**
 * Innercj23_POLYMOREPHISM_1
 */
class Innercj23_POLYMOREPHISM_1 extends Innercj23_POLYMOREPHISM
{

    public void salary(int tax)
    {
        int i=(tax*5)/100;
        System.out.println("Total tax is "+i);
    }
    
}

/**
 * Innercj23_POLYMOREPHISM_2
 */
class Innercj23_POLYMOREPHISM_2 extends Innercj23_POLYMOREPHISM
{
    public void salary(int tax)
    {
        float i=(tax*10)/100;
        System.out.println("Total tax is "+i);
    }
}

/**
 * cj23_POLYMOREPHISM
 */
public class cj23_POLYMOREPHISM
{
    public static void main(String[] args)
    {
        Innercj23_POLYMOREPHISM icj23_1 = new Innercj23_POLYMOREPHISM();
        Innercj23_POLYMOREPHISM icj23_1_1= new Innercj23_POLYMOREPHISM_1();
        Innercj23_POLYMOREPHISM icj23_2_1= new Innercj23_POLYMOREPHISM_2();

        icj23_1.salary(100000);
        icj23_1_1.salary(500000);
        icj23_2_1.salary(1000000);
        
    }
    
}










