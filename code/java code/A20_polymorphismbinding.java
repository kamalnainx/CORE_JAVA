/**
 * InnerA20_polymorphismbinding
 */
class InnerA20_polymorphismbinding
{
    void food()
    {
        System.out.println("everyone is eating food");
    }
    
}

class A20_polymorphismbinding extends InnerA20_polymorphismbinding
{
    void food()
    {
        System.out.println("animal is also eating.");
    }
    public static void main(String[] args)
    {
        InnerA20_polymorphismbinding ia20pmpb=new A20_polymorphismbinding();
        ia20pmpb.food();
    }
}