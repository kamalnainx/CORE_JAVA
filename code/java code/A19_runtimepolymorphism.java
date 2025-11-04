// class Shape1
// {
//     void draw()
//     {
//         System.out.println("drawing a shape");
//     }
// }

// class Rectangle extends Shape1
// {
//     void draw()
//     {
//         System.out.println("drawing the rectangle shape");
//     }
// }

// class Circle extends Shape1
// {
//     void draw()
//     {
//         System.out.println("drawing the circle shape");
//     }
// }

// class A19_runtimepolymorphism
// {
//     public static void main(String[] args)
//     {
//         Shape1 s;
//         s=new Rectangle();
//         s.draw();
//     }    
// }






class Shape1
{
    void draw()
    {
        System.out.println("drawing a shape");
    }
}

class Rectangle extends Shape1
{
    void draw()
    {
        System.out.println("drawing the rectangle shape");
    }
}

class Circle extends Shape1
{
    void draw()
    {
        System.out.println("drawing the circle shape");
    }
}

class Triangle extends Shape1
{
    void draw()
    {
        System.out.println("drawing the trianle");
    }
}

class A19_runtimepolymorphism
{
    public static void main(String[] args)
    {
        Shape1 s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Triangle();
        s.draw();
    }    
}

// wap on run time polymorphism use of this classes animal- cat, rat, dog, peg define eating of food. 
// wap on run time polymorphism use of this classes calculate- sum, sub, multi, divi, mod return type with 2 var. 
// wap on run time polymorphism use of this classes match- rohit, ms dhoni, kapil dev, sunil define function totalmatch with var 100s, 50s, run find totalrun of player. 
// wap on run time polymorphism use of this classes student- sapna, meeta, nupur, dev define function marks with variable english, match, computer sci, hindi, IP find total and get which one student is get first rank.
 
