/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclasses;

/**
 *
 * @author bulan
 */
public class SpanishGreeting extends HelloWorldAnonymousClasses{
    
    String name = "mundo"; 
    
    @Override
    public void greet() {

    greetSomeone("mundo"); 
    }

    @Override
    public void greetSomeone(String someone) {

    name = someone;

    System.out.println("Hola, " + name + "!"); 
    }
    
}
