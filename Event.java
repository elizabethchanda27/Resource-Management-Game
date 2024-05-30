/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandaelizabethproject2;

/**
 *
 * @author elizabethchanda
 * The Event class represents a generic randomly occurring event in the game.
 * Events have a name
 * 
*/
import java.util.Random;

public class Event extends Generator implements SustainabilityScore{
    //Attributes
    private String name;
    private String description;
    private String effect;
    private int duration;  
    private ElementalAbilities elementalAbilities;
    private Energy energy;
    private Generator generators;
    private Hydropower hydropower;
    private SolarPanel solarPanel;
    private WindTurbine windTurbine;
    private RawMaterial rawMaterial;
    private Money money;
    
    //Constructor
    public Event() {
        
    }

    /**
     *
     * @param name              the name of the event
     * @param description       a brief description of the event
     * @param effect            the effect of the event
     * @param duration          the duration of the event in turns
     * @param elementalAbilities the ElementalAbilities instance
     * @param energy            the Energy instance
     * @param generators        the Generator instance
     * @param hydropower        the Hydropower instance
     * @param solarPanel        the SolarPanel instance
     * @param windTurbine       the WindTurbine instance
     * @param rawMaterial       the RawMaterial instance
     * @param money             the Money instance
     */
    public Event(String name, String description, String effect, int duration,
                 ElementalAbilities elementalAbilities, Energy energy, Generator generators,
                 Hydropower hydropower, SolarPanel solarPanel, WindTurbine windTurbine,
                 RawMaterial rawMaterial, Money money) {
        this.name = name;
        this.description = description;
        this.effect = effect;
        this.duration = duration;
        this.elementalAbilities = new ElementalAbilities();
        this.energy = new Energy();
        this.generators = generators;
        this.hydropower = new Hydropower();
        this.solarPanel = new SolarPanel();
        this.windTurbine = new WindTurbine();
        this.rawMaterial = new RawMaterial();
        this.money = new Money();
        this.money = money;
    }
    
    //Objects
    RawMaterial rawM = new RawMaterial();
    Money mon = new Money();
    ElementalAbilities element = new ElementalAbilities();
    Energy surge = new Energy();
    Hydropower hydro = new Hydropower();
    SolarPanel solar = new SolarPanel();
    WindTurbine wind = new WindTurbine();
    
    // Getter
    @Override
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getDescription() {
        return description;
    }

    // Setter
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter
    public String getEffect() {
        return effect;
    }

    // Setter
    public void setEffect(String effect) {
        this.effect = effect;
    }

    // Getter
    public int getDuration() {
        return duration;
    }

    // Setter
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Getter
    public ElementalAbilities getElementalAbilities() {
        return elementalAbilities;
    }

    // Setter
    public void setElementalAbilities(ElementalAbilities elementalAbilities) {
        this.elementalAbilities = elementalAbilities;
    }
    
    // Getter
    public Energy getEnergy() {
        return energy;
    }
    
    // Setter
    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    // Getter
    public Generator getGenerators() {
        return generators;
    }

    // Setter
    public void setEnergyGenerators(Generator generators) {
        this.generators = generators;
    }

    // Getter
    public Hydropower getHydropower() {
        return hydropower;
    }

    // Setter
    public void setHydropower(Hydropower hydropower) {
        this.hydropower = hydropower;
    }

    // Getter
    public SolarPanel getSolarPanel() {
        return solarPanel;
    }

    // Setter
    public void setSolarPanel(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    // Getter
    public WindTurbine getWindTurbine() {
        return windTurbine;
    }

    // Setter
    public void setWindTurbine(WindTurbine windTurbine) {
        this.windTurbine = windTurbine;
    }

    // Getter
    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    // Setter
    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    // Getter
    public Money getMoney() {
        return money;
    }

    // Setter
    public void setMoney(Money money) {
        this.money = money;
    }

    
    /**
    * Applies the effect of the event.
    */
   private void applyEffect(ElementalAbilities element, Energy surge, Generator g, Hydropower hydro, SolarPanel solar, WindTurbine wind, RawMaterial rawM, Money mon) {
       // Call the resolveEvent method with appropriate parameters
       resolveEvent(element, surge, g, hydro, solar, wind, rawM, mon);
   }

    /**
     * Simulates the occurrence of the event, applying its effect.
     */
    public void triggerEvent() {
        applyEffect(element, surge, generators, hydro, solar, wind, rawM, mon);  // Call a method to apply the specific effect
    }

        public void resolveEvent(ElementalAbilities element, Energy surge, Generator g, Hydropower hydro, SolarPanel solar, WindTurbine wind, RawMaterial rawM, Money mon) {
        
            // Array of event names
            String[] eventNames = {
                "Elemental Storm", "Resource Abundance", "Technological Breakthrough",
                "Environmental Crisis", "Elemental Harmony", "Innovation Expo",
                "Eco-Friendly Migration", "Solar Flare", "Water Shortage", "Windfall Profit"
            };

            // Randomly choose an index
            int randomIndex = new Random().nextInt(eventNames.length);

            // Get the randomly chosen event name
            String randomEventName = eventNames[randomIndex];
            
            switch (randomEventName) {
                case "Elemental Storm":
                    handleElementalStorm();
                    break;
                case "Environmental Crisis":
                    handleEnvironmentalCrisis();
                    break;
                case "Elemental Harmony":
                    handleElementalHarmony();
                    break;
                case "Eco-Friendly Migration":
                    handleEcoFriendlyMigration();
                    break;
                case "Windfall Profit":
                    handleWindfallProfit();
                    break;
        }
    } 

    private void handleElementalStorm() {
        int reductionAmount = generateRandomValue(5, 15);
        element.reduceEfficiency(reductionAmount);
        System.out.println("Elemental Storm! Temporary reduction in elemental abilities efficiency by " + reductionAmount + ".");
    }
    
    private void handleEnvironmentalCrisis() {
        int penaltyAmount = generateRandomValue(10, 30);
        element.reduceSustainabilityScore(penaltyAmount);
        System.out.println("Environmental Crisis! Negative impact on sustainability score by " + penaltyAmount + ".");
        
    }

    private void handleElementalHarmony() {
        int boostAmount = generateRandomValue(10, 30);
        element.increaseEfficiency(boostAmount);
        System.out.println("Elemental Harmony! Increase in elemental abilities efficiency by " + boostAmount + ".");
    }

    private void handleEcoFriendlyMigration() {
        int penaltyAmount = generateRandomValue(20, 150);
        System.out.println("Eco-Friendly Migration! Boosted population! Negative impact on sustainability score and Current Amount of Generated Electricity by " + penaltyAmount + ".");
        hydro.reduceHydroGenerated(penaltyAmount);
        solar.reduceSolarGenerated(penaltyAmount);
        wind.reduceWindGenerated(penaltyAmount);
    }

    private void handleWindfallProfit() {
        double bonusFunds = generateRandomValue(1000, 5000);
        mon.setBalance(mon.getBalance() + bonusFunds);
        System.out.println("Windfall Profit! Bonus funds added to your balance: $" + bonusFunds + ".");
    }

    private int generateRandomValue(int minValue, int maxValue) {
        Random rand = new Random();
        return rand.nextInt(maxValue - minValue + 1) + minValue;
    }
    
    @Override
    public void addToScore(int points) {
        
    }

    @Override
    public int scoreImpact() {
        //Only the efficency points, generated electricity, generated money, and sustainability points have an effect on the score 
        int impact = 0;
        return impact;
    }

    @Override
    public double calculateGeneratedPower() {
        double power = 0;
        return power;
    }
    
}

