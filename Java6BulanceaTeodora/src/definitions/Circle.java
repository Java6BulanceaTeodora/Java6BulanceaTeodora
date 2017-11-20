/*
 * Returns definition of Circle
 */
package definitions;

/**
 *
 * @author bulan
 */
public class Circle extends Figure{
   
    private static final String DEFINITION = "CIRCLE: whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
    
    /**
     *
     * @return
     */
    @Override
    public String getDefinition(){
        String figureDefinition = super.getDefinition();
        StringBuilder circleDefinition = new StringBuilder("");
        circleDefinition.append(DEFINITION);
        circleDefinition.insert(8, figureDefinition);
        return circleDefinition.toString();
    };
}
