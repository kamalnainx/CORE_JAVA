/*class Animal{
    void eat()      {        System.out.println(" Animal eating food.");    }
}
class Dog extends Animal{
    void bark()    {        System.out.println(" after eating dog bark");    }
}

class Babydog extends Dog{
    void sleep()    {        System.out.println("baby dog eat or sleep all day");    }
}
public class Testmulti {
    public static void main(final String a {
        final Babydog d = new Babydog();
        d.sleep();
        d.bark();
        d.eat();
        
    }  
}*/

class Animal{
    void eat()    { System.out.println("animal eating food.");}   }
class Dog extends Animal{
    void bark()    { System.out.println("dog bark after eating food.");}  }

class Babydog extends Animal{
    void sleep()    { System.out.println("baby dog eat and sleep all day");   }   }

class Testmulti{
    public static void main(String args[])
    {
        

        Babydog bd=new Babydog();
        bd.sleep();
        bd.eat();

        Dog d=new Dog();
        d.bark();
        d.eat();
    
    }
}