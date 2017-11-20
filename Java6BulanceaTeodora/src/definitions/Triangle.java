/*
 * Returns the definition of Triangle
 */
package definitions;

/**
 *
 * @author bulan
 */
public class Triangle extends Figure{
    
    private static final String DEFINITION = "TRIANGLE: with three straight sides and three angles.";
    /**
     *
     * @return
     */
    @Override
    public String getDefinition(){
        String figureDefinition = super.getDefinition();
        StringBuilder triangleDefinition = new StringBuilder("");
        triangleDefinition.append(DEFINITION);
        triangleDefinition.insert(10, figureDefinition);
        return triangleDefinition.toString();        
    };
    
}
