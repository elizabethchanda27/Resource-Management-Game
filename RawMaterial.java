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
public class RawMaterial extends Resource {

    //Attributes
    //wood to steel (resources from "external companies")
    private int wood = 100000;
    private int brick = 100000;
    private int metal = 100000;
    private int glass = 100000;
    private int copper = 100000;
    private int concrete = 100000;
    private int steel = 100000;
    private int woodCurrentQuantity;
    private int brickCurrentQuantity;
    private int metalCurrentQuantity;
    private int glassCurrentQuantity;
    private int copperCurrentQuantity;
    private int concreteCurrentQuantity;
    private int steelCurrentQuantity;
    private ArrayList<RawMaterial> currentAmount = new ArrayList();

    //Constructors
    public RawMaterial() {

    }

    //Constructors
    public RawMaterial(String name, int woodCurrentQuantity, int brickCurrentQuantity, int metalCurrentQuantity, int glassCurrentQuantity, int copperCurrentQuantity, int concreteCurrentQuantity, int steelCurrentQuantity) {
        super(name);
        this.woodCurrentQuantity = woodCurrentQuantity;
        this.brickCurrentQuantity = brickCurrentQuantity;
        this.metalCurrentQuantity = metalCurrentQuantity;
        this.glassCurrentQuantity = glassCurrentQuantity;
        this.copperCurrentQuantity = copperCurrentQuantity;
        this.concreteCurrentQuantity = concreteCurrentQuantity;
        this.steelCurrentQuantity = steelCurrentQuantity;
        this.currentAmount = new ArrayList<>();
    }

    //Constructors
    public RawMaterial(int wood, int brick, int metal, int glass, int copper, int concrete, int steel) {
        super("");
        this.wood = wood;
        this.brick = brick;
        this.metal = metal;
        this.glass = glass;
        this.copper = copper;
        this.concrete = concrete;
        this.steel = steel;
        this.currentAmount = new ArrayList<>();
    }

    // Getter
    public int getWood() {
        return wood;
    }

    // Setter
    public void setWood(int wood) {
        this.wood = wood;
    }

    // Getter
    public int getBrick() {
        return brick;
    }

    // Setter
    public void setBrick(int brick) {
        this.brick = brick;
    }

    // Getter
    public int getMetal() {
        return metal;
    }

    // Setter
    public void setMetal(int metal) {
        this.metal = metal;
    }

    // Getter
    public int getGlass() {
        return glass;
    }

    // Setter
    public void setGlass(int glass) {
        this.glass = glass;
    }

    // Getter
    public int getCopper() {
        return copper;
    }

    // Setter
    public void setCopper(int copper) {
        this.copper = copper;
    }

    // Getter
    public int getConcrete() {
        return concrete;
    }

    // Setter
    public void setConcrete(int concrete) {
        this.concrete = concrete;
    }

    // Getter
    public int getSteel() {
        return steel;
    }

    // Setter
    public void setSteel(int steel) {
        this.steel = steel;
    }
    
    // Getters
    public int getWoodCurrentQuantity() {
        return woodCurrentQuantity;
    }

    // Setters
    public void setWoodCurrentQuantity(int woodCurrentQuantity) {
        this.woodCurrentQuantity = woodCurrentQuantity;
    }

    // Getters
    public int getBrickCurrentQuantity() {
        return brickCurrentQuantity;
    }

    // Setters
    public void setBrickCurrentQuantity(int brickCurrentQuantity) {
        this.brickCurrentQuantity = brickCurrentQuantity;
    }

    // Getters
    public int getMetalCurrentQuantity() {
        return metalCurrentQuantity;
    }

    // Setters
    public void setMetalCurrentQuantity(int metalCurrentQuantity) {
        this.metalCurrentQuantity = metalCurrentQuantity;
    }

    // Getters
    public int getGlassCurrentQuantity() {
        return glassCurrentQuantity;
    }

    // Setters
    public void setGlassCurrentQuantity(int glassCurrentQuantity) {
        this.glassCurrentQuantity = glassCurrentQuantity;
    }

    // Getters
    public int getCopperCurrentQuantity() {
        return copperCurrentQuantity;
    }

    // Setters
    public void setCopperCurrentQuantity(int copperCurrentQuantity) {
        this.copperCurrentQuantity = copperCurrentQuantity;
    }

    // Getters 
    public int getConcreteCurrentQuantity() {
        return concreteCurrentQuantity;
    }

    // Setters
    public void setConcreteCurrentQuantity(int concreteCurrentQuantity) {
        this.concreteCurrentQuantity = concreteCurrentQuantity;
    }

    // Getters 
    public int getSteelCurrentQuantity() {
        return steelCurrentQuantity;
    }

    // Setters
    public void setSteelCurrentQuantity(int steelCurrentQuantity) {
        this.steelCurrentQuantity = steelCurrentQuantity;
    }
    
    //Increment (Wood)
    public void incrementNumWood(int amount) {
        wood = wood + amount;
    }

    //Increment (Brick)
    public void incrementNumBrick(int amount) {
        brick = brick + amount;
    }

    //Increment (Concrete)
    public void incrementNumConcrete(int amount) {
        concrete = concrete + amount;
    }

    //Increment (Copper)
    public void incrementNumCopper(int amount) {
        copper = copper + amount;
    }

    //Increment (Glass)
    public void incrementNumGlass(int amount) {
        glass = glass + amount;
    }

    //Increment (Metal)
    public void incrementNumMetal(int amount) {
        metal = metal + amount;
    }

    //Increment (Steel)
    public void incrementNumSteel(int amount) {
        steel = steel + amount;
    }
    
    //Current Amount ArrayList
    public ArrayList<RawMaterial> getCurrentAmount() {
        return currentAmount;
    }

    //Methods
    
    //Methods
    //Number of raw material units needed based on requested amount of generators
    
    public void searchCurrentMetalAmount(int amount, String city, int metalAmount) {   

    for (RawMaterial raw : currentAmount) {
        if (raw.getName().equals(city)) {
            setMetalCurrentQuantity(raw.getMetalCurrentQuantity() - (amount * metalAmount));
            break;
        }
    }
}

    
    public void searchCurrentWoodAmount(int amount, String city, int woodAmount) {

    for (RawMaterial raw : currentAmount) {
        if (raw.getName().equals(city)) {
            setWoodCurrentQuantity(raw.getWoodCurrentQuantity() - (amount * woodAmount));
            break;
        }
    }
}

    public void searchCurrentBrickAmount(int amount, String city, int brickAmount) {

    for (RawMaterial raw : currentAmount) {
        if (raw.getName().equals(city)) {
            setBrickCurrentQuantity(raw.getBrickCurrentQuantity() - (amount * brickAmount));
            break;
        }
    }
}

    public void searchCurrentGlassAmount(int amount, String city, int glassAmount) {

    for (RawMaterial raw : currentAmount) {
        if (raw.getName().equals(city)) {
            setGlassCurrentQuantity(raw.getGlassCurrentQuantity() - (amount * glassAmount));
            break;
        }
    }
}

    public void searchCurrentCopperAmount(int amount, String city, int copperAmount) {

    for (RawMaterial raw : currentAmount) {
        if (raw.getName().equals(city)) {
            setCopperCurrentQuantity(raw.getCopperCurrentQuantity() - (amount * copperAmount));
            break;
        }
    }
}

    public void searchCurrentConcreteAmount(int amount, String city, int concreteAmount) {

    for (RawMaterial raw : currentAmount) {
        if (raw.getName().equals(city)) {
            setConcreteCurrentQuantity(raw.getConcreteCurrentQuantity() - (amount * concreteAmount));
            break;
        }
    }
}

    public void searchCurrentSteelAmount(int amount, String city, int steelAmount) {
        
    for (RawMaterial raw : currentAmount) {
        if (raw.getName().equals(city)) {
            setSteelCurrentQuantity(raw.getSteelCurrentQuantity() - (amount * steelAmount));
            break;
        }
    }
}
    
    
    //Display method for current amount of materials
    public void displayCurrentCityRawMaterials(int response) {
        switch (response) {
            case 1 -> {
                System.out.println("Wood: " + woodCurrentQuantity);
                System.out.println("Brick: " + brickCurrentQuantity);
                System.out.println("Metal: " + metalCurrentQuantity);
                System.out.println("Glass: " + glassCurrentQuantity);
                System.out.println("Copper: " + copperCurrentQuantity);
                System.out.println("Concrete: " + concreteCurrentQuantity);
                System.out.println("Steel: " + steelCurrentQuantity);
            }
            case 2 -> {
                System.out.println("Wood: " + woodCurrentQuantity);
                System.out.println("Brick: " + brickCurrentQuantity);
                System.out.println("Metal: " + metalCurrentQuantity);
                System.out.println("Glass: " + glassCurrentQuantity);
                System.out.println("Copper: " + copperCurrentQuantity);
                System.out.println("Concrete: " + concreteCurrentQuantity);
                System.out.println("Steel: " + steelCurrentQuantity);
            }
            case 3 -> {
                System.out.println("Wood: " + woodCurrentQuantity);
                System.out.println("Brick: " + brickCurrentQuantity);
                System.out.println("Metal: " + metalCurrentQuantity);
                System.out.println("Glass: " + glassCurrentQuantity);
                System.out.println("Copper: " + copperCurrentQuantity);
                System.out.println("Concrete: " + concreteCurrentQuantity);
                System.out.println("Steel: " + steelCurrentQuantity);
            }
            default -> {
            }
        }
       
    }
    
    // Methods to process raw materials
    // Bought materials are automatically used towards the specified generator for more efficency, so no upgrade method needed for resources in stock
    
    // Wood
    public void processWood(int amount, String city) {
        // Search for the RawMaterial object corresponding to the current city
        for (RawMaterial raw : currentAmount) {
            if (raw.getName().equals(city)) {
                // Check if there's enough wood to process
                if (raw.getWoodCurrentQuantity() >= amount) {
                    raw.setWoodCurrentQuantity(raw.getWoodCurrentQuantity() - amount);
                    System.out.println("Processed wood: " + amount);
                } else {
                    System.out.println("Not enough wood to process.");
                    System.out.println("Current Amount of Wood: " + raw.getWoodCurrentQuantity());
                }
                break; 
            }
        }
    }

    // Brick        
    public void processBrick(int amount, String city) {
        // Search for the RawMaterial object corresponding to the current city
        for (RawMaterial raw : currentAmount) {
            if (raw.getName().equals(city)) {
                // Check if there's enough brick to process
                if (raw.getBrickCurrentQuantity() >= amount) {
                    raw.setBrickCurrentQuantity(raw.getBrickCurrentQuantity() - amount);
                    System.out.println("Processed brick: " + amount);
                } else {
                    System.out.println("Not enough brick to process.");
                    System.out.println("Current Amount of Brick: " + raw.getBrickCurrentQuantity());
                }
                break; 
            }
        }
    }

    // Metal
    public void processMetal(int amount, String city) {
        // Search for the RawMaterial object corresponding to the current city
        for (RawMaterial raw : currentAmount) {
            if (raw.getName().equals(city)) {
                // Check if there's enough metal to process
                if (raw.getMetalCurrentQuantity() >= amount) {
                    raw.setMetalCurrentQuantity(raw.getMetalCurrentQuantity() - amount);
                    System.out.println("Processed metal: " + amount);
                } else {
                    System.out.println("Not enough metal to process.");
                    System.out.println("Current Amount of Metal: " + raw.getMetalCurrentQuantity());
                }
                break; 
            }
        }
    }

    // Glass
    public void processGlass(int amount, String city) {
        // Search for the RawMaterial object corresponding to the current city
        for (RawMaterial raw : currentAmount) {
            if (raw.getName().equals(city)) {
                // Check if there's enough glass to process
                if (raw.getGlassCurrentQuantity() >= amount) {
                    raw.setGlassCurrentQuantity(raw.getGlassCurrentQuantity() - amount);
                    System.out.println("Processed glass: " + amount);
                } else {
                    System.out.println("Not enough glass to process.");
                    System.out.println("Current Amount of Glass: " + raw.getGlassCurrentQuantity());
                }
                break; 
            }
        }
    }

    // Copper
    public void processCopper(int amount, String city) {
        // Search for the RawMaterial object corresponding to the current city
        for (RawMaterial raw : currentAmount) {
            if (raw.getName().equals(city)) {
                // Check if there's enough copper to process
                if (raw.getCopperCurrentQuantity() >= amount) {
                    raw.setCopperCurrentQuantity(raw.getCopperCurrentQuantity() - amount);
                    System.out.println("Processed copper: " + amount);
                } else {
                    System.out.println("Not enough copper to process.");
                    System.out.println("Current Amount of Copper: " + raw.getCopperCurrentQuantity());
                }
                break; 
            }
        }
    }

    // Concrete
    public void processConcrete(int amount, String city) {
        // Search for the RawMaterial object corresponding to the current city
        for (RawMaterial raw : currentAmount) {
            if (raw.getName().equals(city)) {
                // Check if there's enough concrete to process
                if (raw.getConcreteCurrentQuantity() >= amount) {
                    raw.setConcreteCurrentQuantity(raw.getConcreteCurrentQuantity() - amount);
                    System.out.println("Processed concrete: " + amount);
                } else {
                    System.out.println("Not enough concrete to process.");
                    System.out.println("Current Amount of Concrete: " + raw.getConcreteCurrentQuantity());
                }
                break; 
            }
        }
    }

    // Steel
    public void processSteel(int amount, String city) {
        // Search for the RawMaterial object corresponding to the current city
        for (RawMaterial raw : currentAmount) {
            if (raw.getName().equals(city)) {
                // Check if there's enough steel to process
                if (raw.getSteelCurrentQuantity() >= amount) {
                    raw.setSteelCurrentQuantity(raw.getSteelCurrentQuantity() - amount);
                    System.out.println("Processed steel: " + amount);
                } else {
                    System.out.println("Not enough steel to process.");
                    System.out.println("Current Amount of Steel: " + raw.getSteelCurrentQuantity());
                }
                break; 
            }
        }
    }

    @Override
    public boolean isCritical() {
        return copperCurrentQuantity <= 0 || concreteCurrentQuantity <= 0 || glassCurrentQuantity <= 0 || woodCurrentQuantity <= 0 || brickCurrentQuantity <= 0 || metalCurrentQuantity <= 0;
    }

    @Override
    public int scoreImpact() {
    //Only the efficency points, generated electricity, generated money, and sustainability points have an effect on the score 
        int impact = 0;
        return impact;
    }

}
