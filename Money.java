/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandaelizabethproject2;

import java.util.ArrayList;

/**
 *
 * @author elizabethchanda
 */
public final class Money extends Resource{

    //Attributes
    private double balance = 10000;
    private double woodCost;
    private double brickCost;
    private double metalCost;
    private double glassCost;
    private double copperCost;
    private double concreteCost;
    private double steelCost;
    private ArrayList<Resource> constructionCost;
    
    //Constructor 
    public Money() {
        
    }
    
    //Constructors
    public Money(String name, double balance) {
        super(name);
        this.balance = balance;
    }
    
    //Constructors
    public Money(String name, double woodCost, double brickCost, double metalCost, double glassCost, double copperCost, double concreteCost, double steelCost) {
        super(name);
        this.woodCost = woodCost;
        this.brickCost = brickCost;
        this.metalCost = metalCost;
        this.glassCost = glassCost;
        this.copperCost = copperCost;
        this.concreteCost = concreteCost;
        this.steelCost = steelCost;  
        initializeConstructionCost(constructionCost);
    }
    
    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter
    public double getWoodCost() {
        return woodCost;
    }

    // Setter
    public void setWoodCost(double woodCost) {
        this.woodCost = woodCost;
    }

    // Getter
    public double getBrickCost() {
        return brickCost;
    }

    // Setter
    public void setBrickCost(double brickCost) {
        this.brickCost = brickCost;
    }

    // Getter
    public double getMetalCost() {
        return metalCost;
    }

    // Setter
    public void setMetalCost(double metalCost) {
        this.metalCost = metalCost;
    }

    // Getter
    public double getGlassCost() {
        return glassCost;
    }

    // Setter
    public void setGlassCost(double glassCost) {
        this.glassCost = glassCost;
    }

    // Getter
    public double getCopperCost() {
        return copperCost;
    }

    // Setter
    public void setCopperCost(double copperCost) {
        this.copperCost = copperCost;
    }

    // Getter
    public double getConcreteCost() {
        return concreteCost;
    }

    // Setter
    public void setConcreteCost(double concreteCost) {
        this.concreteCost = concreteCost;
    }

    // Getter and Setter for steelCost
    // Getter
    public double getSteelCost() {
        return steelCost;
    }

    // Setter
    public void setSteelCost(double steelCost) {
        this.steelCost = steelCost;
    }

    // Getter
    @Override
    public ArrayList<Resource> getConstructionCost() {
        return constructionCost;
    }

    // Setter
    public void setConstructionCost(ArrayList<Resource> constructionCost) {
        this.constructionCost = constructionCost;
    }

    
    //Methods
    
    //Costs for each generator
    public void initializeConstructionCost(ArrayList<Resource> constructionCost) {
        constructionCost.add(new Money("Solar Panel", 20, 0, 100, 84, 112, 0, 30));
        constructionCost.add(new Money("Wind Turbine", 0, 0, 185, 300, 344, 150, 610));
        constructionCost.add(new Money("HydroPower System", 0, 0, 350, 60, 400,900, 630));
    }

    // Method to spend money
    // Most likely for upgrading on resources for raw materials if needed
    @Override
    public boolean consume(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("You spent $" + amount);
            return true;
        } else {
            System.out.println("Insufficient funds. Transaction failed.");
            return false;
        }
    }
    
    @Override
    public boolean isCritical() {
        return balance <= 0;
    }

    @Override
    public int scoreImpact() {
        //Only the generated efficency points, generated electricity, generated money, and sustainability points have an effect on the score 
        int impact = 0;
        return impact;
    }
}
