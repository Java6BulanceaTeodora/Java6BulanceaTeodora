/*
 * Returns the definition of the Rectangle
 */
package definitions;

/**
 *
 * @author bulan
 */
public class Rectangle extends Figure {
    
    private static final String DEFINITION = "RECTANGLE: with four straight sides and four right angles, especially one with unequal adjacent sides, in contrast to a square";
    /**
     *
     * @return
     */
    @Override
    public String getDefinition(){
        String figureDefinition = super.getDefinition();
        StringBuilder rectangleDefinition = new StringBuilder("");
        rectangleDefinition.append(DEFINITION);
        rectangleDefinition.insert(11, figureDefinition);
        return rectangleDefinition.toString();
    };
}
