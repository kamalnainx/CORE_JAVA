// import InnerA15_polymorphismsuper.InnerA15_polymorphismsuper_1;

// /**
//  * InnerA15_polymorphismsuper
//  */
// class InnerA15_polymorphismsuper
// {
//     String color="white";
// }

// /**
//  * InnerA15_polymorphismsuper_1
//  */
// class InnerA15_polymorphismsuper_1 extends InnerA15_polymorphismsuper
// {
//     String color="black";//polymorphism
//     void colorprint()
//     {
//         System.out.println(super.color);//white
//         System.out.println(color);//black
    
//     }
    
// }

// class A15_polymorphismsuper
// {
//     public static void main(String[] args)
//     {
//         InnerA15_polymorphismsuper_1 ia15pmp1 = new InnerA15_polymorphismsuper_1();
//         ia15pmp1.colorprint();
//     }
    
// }






// /**
//  * InnerA15_polymorphismsuper
//  */
// class InnerA15_polymorphismsuper
// {
//     String color="white";
//     void colour()
//     {
//         System.out.println("R, G, B");
//     }
// }

// /**
//  * InnerA15_polymorphismsuper_1
//  */
// class InnerA15_polymorphismsuper_1 extends InnerA15_polymorphismsuper
// {
//     String color="black";//polymorphism
//     void colorprint()
//     {
//         System.out.println(super.color);//white
//         System.out.println(color);//black
    
//     }
//     void colour()
//     {
//         System.out.println("red , green , blue");
//     }

//     void callcolor()
//     {
//         colorprint();//white  black
//         colour();   // red green blue
//         super.colour();   //rgb
//     }
    
// }

// class A15_polymorphismsuper
// {
//     public static void main(String[] args)
//     {
//         InnerA15_polymorphismsuper_1 ia15pmp1 = new InnerA15_polymorphismsuper_1();
//         ia15pmp1.colorprint();
//         ia15pmp1.callcolor();
        
//     }
    
// }





// /**
//  A15_polymorphismsupr
//  */
// class InnerA15_polymorphismsuper
// {
// InnerA15_polymorphismsuper()
// {
//     System.out.println("have a nice day");
// }
// }
// /**
//  * InnerA15_polymorphismsuper_1
//  */
// class InnerA15_polymorphismsuper_1 extends InnerA15_polymorphismsuper
// {
//     InnerA15_polymorphismsuper_1()
//     {
//         super();
//         System.out.println("calling is done");
//     }
    
// }

// /**
//  * A15_polymorphismsuper
//  */
// class A15_polymorphismsuper
// {
//     public static void main(String[] args)
//     {
//         InnerA15_polymorphismsuper_1 ia15pmp=new InnerA15_polymorphismsuper_1();
//     }
// }






// /**
//  A15_polymorphismsupr
//  */
// class InnerA15_polymorphismsuper
// {
// InnerA15_polymorphismsuper()
// {
//     System.out.println("have a nice day");
// }
// }
// /**
//  * InnerA15_polymorphismsuper_1
//  */
// class InnerA15_polymorphismsuper_1 extends InnerA15_polymorphismsuper
// {
//     InnerA15_polymorphismsuper_1()
//     {
//         super();
//         System.out.println("calling is done");
//     }
    
// }

// /**
//  * A15_polymorphismsuper
//  */
// class A15_polymorphismsuper
// {
//     public static void main(String[] args)
//     {
//         InnerA15_polymorphismsuper_1 ia15pmp=new InnerA15_polymorphismsuper_1();
//     }
 
// }




/**
 * InnerA15_polymorphismsuper
 */
class InnerA15_polymorphismsuper 
{
    int rollno, age;
    String name;
    InnerA15_polymorphismsuper(int rollno, String name, int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

}

/**
 * InnerA15_polymorphismsuper_1
 */
class InnerA15_polymorphismsuper_1 extends InnerA15_polymorphismsuper
{
    float height;
    InnerA15_polymorphismsuper_1(int rollno ,String name, int age, float height)
    {
        super(rollno, name, age);
        this.height=height;
    }

    void display()
    {
        System.out.println(rollno +" "+ name +" "+ age +" "+ height);
    }

    
}

/**
 * A15_polymorphismsuper
 */
public class A15_polymorphismsuper
{
    public static void main(String[] args)
    {
        InnerA15_polymorphismsuper_1 ia15pmps=new InnerA15_polymorphismsuper_1(1, "xyz", 10, 5.7f);
        ia15pmps.display();
        
    }

    
}