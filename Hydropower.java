/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandaelizabethproject2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author elizabethchanda
 */
public class Hydropower extends Generator implements Comparable<Generator>{
    
    //Attributes
    private int score = 0;
    private int points = 0;
    private double energyProduction;
    private double moneyProduction;
    private int sustainabilityScoreProduction;
    private double generatedPower;
    private int waterPowerStorage = 0;
    private int dams = 0;
    private int reservoirs = 0;
    private int penstock = 0;
    private int waterTurbines = 0;
    private int waterGenerator = 0;
    private int waterVoltageConversion = 0;
    private int hydroMonitoringSystems = 0;
    private int hydroTransmissions = 0;
    private int totalHydroPowerMade = 0;
    private ElementalAbilities elementalAbilities;
    private Money money;
    private RawMaterial raw;
    
    //Constructors
    public Hydropower() {
        
    }
    
    //Constructors
    public Hydropower(String name, double energyProduction, double moneyProduction, int sustainabilityScoreProduction, int numberConstructed, Resource product, int waterPowerStorage, int dams, int reservoirs, int penstock, int waterTurbines, int waterGenerator, int waterVoltageConversion, int hydroMonitoringSystems, int hydroTransmissions, SustainabilityScore score, ElementalAbilities elementalAbilities, double generatedPower, int points) {
        super();
        this.energyProduction = energyProduction;
        this.moneyProduction = moneyProduction;
        this.sustainabilityScoreProduction = sustainabilityScoreProduction;
        this.waterPowerStorage = waterPowerStorage;
        this.dams = dams;
        this.reservoirs = reservoirs;
        this.penstock = penstock;
        this.waterTurbines = waterTurbines;
        this.waterGenerator = waterGenerator;
        this.waterVoltageConversion = waterVoltageConversion;
        this.hydroMonitoringSystems = hydroMonitoringSystems;
        this.hydroTransmissions = hydroTransmissions;
        this.generatedPower = generatedPower;
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
        this.energyProduction = Math.random() * (30 - 20 + 1) + 20;
    }

    // Getter
    public double getMoneyProduction() {
        return moneyProduction;
    }

    // Setter
    public void setMoneyProduction(double moneyProduction) {
        // $1 per unit of energy;
        this.moneyProduction = energyProduction * 1; 
    }

    // Getter
    public int getSustainabilityScoreProduction() {
        return sustainabilityScoreProduction;
    }

    // Setter
    public void setSustainabilityScoreProduction(int sustainabilityScoreProduction) {
        this.sustainabilityScoreProduction = (int) (Math.random() * (4 - 3 + 1) + 3);
    }

    // Getter
    public int getWaterPowerStorage() {
        return waterPowerStorage;
    }

    // Setter
    public void setWaterPowerStorage(int waterPowerStorage) {
        this.waterPowerStorage = waterPowerStorage;
    }

    // Getter
    public int getDams() {
        return dams;
    }

    // Setter
    public void setDams(int dams) {
        this.dams = dams;
    }

    // Getter
    public int getReservoirs() {
        return reservoirs;
    }

    // Setter
    public void setReservoirs(int reservoirs) {
        this.reservoirs = reservoirs;
    }

    // Getter
    public int getPenstock() {
        return penstock;
    }

    // Setter
    public void setPenstock(int penstock) {
        this.penstock = penstock;
    }

    // Getter
    public int getWaterTurbines() {
        return waterTurbines;
    }

    // Setter
    public void setWaterTurbines(int waterTurbines) {
        this.waterTurbines = waterTurbines;
    }

    // Getter
    public int getWaterGenerator() {
        return waterGenerator;
    }

    // Setter
    public void setWaterGenerator(int waterGenerator) {
        this.waterGenerator = waterGenerator;
    }

    // Getter
    public int getWaterVoltageConversion() {
        return waterVoltageConversion;
    }

    // Setter
    public void setWaterVoltageConversion(int waterVoltageConversion) {
        this.waterVoltageConversion = waterVoltageConversion;
    }

    // Getter
    public int getHydroMonitoringSystems() {
        return hydroMonitoringSystems;
    }

    // Setter
    public void setHydroMonitoringSystems(int hydroMonitoringSystems) {
        this.hydroMonitoringSystems = hydroMonitoringSystems;
    }

    // Getter
    public int getHydroTransmissions() {
        return hydroTransmissions;
    }

    // Setter
    public void setHydroTransmissions(int hydroTransmissions) {
        this.hydroTransmissions = hydroTransmissions;
    }

    // Getter
    public int getTotalHydroPowerMade() {
        return totalHydroPowerMade;
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
        return energyProduction * totalHydroPowerMade;
    }

    // Method to generate eletricity from hydropower
    public void generateHydropower() {
        
        // Generating solar power based on energy production rate and total number of solar panels
        double generatedMoney = moneyProduction * totalHydroPowerMade;
        double generatedScorePoints = sustainabilityScoreProduction * totalHydroPowerMade;
        
        //Store solar energy in power bank
        waterPowerStorage += calculateGeneratedPower();
        
        
        //Store money in balance
        mon.setBalance(generatedMoney + mon.getBalance());
    }
    
    // Method to decrease hydropower production rate
    public void reduceHydroGenerated(int amount) {
        // Reducing solar production based on the specified amount
        if (waterPowerStorage >= amount) {
            waterPowerStorage -= amount;
            System.out.println("Reduced solar production by " + amount + " units.");
        } else {
            System.out.println("Insufficient solar production to reduce by " + amount + " units.");
        }
    }
    
    // Method to generate power based on production time
    public void startSolarPowerGeneration() {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        // Schedule the task to run every hour (for example)
        executor.scheduleAtFixedRate(this::generateHydropower, 0, 5, TimeUnit.MINUTES);
    }
    
    //Method to boost hydropower using water manipulation
    public void boostHydropower() {
        element.manipulateWaterFlow();
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many hydro power systems the user wanted
    public void updateDams(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 0;
        int glassPerPanel = 0;
        int steelPerPanel = 15;
        int brickPerPanel = 0;
        int concretePerPanel = 200;
        
        // Searches through arraylist for the specified city
        rawM.searchCurrentWoodAmount(amount, city, woodPerPanel);
        rawM.searchCurrentMetalAmount(amount, city, metalPerPanel);
        rawM.searchCurrentCopperAmount(amount, city, copperPerPanel);
        rawM.searchCurrentGlassAmount(amount, city, glassPerPanel);
        rawM.searchCurrentSteelAmount(amount, city, steelPerPanel);
        rawM.searchCurrentBrickAmount(amount, city, brickPerPanel);
        rawM.searchCurrentConcreteAmount(amount, city, concretePerPanel);
        
        // Update the rotor blades attribute
        dams += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processSteel(amount, city);
        rawM.processConcrete(amount, city);

        System.out.println("Adjusted dams. Total dams now: " + dams);

        //Update the amount of wind turbines made 
        totalHydroPowerMade += amount;
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many hydro power systems the user wanted
    public void updateHydroMonitoringSystems(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 0;
        int glassPerPanel = 5;
        int steelPerPanel = 10;
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
        hydroMonitoringSystems += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processGlass(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted hydro monitoring systems. Total hydro monitoring systems now: " + hydroMonitoringSystems);
    }

    //Method to update amount of raw material for a generator part based on user input of how many hydro power systems the user wanted
    public void updateHydroTransmissions(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 20;
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
        hydroTransmissions += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted hydro transmissions. Total hydro transmissions now: " + hydroTransmissions);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many hydro power systems the user wanted
    public void updateHydroPenStock(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 4;
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
        penstock += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted penstocks. Total penstocks now: " + penstock);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many hydro power systems the user wanted
    public void updateHydroReservoirs(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 0;
        int glassPerPanel = 5;
        int steelPerPanel = 0;
        int brickPerPanel = 0;
        int concretePerPanel = 100;
        
        // Searches through arraylist for the specified city
        rawM.searchCurrentWoodAmount(amount, city, woodPerPanel);
        rawM.searchCurrentMetalAmount(amount, city, metalPerPanel);
        rawM.searchCurrentCopperAmount(amount, city, copperPerPanel);
        rawM.searchCurrentGlassAmount(amount, city, glassPerPanel);
        rawM.searchCurrentSteelAmount(amount, city, steelPerPanel);
        rawM.searchCurrentBrickAmount(amount, city, brickPerPanel);
        rawM.searchCurrentConcreteAmount(amount, city, concretePerPanel);
        
        // Update the rotor blades attribute
        reservoirs += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processGlass(amount, city);
        rawM.processConcrete(amount, city);

        System.out.println("Adjusted reservoirs. Total reservoirs now: " + reservoirs);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many hydro power systems the user wanted
    public void updateWaterGenerator(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 10;
        int glassPerPanel = 0;
        int steelPerPanel = 6;
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
        waterGenerator += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted water generators. Total water generators now: " + waterGenerator);
    }
            
    
    //Method to update amount of raw material for a generator part based on user input of how many hydro power systems the user wanted
    public void updateWaterPowerStorage(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 5;
        int glassPerPanel = 0;
        int steelPerPanel = 10;
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
        waterPowerStorage += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted water power storages. Total water power storages now: " + waterPowerStorage);
    }
    
    //Method to update amount of raw material for a generator part based on user input of how many hydro power systems the user wanted
    public void updateWaterTurbines(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 7;
        int copperPerPanel = 3;
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
        waterTurbines += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processMetal(amount, city);
        rawM.processCopper(amount, city);

        System.out.println("Adjusted water turbines. Total water turbines now: " + waterTurbines);
    }

    
    //Method to update amount of raw material for a generator part based on user input of how many hydro power systems the user wanted
    public void updateWaterVoltageConversion(int amount, String city) {
        // Number of raw materials in a power bank in one solar panel
        int woodPerPanel = 0; 
        int metalPerPanel = 0;
        int copperPerPanel = 8;
        int glassPerPanel = 0;
        int steelPerPanel = 5;
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
        waterVoltageConversion += amount;

        //Process amount of raw materials based on number of generator requested
        rawM.processCopper(amount, city);
        rawM.processSteel(amount, city);

        System.out.println("Adjusted water voltage conversion systems. Total water voltage conversion systems now: " + waterVoltageConversion);
    }

    @Override
    public int scoreImpact() {
        //Only the efficency points, generated electricity, and sustainability points have an effect on the score 
        return score;

    }

    //Override
    public void addToScore(int points, int waterPowerStorage) {
        score += points;
        score += waterPowerStorage;
    }

    @Override
    public int compareTo(Generator other) { 
        double thisGeneratedPower = this.calculateGeneratedPower();
        double otherGeneratedPower = other.calculateGeneratedPower();

        // Compare based on generatedPower
        if (thisGeneratedPower < otherGeneratedPower) {
            return -1;
        } else if (thisGeneratedPower > otherGeneratedPower) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void addToScore(int points) {
        
    }
}


    

