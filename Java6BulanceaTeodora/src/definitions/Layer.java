/*
 * Stores the definitions of the figures
 */
package definitions;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bulan
 */
public class Layer {
  
    List<String> listaDefinitii = new LinkedList<>();
    
    Circle definitieCerc = new Circle();
    Rectangle definitieDreptunghi = new Rectangle();
    Square definitiePatrat = new Square();
    Triangle definitieTriunghi = new Triangle();
    

    public List<String> addDefinitions(){
        listaDefinitii.add(definitieCerc.getDefinition());
        listaDefinitii.add(definitieDreptunghi.getDefinition());
        listaDefinitii.add(definitiePatrat.getDefinition());
        listaDefinitii.add(definitieTriunghi.getDefinition());
        
        listaDefinitii.forEach((iterator) -> {
            System.out.println(iterator);
        });
       return listaDefinitii;
    }
     
}
