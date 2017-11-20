/*
 * Returns the definition of Square
 */
package definitions;

/**
 *
 * @author bulan
 */
public class Square extends Figure{
    
    private static final String DEFINITION = "SQUARE: with four equal straight sides and four right angles.";
    /**
     *
     * @return
     */
    @Override
    public String getDefinition(){
        String figureDefinition = super.getDefinition();
        StringBuilder squareDefinition = new StringBuilder("");
        squareDefinition.append(DEFINITION);
        squareDefinition.insert(8, figureDefinition);
        return squareDefinition.toString();
    };
}
