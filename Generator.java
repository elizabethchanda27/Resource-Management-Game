/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandaelizabethproject2;

/**
 *
 * @author elizabethchanda
 * The Generator class represents a generic resource generating item in the game.
 * Generators have a name, a construction cost, and a resource production rate.
 * 
*/
abstract public class Generator implements SustainabilityScore {
    private String name;
    private int numberConstructed;
    
    //Constructor 
    public Generator() {
        
    }

    /**
     * Creates a new Generator with the given name, construction cost, and resource production rate.
     *
     * @param name                  the name of the Generator
     * @param numberConstructed     the number of units of this generator constructed at this time
     */
    public Generator(String name, int numberConstructed) {
        this.name = name;
        this.numberConstructed = numberConstructed;
    }

    /**
     * Gets the name of the Generator.
     *
     * @return the name of the Generator
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the number of units constructed of this Generator.
     *
     * @return the number of units constructed of the generator
     */
    public int getNumberConstructed() {
        return numberConstructed;
    }
    
    /**
     *
     * @return the amount of energy made by the generator
     */
    abstract public double calculateGeneratedPower();
    
    abstract public void addToScore(int points);

    @Override
    public int scoreImpact() {
        int impact = 0;
        return impact;
    }
    

}