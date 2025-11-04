/**
 * Innercj22_encapsulation
 */
class Innercj22_encapsulation {
    private String name;

    public String getname() {
     return name;   
    }

    public void setname(String name1) {
        this.name=name1;
    }

    
    
}
/**
 * cj22_encapsulation
 */
public class cj22_encapsulation {

    public static void main(String[] args) {
        Innercj22_encapsulation icj22=new Innercj22_encapsulation();
        // icj22.name="kamal";//error 
        icj22.setname("shivam");
        System.out.println(icj22.getname());
    }
}