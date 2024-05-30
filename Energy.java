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
public class Energy extends Resource {
    
    //Atrributes
    private int sunlight = 200 ;
    private int wind = 200;
    private int water = 200;
    private int electricGrid;
    private int energyCurrentQuantity;
    private int energyMaximumCapacity;
    private int sustainabilityIndex;
    private ArrayList<Energy> historicalEnergyData = new ArrayList <>(); //this is where you will store the sustainability score that they need to reach
    
    //Constructor
    public Energy() {
        
    }

    //Constructors
    public Energy (String name, int sunlight, int wind, int water, int electricGrid, int energyCurrentQuantity, int energyMaximumCapacity, int sustainabilityIndex) {
        super(name);
        this.energyCurrentQuantity = energyCurrentQuantity;
        this.energyMaximumCapacity = energyMaximumCapacity;
        this.electricGrid = electricGrid;
        this.sunlight = sunlight;
        this.sustainabilityIndex = sustainabilityIndex;
        this.water = water;
        this.wind = wind;
    }
    
    //Constructors
    public Energy(String name, int sustainabilityIndex) {
        super(name);
        this.sustainabilityIndex = sustainabilityIndex;
    }
    
    // Constructor for input energy 
    public Energy(int water, int wind, int sunlight) {
        super("");
        this.electricGrid = 0;  
        this.water = water;
        this.wind = wind;
        this.sunlight = sunlight;
    }

    // Constructor for output energy
    public Energy(String name, int electricGrid, int water, int wind, int sunlight) {
        super(name);
        this.electricGrid = electricGrid;
        this.water = water;
        this.wind = wind;
        this.sunlight = sunlight;
    }
    
    // Getter
    public int getSunlight() {
        return sunlight;
    }

    // Setter
    public void setSunlight(int sunlight) {
        this.sunlight = sunlight;
    }

    // Getter
    public int getWind() {
        return wind;
    }

    // Setter
    public void setWind(int wind) {
        this.wind = wind;
    }

    // Getter
    public int getWater() {
        return water;
    }

    // Setter
    public void setWater(int water) {
        this.water = water;
    }

    // Getter
    public int getElectricGrid() {
        return electricGrid;
    }

    // Setter
    public void setGrid(int electricGrid) {
        this.electricGrid = electricGrid;
    }

    // Getter
    public int getEnergyCurrentQuantity() {
        return energyCurrentQuantity;
    }

    // Setter
    public void setEnergyCurrentQuantity(int energyCurrentQuantity) {
        this.energyCurrentQuantity = energyCurrentQuantity;
    }

    // Getter
    public int getEnergyMaximumCapacity() {
        return energyMaximumCapacity;
    }

    // Setter
    public void setEnergyMaximumCapacity(int energyMaximumCapacity) {
        this.energyMaximumCapacity = energyMaximumCapacity;
    }

    // Getter
    public int getSustainabilityIndex() {
        return sustainabilityIndex;
    }

    // Setter
    public void setSustainabilityIndex(int sustainabilityIndex) {
        this.sustainabilityIndex = sustainabilityIndex;
    }

    // Getter
    public ArrayList<Energy> getHistoricalEnergyData() {
        return historicalEnergyData;
    }

    // Setter
    public void setHistoricalEnergyData(ArrayList<Energy> historicalEnergyData) {
        this.historicalEnergyData = historicalEnergyData;
    }

    
    //Methods
    
    //Historical data for each city
    public ArrayList<Energy> sustainabilityIndexForScore() {
        return historicalEnergyData;
    }
    
    // Method to store energy
    public void storeEnergy(int amount) {
        if(energyCurrentQuantity < energyMaximumCapacity) {
            energyCurrentQuantity += amount;
            System.out.println("Stored " + amount + " units of energy.");
        }
        else if (energyCurrentQuantity >= energyMaximumCapacity) {
            System.out.println("Capacity is full! No more energy can be added");
        }
    }

    // Method to calculate energy efficiency
    public void calculateEnergyEfficiency() {
        int totalEnergy = sunlight + water + wind + electricGrid;
        System.out.println("Energy efficiency calculated: " + totalEnergy);
    }
    
    @Override
    public boolean isCritical() {
        return energyCurrentQuantity <= 0;
    }

    @Override
    public int scoreImpact() {
        //Only the efficency points, generated electricity, generated money, and sustainability points have an effect on the score 
        int impact = 0;
        return impact;
    }
    
}  
