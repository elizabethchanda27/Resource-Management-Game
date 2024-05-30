/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandaelizabethproject2;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author elizabethchanda
 */
public class WindTurbine extends Generator implements Comparable<Generator>{
    
    //Attributes
    private int score = 0;
    private int points = 0;
    private double energyProduction;
    private double moneyProduction;
    private int sustainabilityScoreProduction;
    private double generatedPower;
    private int rotorBlades = 0;
    private int windMonitoringSystems = 0;
    private int windPowerStorage = 0;
    private int windTower = 0;
    private int driveShaft = 0;
    private int directDriveSystems = 0;
    private int windVoltageConversion = 0;
    private int windTransmissions = 0;
    private int totalWindTurbinesMade = 0;
    private ElementalAbilities elementalAbilities;
    private RawMaterial raw;
    private Money money;
    
    //Constructor 
    public WindTurbine() {
        
    }

    //Constructors
    public WindTurbine(String name, double energyProduction, double moneyProduction, int sustainabilityScoreProduction, int numberConstructed, Resource product, int windPowerStorage, int rotorBlades, int windTower, int driveShaft, int directDriveSystems, int windVoltageConversion, int windMonitoringSystems, int windTransmissions, SustainabilityScore score, ElementalAbilities elementalAbilities, double generatedPower, int points) {
        super(name, numberConstructed);
        this.energyProduction = energyProduction;
        this.moneyProduction = moneyProduction;
        this.sustainabilityScoreProduction = sustainabilityScoreProduction;
        this.windPowerStorage = windPowerStorage;
        this.rotorBlades = rotorBlades;
        this.windTower = windTower;
        this.driveShaft = driveShaft;
        this.directDriveSystems = directDriveSystems;
        this.windVoltageConversion = windVoltageConversion;
        this.windMonitoringSystems = windMonitoringSystems;
        this.windTransmissions = windTransmissions;
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
        // Generate a random value between 15 and 25 for energy production
        this.energyProduction = Math.random() * (25 - 15 + 1) + 15;
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
        // Generate a random sustainability score between 3 and 4
        this.sustainabilityScoreProduction = (int) (Math.random() * (4 - 3 + 1) + 3);
    }

    // Getter
    public int getRotorBlades() {
        return rotorBlades;
    }

    // Setter
    public void setRotorBlades(int rotorBlades) {
        this.rotorBlades = rotorBlades;
    }

    // Getter
    public int getWindMonitoringSystems() {
        return windMonitoringSystems;
    }

    // Setter
    public void setWindMonitoringSystems(int windMonitoringSystems) {
        this.windMonitoringSystems = windMonitoringSystems;
    }

    // Getter
    public int getWindPowerStorage() {
        return windPowerStorage;
    }

    // Setter
    public void setWindPowerStorage(int windPowerStorage) {
        this.windPowerStorage = windPowerStorage;
    }

    // Getter
    public int getWindTower() {
        return windTower;
    }

    // Setter
    public void setWindTower(int windTower) {
        this.windTower = windTower;
    }

    // Getter
    public int getDriveShaft() {
        return driveShaft;
    }

    // Setter
    public void setDriveShaft(int driveShaft) {
        this.driveShaft = driveShaft;
    }

    // Getter
    public int getDirectDriveSystems() {
        return directDriveSystems;
    }

    // Setter
    public void setDirectDriveSystems(int directDriveSystems) {
        this.directDriveSystems = directDriveSystems;
    }

    // Getter
    public int getWindVoltageConversion() {
        return windVoltageConversion;
    }

    // Setter
    public void setWindVoltageConversion(int windVoltageConversion) {
        this.windVoltageConversion = windVoltageConversion;
    }
    
    // Getter
    public double getGeneratedPower() {
        return generatedPower;
    }
    
    //Setter
    public void setGeneratedPower(double generatedPower) {
        this.generatedPower = generatedPower;
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
    
    // Method to calculate generated power based on the current state
    @Override
    public double calculateGeneratedPower() {
        return energyProduction * totalWindTurbinesMade;
    }
    
    public RawMaterial getRawMaterialByCity(String city, ArrayList<RawMaterial> intializeCurrentAmount) {
    for (RawMaterial raw : intializeCurrentAmount) {
        if (raw.getName().equals(city)) {
            return raw;
            }
        }
        return null;
    }
    
    // Method to generate electricity from wind power
    public void generateWindPower() {
        // Generating solar power based on energy production rate and total number of solar panels
        double generatedMoney = moneyProduction * totalWindTurbinesMade;
        double generatedScorePoints = sustainabilityScoreProduction * totalWindTurbinesMade;
        
        //Store wind energy in storage
        windPowerStorage += calculateGeneratedPower();
        
        //Add sustainability points
        points += generatedScorePoints;
        
        //Store money in balance
        mon.setBalance(generatedMoney + mon.getBalance());
    }
    
    //Method to store wind energy
    public void reduceWindGenerated(int amount) {
        // Reducing solar production based on the specified amount
        if (windPowerStorage >= amount) {
            windPowerStorage -= amount;
            System.out.println("Reduced solar production by " + amount + " units.");
        } 
        else {
            System.out.println("Insufficient solar production to reduce by " + amount + " units.");
        }
    }
    
    // Method to generate power based on production time
    public void startSolarPowerGeneration() {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        // Schedule the task to run every hour (for example)
        executor.scheduleAtFixedRate(this::generateWindPower, 0, 30, TimeUnit.MINUTES);
    }

    //Method to update amount of raw material for a generator part based on user input of how many water turbines the user wanted
    public void adjustRotorBlades(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 15;
        int copperPerPanel = 0;
        int glassPerPanel = 0;
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
        rotorBlades += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processMetal(amount, city);

        System.out.println("Adjusted rotor blades. Total rotor blades now: " + rotorBlades);

        //Update the amount of wind turbines made 
        totalWindTurbinesMade += amount;
    }

    //Method to update amount of raw material for a generator part based on user input of how many water turbines the user wanted
    public void adjustWindMonitoringSystems(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 0;
        int glassPerPanel = 5;
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
        windMonitoringSystems += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processGlass(amount, city);

        System.out.println("Adjusted wind monitoring systems. Total wind monitoring systems now: " + windMonitoringSystems);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many water turbines the user wanted
    public void adjustWindPowerStorage(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 5;
        int glassPerPanel = 0;
        int steelPerPanel = 10;
        int brickPerPanel = 0;
        int concretePerPanel = 20;
        
        // Searches through arraylist for the specified city
        rawM.searchCurrentWoodAmount(amount, city, woodPerPanel);
        rawM.searchCurrentMetalAmount(amount, city, metalPerPanel);
        rawM.searchCurrentCopperAmount(amount, city, copperPerPanel);
        rawM.searchCurrentGlassAmount(amount, city, glassPerPanel);
        rawM.searchCurrentSteelAmount(amount, city, steelPerPanel);
        rawM.searchCurrentBrickAmount(amount, city, brickPerPanel);
        rawM.searchCurrentConcreteAmount(amount, city, concretePerPanel);
        
        // Update the rotor blades attribute
        windPowerStorage += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processSteel(amount, city);
        rawM.processCopper(amount, city);
        rawM.processConcrete(amount, city);

        System.out.println("Adjusted wind power storage. Total wind power storage now: " + windPowerStorage);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many water turbines the user wanted
    public void adjustWindTower(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 0;
        int glassPerPanel = 0;
        int steelPerPanel = 20;
        int brickPerPanel = 0;
        int concretePerPanel = 30;
        
        // Searches through arraylist for the specified city
        rawM.searchCurrentWoodAmount(amount, city, woodPerPanel);
        rawM.searchCurrentMetalAmount(amount, city, metalPerPanel);
        rawM.searchCurrentCopperAmount(amount, city, copperPerPanel);
        rawM.searchCurrentGlassAmount(amount, city, glassPerPanel);
        rawM.searchCurrentSteelAmount(amount, city, steelPerPanel);
        rawM.searchCurrentBrickAmount(amount, city, brickPerPanel);
        rawM.searchCurrentConcreteAmount(amount, city, concretePerPanel);
        
        // Update the rotor blades attribute
        windTower += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processSteel(amount, city);

        System.out.println("Adjusted wind towers. Total wind towers now: " + windTower);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many water turbines the user wanted
    public void adjustWindDriveShaft(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 10;
        int copperPerPanel = 5;
        int glassPerPanel = 0;
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
        driveShaft += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processMetal(amount, city);
        rawM.processCopper(amount, city);

        System.out.println("Adjusted drive shafts. Total drive shafts now: " + driveShaft);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many water turbines the user wanted
    public void adjustWindVoltageConversion(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 15;
        int glassPerPanel = 0;
        int steelPerPanel = 8;
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
        windVoltageConversion += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted wind voltage conversion systems. Total wind votlage conversion systems now: " + windVoltageConversion);
    }

    //Method to update amount of raw material for a generator part based on user input of how many water turbines the user wanted
    public void adjustWindTransmissions(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 10;
        int glassPerPanel = 0;
        int steelPerPanel = 15;
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
        windTransmissions += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted wind transmissions. Total wind transmissions now: " + windTransmissions);
    }
    
    //Method to boost wind turbine efficiency using air manipulation
    public void windBoost() {
        element.purifyAir();
    }
    
    @Override
    public int scoreImpact() {
        //Only the efficency points, generated electricity, and sustainability points have an effect on the score 
        return score;
    }

    //Override
    public void addToScore(int points, int windPowerStorage) {
        score += points;
        score += windPowerStorage;
        
    }

    @Override
    public int compareTo(Generator other) {
        double thisGeneratedPower = this.calculateGeneratedPower();
        double otherGeneratedPower = other.calculateGeneratedPower();

        // Compare based on generatedPower
        if (thisGeneratedPower < otherGeneratedPower) {
            return -1;
        } 
        else if (thisGeneratedPower > otherGeneratedPower) {
            return 1;
        } 
        else {
            return 0;
        }
    }

    @Override
    public void addToScore(int points) {

    }
}
    
