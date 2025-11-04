// class A21_polymorphisminstanceof
// {
//     public static void main(String[] args)
//     {
//         A21_polymorphisminstanceof a21pmpio=new A21_polymorphisminstanceof();
//         System.out.println(a21pmpio instanceof A21_polymorphisminstanceof);
//     }

// }










/**
 * InnerA21_polymorphisminstanceof=animal
 */
class InnerA21_polymorphisminstanceof {

    
}

/**
 * A21_polymorphisminstanceof= dog
 */
public class A21_polymorphisminstanceof extends InnerA21_polymorphisminstanceof
{
    public static void main(String[] args)
    {
        A21_polymorphisminstanceof a21pmpmf=new A21_polymorphisminstanceof();
        System.out.println(a21pmpmf instanceof InnerA21_polymorphisminstanceof);
    }
    
}