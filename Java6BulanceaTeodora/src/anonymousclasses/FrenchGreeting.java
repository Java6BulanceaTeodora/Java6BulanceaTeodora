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
public class FrenchGreeting extends HelloWorldAnonymousClasses{
    
    String name = "tout le monde";
    
    @Override
    public void greet() {

    greetSomeone("tout le monde");
    }

    @Override
    public void greetSomeone(String someone) {

    name = someone;

    System.out.println("Salut, " + name + "!");
    } 
}
