/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandaelizabethproject2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

/**
 *
 * @author elizabethchanda
 */
public class SolarPanel extends Generator implements Comparable<SolarPanel> {
    
    //Attributes
    private int score = 0;
    private int points = 0;
    private double energyProduction;
    private double moneyProduction;
    private int sustainabilityScoreProduction;
    private int powerBank = 0;
    private int solarVoltageConversion = 0;
    private int solarMonitoringSystem = 0;
    private int solarTransmissions = 0;
    private int totalSolarPanelsMade = 0;
    private ElementalAbilities elementalAbilities;
    private Money money;
    private RawMaterial raw;
    
    //Constructors
    public SolarPanel() {
        
    }

    //Constructors
    public SolarPanel(String name, double energyProduction, double moneyProduction, int sustainabilityScoreProduction, ArrayList<Resource> constructionCost, int numberConstructed, int powerBank, int solarVoltageConversion, int solarMonitoringSystem, int solarTransmissions, SustainabilityScore score, ElementalAbilities elementalAbilities, RawMaterial raw, int points) {
        super();
        this.energyProduction = energyProduction;
        this.moneyProduction = moneyProduction;
        this.sustainabilityScoreProduction = sustainabilityScoreProduction;
        this.powerBank = powerBank;
        this.solarVoltageConversion = solarVoltageConversion;
        this.solarMonitoringSystem = solarMonitoringSystem;
        this.solarTransmissions = solarTransmissions;
        this.elementalAbilities = new ElementalAbilities();
        this.raw = new RawMaterial();
        this.money = new Money();
        this.points = points;
    }
    
    //Objects
    RawMaterial rawM = new RawMaterial();
    Money mon = new Money();
    ElementalAbilities element = new ElementalAbilities();
    
    // Getter
    public double getEnergyProduction() {
        return energyProduction;
    }

    // Setter
    public void setEnergyProduction(double energyProduction) {
        // Generate a random value between 10 and 50 for energy production
        this.energyProduction = Math.random() * (50 - 10 + 1) + 10;
    }

    // Getter
    public double getMoneyProduction() {
        return moneyProduction;
    }

    // Setter
    public void setMoneyProduction(double moneyProduction) {
        // Set money production based on energy production (1 dollar per unit of energy)
        this.moneyProduction = this.energyProduction * 1;
    }

    // Getter
    public int getSustainabilityScoreProduction() {
        return sustainabilityScoreProduction;
    }

    // Setter
    public void setSustainabilityScoreProduction(int sustainabilityScoreProduction) {
        // Generate a random sustainability score of 2
        this.sustainabilityScoreProduction = 2;
    }

    // Getter
    public int getPowerBank() {
        return powerBank;
    }

    // Setter
    public void setPowerBank(int powerBank) {
        this.powerBank = powerBank;
    }

    // Getter
    public int getSolarVoltageConversion() {
        return solarVoltageConversion;
    }

    // Setter
    public void setSolarVoltageConversion(int solarVoltageConversion) {
        this.solarVoltageConversion = solarVoltageConversion;
    }

    // Getter
    public int getSolarMonitoringSystem() {
        return solarMonitoringSystem;
    }

    // Setter
    public void setSolarMonitoringSystem(int solarMonitoringSystem) {
        this.solarMonitoringSystem = solarMonitoringSystem;
    }

    // Getter
    public int getSolarTransmissions() {
        return solarTransmissions;
    }

    // Setter
    public void setSolarTransmissions(int solarTransmissions) {
        this.solarTransmissions = solarTransmissions;
    }
    
    // Getter
    public int getPoints() {
        return points;
    }
    
    // Setter
    public void setPoints(int points) {
        this.points = points;
    }

    //Methods
    
    // Method to generate electricty from solar power
    public void generateSolarPower() {
        
        // Generating solar power based on energy production rate and total number of solar panels
        double generatedPower = energyProduction * totalSolarPanelsMade;
        double generatedMoney = moneyProduction * totalSolarPanelsMade;
        double generatedScorePoints = sustainabilityScoreProduction * totalSolarPanelsMade;
        
        //Store solar energy in power bank
        powerBank += generatedPower;
        score += generatedScorePoints;
        
        //Store money in balance
        mon.setBalance(generatedMoney + mon.getBalance());
        
    }
    
    public void reduceSolarGenerated(int amount) {
        // Reducing solar production based on the specified amount
        if (powerBank >= amount) {
            powerBank -= amount;
            System.out.println("Reduced solar production by " + amount + " units.");
        } 
        else {
            System.out.println("Insufficient solar production. Reduce by " + amount + " units.");
        }
    }
    
    //Method to generate power based on production time
    public void startSolarPowerGeneration() {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        // Schedule the task to run every 30 minutes
        executor.scheduleAtFixedRate(this::generateSolarPower, 0, 30, TimeUnit.MINUTES);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many solar panels the user wanted
    public void modifyPowerBank(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 10; 
        int metalPerPanel = 5;
        int copperPerPanel = 2;
        int glassPerPanel = 3;
        int steelPerPanel = 0;
        int brickPerPanel = 0;
        int concretePerPanel = 0;
        
        // Searches through arraylist for the specified city
        rawM.searchCurrentWoodAmount(amount, city, woodPerPanel);
        rawM.searchCurrentMetalAmount(amount, city, metalPerPanel);
        rawM.searchCurrentCopperAmount(amount, city, copperPerPanel);
        rawM.searchCurrentGlassAmount(amount, city, glassPerPanel);
        rawM.searchCurrentSteelAmount(amount, city, steelPerPanel);
        rawM.searchCurrentBrickAmount(amount, city, brickPerPanel);
        rawM.searchCurrentConcreteAmount(amount, city, concretePerPanel);
        
        // Update the rotor blades attribute
        powerBank += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processMetal(amount, city);
        rawM.processWood(amount, city);
        rawM.processCopper(amount, city);
        rawM.processGlass(amount, city);

        System.out.println("Adjusted power banks. Total power banks now: " + powerBank);

        //Update the amount of wind turbines made 
        totalSolarPanelsMade += amount;
    }

    //Method to update amount of raw material for a generator part based on user input of how many solar panels the user wanted
    public void modifySolarMonitoringSystem(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 8;
        int copperPerPanel = 5;
        int glassPerPanel = 4;
        int steelPerPanel = 2;
        int brickPerPanel = 0;
        int concretePerPanel = 0;
        
        // Searches through arraylist for the specified city
        rawM.searchCurrentWoodAmount(amount, city, woodPerPanel);
        rawM.searchCurrentMetalAmount(amount, city, metalPerPanel);
        rawM.searchCurrentCopperAmount(amount, city, copperPerPanel);
        rawM.searchCurrentGlassAmount(amount, city, glassPerPanel);
        rawM.searchCurrentSteelAmount(amount, city, steelPerPanel);
        rawM.searchCurrentBrickAmount(amount, city, brickPerPanel);
        rawM.searchCurrentConcreteAmount(amount, city, concretePerPanel);
        
        // Update the rotor blades attribute
        solarMonitoringSystem += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processMetal(amount, city);
        rawM.processGlass(amount, city);
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted solar monitoring systems. Total solar monitoring systems now: " + solarMonitoringSystem);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many solar panels the user wanted
    public void modifySolarTransmissions(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 7;
        int copperPerPanel = 4;
        int glassPerPanel = 2;
        int steelPerPanel = 1;
        int brickPerPanel = 0;
        int concretePerPanel = 0;
        
        // Searches through arraylist for the specified city
        rawM.searchCurrentWoodAmount(amount, city, woodPerPanel);
        rawM.searchCurrentMetalAmount(amount, city, metalPerPanel);
        rawM.searchCurrentCopperAmount(amount, city, copperPerPanel);
        rawM.searchCurrentGlassAmount(amount, city, glassPerPanel);
        rawM.searchCurrentSteelAmount(amount, city, steelPerPanel);
        rawM.searchCurrentBrickAmount(amount, city, brickPerPanel);
        rawM.searchCurrentConcreteAmount(amount, city, concretePerPanel);
        
        // Update the rotor blades attribute
        solarTransmissions += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processMetal(amount, city);
        rawM.processGlass(amount, city);
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted solar transmission systems. Total solar transmission systems now: " + solarTransmissions);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many solar panels the user wanted
    public void modifySolarVoltageConversion(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 8;
        int copperPerPanel = 5;
        int glassPerPanel = 4;
        int steelPerPanel = 2;
        int brickPerPanel = 0;
        int concretePerPanel = 0;
        
        // Searches through arraylist for the specified city
        rawM.searchCurrentWoodAmount(amount, city, woodPerPanel);
        rawM.searchCurrentMetalAmount(amount, city, metalPerPanel);
        rawM.searchCurrentCopperAmount(amount, city, copperPerPanel);
        rawM.searchCurrentGlassAmount(amount, city, glassPerPanel);
        rawM.searchCurrentSteelAmount(amount, city, steelPerPanel);
        rawM.searchCurrentBrickAmount(amount, city, brickPerPanel);
        rawM.searchCurrentConcreteAmount(amount, city, concretePerPanel);
        
        // Update the rotor blades attribute
        solarVoltageConversion += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processMetal(amount, city);
        rawM.processGlass(amount, city);
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted solar voltage conversion systems. Total solar voltage conversion systems now: " + solarVoltageConversion);
    }
    
    //Method to boost solar panel efficiency using sunlight manipulation
    public void boostSolarPanel() {
        element.createStrongWinds();
    }

    @Override
    public int scoreImpact() {
        //Only the efficency points, generated electricity, and sustainability points have an effect on the score 
        return score;  
    }

    //Override
    public void addToScore(int points, int powerBank) {
        score += points;
        score += powerBank;
    }
    
    @Override
    public void addToScore(int points) {
        
    }

    @Override
    public int compareTo(SolarPanel o) {
        int impact = 0;
        return impact;
    }

    @Override
    public double calculateGeneratedPower() {
        double impact = 0;
        return impact;
    }
}

