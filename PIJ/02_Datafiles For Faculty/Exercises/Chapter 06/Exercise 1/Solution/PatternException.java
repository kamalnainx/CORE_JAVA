/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alchem;

public class PatternException extends RuntimeException {

    
    public PatternException() {
        
        System.out.println("Invalid pattern for Employee ID...");
    }

    
    public PatternException(String msg) {
        super(msg);
    }
}
