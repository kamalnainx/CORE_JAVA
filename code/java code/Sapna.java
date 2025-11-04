// class Student1
// {
//     void fun()
// 	{
// 	    System.out.println("hii");
// 	}
// }

// class Teacher1 extends Student1
// {
//     void name()
//     {
// 	    System.out.println("hello");
// 	}
// }
  
// public class Sapna extends Teacher1
// {
//     public static void main(String[] args)
//     {  
//         Teacher1 ts=new Teacher1();
//         ts.fun();
//         ts.name();
//     }
// }




// class Sapna
// {
//    void show(int a)
//    {
//        System.out.println(a);
//    }
   
//     void show(String a)
// 	{
// 	    System.out.println("2");
// 	}
    
//     public static void main(String []args)
// 	{
// 	    Sapna c=new Sapna();
//         c.show(1);        
//     }
// }







// class Sapna
// {
//    void show(int a)
//    {
//        System.out.println("this is int show function value:- "+a);
//    }
   
//     void show(String a)
// 	{
// 	    System.out.println("this is string function value :- "+a);
// 	}
    
//     public static void main(String []args)
// 	{
// 	    Sapna c=new Sapna();
//         c.show(1);
//         c.show(2);        
//     }
// }






// class Sapna
// {
//    void show(int a)
//    {
//        System.out.println("this is int show function value:- "+a);
//    }
   
//     void show(String a)
// 	{
// 	    System.out.println("this is string function value :- "+a);
// 	}
    
//     public static void main(String []args)
// 	{
// 	    Sapna c=new Sapna();
//         c.show(1);
//         c.show("2");        
//     }
// }











class Animal1
{
   void eat()
    {
    System.out.println("Animal is eating food");
    }
}	   

class Cat extends Animal1
{
    void eat()
    {
        System.out.println("cat extends the animal class");
    }
}
class Dog1 extends Animal1
{
    void eat()
    {
        System.out.println("after eating dog bark");
    }
}

class Peg extends Animal1
{
    void eat()
    {
        System.out.println("peg to hold in place");
    }
}

class sapna
{
    public static void main(String []args)
    {
        Animal1 a;
        a= new Animal1();
        a.eat();

        a=new Cat();
        a.eat();
        
        a=new Dog1();
        a.eat();

        a=new Peg();
        a.eat();
    }
    
}

