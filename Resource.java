/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandaelizabethproject2;

import java.util.ArrayList;

/**
 *
 * @author elizabethchanda
 * The Resource class represents a generic resource in the game.
 * Resources have a name, a quantity, and a status of critical or not critical.
 * 
*/
abstract public class Resource implements SustainabilityScore{
    String name;
    private int quantity;
    private boolean isCritical;
    private ArrayList<Resource> constructionCost;
    
    public Resource() {
        
    }

    /**
     * Creates a new Resource with the given name and initializes the quantity to 0.
     *
     * @param name the name of the resource
     * @param constructionCost
     */
    public Resource(String name, ArrayList<Resource> constructionCost) {
        this.constructionCost = constructionCost;
        this.name = name;
        this.quantity = 0;
        this.isCritical = false;
    }
    
    public Resource(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the resource.
     *
     * @return the name of the resource
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the quantity of the resource.
     *
     * @return the quantity of the resource
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Reports if a resource is critical. If a resource is critical, reaching 0 ends the game.
     *
     * @return if the resource is critical
     */
    public boolean isCritical(){
        return isCritical;
    }

    /**
     * Sets if a given resource is critical.
     * 
     * @param boolean value for isCritical
     */
    public void setIsCrticial(boolean isCritical){
        this.isCritical = isCritical;
    }
    
    /**
     * Gets the construction cost of the Generator based on resources.
     *
     * @return the construction cost of the Generator
     */
    public ArrayList<Resource> getConstructionCost() {
        return constructionCost;
    }

    /**
     * Consumes the specified amount of the resource if available.Sets the resource to 0 if there is not enough to consume.
     *
     * @param amount the amount to consume
     * @return 
     */
    public boolean consume(double amount) {
        if (quantity >= amount) {
            quantity -= amount;
            return true;
        } else {
            quantity = 0;
            System.out.println("Not enough " + name + " to consume.");
            return false;
        }
    }
}
