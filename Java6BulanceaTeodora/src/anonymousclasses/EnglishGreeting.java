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
public class EnglishGreeting extends HelloWorldAnonymousClasses{
   String name = "world"; 
   
   @Override
    public void greet() {

    greetSomeone("world"); 
    }

    @Override
    public void greetSomeone(String someone) {

    name = someone;

    System.out.println("Hello, " + name + "!");  
    }
}


