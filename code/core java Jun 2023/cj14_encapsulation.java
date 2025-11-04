/**
 * Innercj14_encapsulation
 */
class Innercj14_encapsulation {
private String name="hello world";

public String getString()
{
    return name;
}
public void setName(String newname)
{
    this.name=newname;
}
    
}
/**
 * cj14_encapsulation
 */
public class cj14_encapsulation {

    public static void main(String[] args) {
        Innercj14_encapsulation icj14_1 = new Innercj14_encapsulation();
        icj14_1.setName("ravi");
        System.out.println(icj14_1.getString());
    }
}