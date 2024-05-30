/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandaelizabethproject2;
import java.util.Random;

/**
 *
 * @author elizabethchanda
 */
public class ElementalAbilities extends Generator {
    
    //Attributes
    private int score = 0;
    private int sunlightStorage = 1000;
    private int waterStorage = 500;
    private int airStorage = 800;
    private SustainabilityScore sustainabilityScore;
    private Energy energy;
    
    //Constructors
    public ElementalAbilities() {
        
    }

    //Constructors
    public ElementalAbilities(SustainabilityScore score) {
        this.sunlightStorage = 0;
        this.waterStorage = 0;
        this.airStorage = 0;
        this.sustainabilityScore = score;
        this.score = 0;
        this.energy = new Energy();
    }
    
    public ElementalAbilities(int water, int wind, int sunlight, SustainabilityScore score) {
        this.energy = new Energy(water, wind, sunlight);
    }
    
    //Objects
    Energy surge = new Energy();
    
    // Getter
    public int getSunlightStorage() {
        return sunlightStorage;
    }

    // Setter
    public void setSunlightStorage(int sunlightStorage) {
        this.sunlightStorage = sunlightStorage;
    }

    // Getter
    public int getWaterStorage() {
        return waterStorage;
    }

    // Setter
    public void setWaterStorage(int waterStorage) {
        this.waterStorage = waterStorage;
    }

    // Getter
    public int getAirStorage() {
        return airStorage;
    }

    // Setter
    public void setAirStorage(int airStorage) {
        this.airStorage = airStorage;
    }
    
    // Getter
    public SustainabilityScore getSustainabilityScore() {
        return sustainabilityScore;
    }

    // Setter
    public void setSustainabilityScore(SustainabilityScore sustainabilityScore) {
        this.sustainabilityScore = sustainabilityScore;
    }

    // Getter
    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(int score) {
        this.score = score;
    }
    
    //Decrement sunlight in unit
    public void decrementSunlightstorage() {
        sunlightStorage--;
    }
    
    //Decrement water in unit
    public void decrementWaterStorage() {
        waterStorage--;
    }
    
    //Decrement air in unit
    public void decrementAirStorage() {
        airStorage--;
    }


    //Methods
    
    public void useWaterAbility() {
        int boostAmount = generateRandomBoost();
        surge.setWater(surge.getWater() - 10);
        updateSustainabilityScore(boostAmount);
        System.out.println("Used water ability. Boosted sustainability score by " + boostAmount);
    }

    public void useSunlightAbility() {
        int boostAmount = generateRandomBoost();
        surge.setSunlight(surge.getSunlight() - 10);
        updateSustainabilityScore(boostAmount);
        System.out.println("Used sunlight ability. Boosted sustainability score by " + boostAmount);
    }

    public void useAirAbility() {
        int boostAmount = generateRandomBoost();
        surge.setWind(surge.getWind() - 10);
        updateSustainabilityScore(boostAmount);
        System.out.println("Used air ability. Boosted sustainability score by " + boostAmount);
    }

    public void updateSustainabilityScore(int boostAmount) {
        addToScore(boostAmount);
    }

    private int generateRandomBoost() {
        Random rand = new Random();
        return rand.nextInt(50) + 1;
    }

    // Method to manipulate water flow
    public void manipulateWaterFlow() {
        int boostAmount = generateRandomBoost();
        surge.setWater(surge.getWater() - 30);
        updateSustainabilityScore(boostAmount);
        System.out.println("Manipulating water flow to boost hydropower by " + boostAmount);
        System.out.println("Your water ability decreased by 30.");
    }

    // Method to summon rain
    public void summonRain() {
        int boostAmount = generateRandomBoost();
        surge.setWater(surge.getWater() - 50);
        updateSustainabilityScore(boostAmount);
        System.out.println("Summoning rain to increase hydropower systems by " + boostAmount);
        System.out.println("Your water ability decreased by 50.");
    }

    // Method to create strong winds
    public void createStrongWinds() {
        int boostAmount = generateRandomBoost();
        surge.setWind(surge.getWind() - 25);
        updateSustainabilityScore(boostAmount);
        System.out.println("Creating strong winds to boost wind turbine efficiency by " + boostAmount);
        System.out.println("Your air ability decreased by 25.");
        
    }

    // Method to purify the air
    public void purifyAir() {
        int boostAmount = generateRandomBoost();
        surge.setWind(surge.getWind() - 8);
        updateSustainabilityScore(boostAmount);
        System.out.println("Purifying the air to reduce pollution by " + boostAmount);
        System.out.println("Your air ability decreased by 8.");
        
    }

    // Method for elemental fusion
    public void elementalFusion() {
        int boostAmount = generateRandomBoost();
        surge.setWind(surge.getWind() - 15);
        surge.setWater(surge.getWater() - 15);
        surge.setSunlight(surge.getSunlight() - 15);
        updateSustainabilityScore(boostAmount);
        System.out.println("Initiating elemental fusion for enhanced energy production by " + boostAmount);
        System.out.println("Each of your abilities decreased by 15.");
    }
    
    // Method for handling solar flares
    public void solarFlare() {
        int boostAmount = generateRandomBoost();
        updateSustainabilityScore(boostAmount);
        System.out.println("Solar Flare! Boost to solar panel systems by " + boostAmount);
        System.out.println("Your sunlight ability stayed the same.");
    }
    
    //Method used in events class
    public void reduceSustainabilityScore(int amount) {
        int boostAmount = generateRandomBoost();
        surge.setWind(surge.getWind() - 15);
        surge.setWater(surge.getWater() - 15);
        surge.setSunlight(surge.getSunlight() - 15);
        updateSustainabilityScore(boostAmount);
    }
    
    //Method used in events class
    public void reduceEfficiency(int amount) {
        int boostAmount = generateRandomBoost();
        surge.setWind(surge.getWind() - 10);
        surge.setWater(surge.getWater() - 10);
        surge.setSunlight(surge.getSunlight() - 10);
        updateSustainabilityScore(boostAmount);
    }
    
    //Method used in events class
    public void increaseEfficiency(int amount) {
        int boostAmount = generateRandomBoost();
        surge.setWind(surge.getWind() + 5);
        surge.setWater(surge.getWater() + 5);
        surge.setSunlight(surge.getSunlight() + 5);
        updateSustainabilityScore(boostAmount);
    }
    
    @Override
    public void addToScore(int boostAmount) {
        score += boostAmount;
    }
    
    @Override
    public int scoreImpact() {
        // Only the efficiency points, generated electricity, and sustainability points have an effect on the score 
        return score;
    }

    @Override
    public double calculateGeneratedPower() {
        double power = 0;
        return power;
    }
}

