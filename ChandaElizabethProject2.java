/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chandaelizabethproject2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author elizabethchanda
 */
public class ChandaElizabethProject2 {
    
    /**
     */
    public static void main(String[] args) {
        
        //Scanners
        Scanner scan = new Scanner(System.in);
        
        //Objects
        RawMaterial raw = new RawMaterial();
        Money cash = new Money();
        Energy electric = new Energy();
        Hydropower hydro = new Hydropower();
        WindTurbine gust = new WindTurbine();
        ElementalAbilities elements = new ElementalAbilities();
        SolarPanel solar = new SolarPanel();
        Event place = new Event();
        ArrayList<Energy> historicalData = electric.sustainabilityIndexForScore();
        
        //Sort Method
        //ArrayList with the generator names
        ArrayList<String> generatorNames = new ArrayList<>();
        generatorNames.add("SolarPanel");
        generatorNames.add("WindTurbine");
        generatorNames.add("Hydropower");
        
        //Sustainability Index Variables
        int tokyoSustainabilityIndex = 1000;
        int spSustainabilityIndex = 1500;
        int ntSustainabilityIndex = 3500;
        
        //ArrayLists
        
        //Raw Material
        RawMaterial raw1 = new RawMaterial("São Paulo, Brazil", 100, 50, 30, 20, 10, 50, 20);
        RawMaterial raw2 = new RawMaterial("Tokyo, Japan", 80, 40, 50, 30, 15, 60, 25);
        RawMaterial raw3 = new RawMaterial("Neo-Terra, Arcadia", 50, 25, 30, 20, 10, 40, 15);
        
        raw.getCurrentAmount().add(raw1);
        raw.getCurrentAmount().add(raw2);
        raw.getCurrentAmount().add(raw3);
        
        System.out.println("You have now entered the time portal fellow time traveler. This current user now possesses elemental control and abilities to travel through the space time continuum.");
        System.out.println("With great power, comes great responsibility...choose which path you would like to go through, whether that is to save a city and its environment or improve your skills.");
       
        //Sustainability Index
        Energy electric1 = new Energy("São Paulo, Brazil", 1000);
        Energy electric2 = new Energy("Tokyo, Japan", 1500);
        Energy electric3 = new Energy("Neo-Terra, Arcadia", 3500);
        
        electric.sustainabilityIndexForScore().add(electric1);
        electric.sustainabilityIndexForScore().add(electric2);
        electric.sustainabilityIndexForScore().add(electric3);        

        
        while(true) {
            System.out.println("With great power, comes great responsibility...choose which path you would like to go through, whether that is to save a city and its environment or improve your skills.");
            System.out.println("\t1. Past");
            System.out.println("\t2. Present");
            System.out.println("\t3. Future");
            System.out.println("\t4. Exit, I would like to return to my time now.");
            
            int num = scan.nextInt();
            boolean exitMenu = false;
            
            switch(num) {
                case 1:
                while(!exitMenu) {
                    while(true) {
                    //Storyline for City in Past
                    System.out.println("Power Rebirth: Illuminating São Paulo's Historical Energy Renaissance");
                    System.out.println("Welcome to 20th-century São Paulo, Brazil.");
                    System.out.println("Background: São Paulo, a rising economic force, faces a dilemma in the early 1900s. \nThe city's pursuit of progress relies on traditional energy sources like coal and gas, causing environmental concerns. Your mission as a time traveler is to guide São Paulo towards sustainable energy.");
                    System.out.println("");
                    System.out.println("*** Current Issues ***");
                    System.out.println("\t1. Industrial Pollution: Factories emit thick smoke, worsening air quality.");
                    System.out.println("\t2. Primitive Grid: The underdeveloped electricity grid leads to frequent blackouts, hindering cleaner energy adoption.");
                    System.out.println("\t3. Urbanization Impact: City expansion results in habitat loss and deforestation.");

                    System.out.println("*** Mission Objectives ***");
                    System.out.println("\t1. Expand São Paulo's electricity grid to include solar, wind, and hydropower. Develop a basic smart grid for optimized energy distribution.");
                    System.out.println("\t2. Infuse elemental abilities into the grid to enhance efficiency and reliability.");
                    System.out.println("\t3. Use elemental powers to influence weather, ensuring ample rainfall for the city's greenery.");
                    System.out.println("");
                    
                    //Ask how many they would like to build of each generator
                    
                    //Display generators they will use
                    System.out.println("These are the generators that will be accompanying you as a tool to use on your journey.");
                    
                    // Sort the generator names
                    Collections.sort(generatorNames);

                    // Display the sorted list
                    System.out.println("Sorted Generators: " + generatorNames);
                    System.out.println("");
                    
                    //Solar Panel
                    System.out.println("*** Your Current Inventory ***");
                    System.out.println("Current Balance in Universal Currency (Time Traveler Bucks that are Eligible Anywhere): $10000");
                    System.out.println("*** Current Amount of Given Elements in Storage Units ***");
                    System.out.println("Sunlight: 10000");
                    System.out.println("Water: 500");
                    System.out.println("Wind: 1000");
                    
                    System.out.println("");
                    System.out.println("Here is the sustainability score you need to get");
                    System.out.println("Sustainability Score: " + spSustainabilityIndex);
                    
                    //Ask how many you would like to build for solar panels
                    System.out.println("");
                    System.out.println("HOW MANY SOLAR PANELS WOULD YOU LIKE TO BUILD? ");
                    System.out.println("*** Prices of Materials ***");
                    System.out.println("Wood: $2");
                    System.out.println("Brick: $4");
                    System.out.println("Metal: $5");
                    System.out.println("Glass: $6");
                    System.out.println("Copper: $8");
                    System.out.println("Concrete: $3");
                    System.out.println("Steel: $10");
                    System.out.println("");
                    
                    //Print out list of current raw materials in city
                    System.out.println("*** Current Amount of Raw Material in São Paulo, Brazil ***");
                    raw1.displayCurrentCityRawMaterials(num); 
                    
                    //Print out list of needed materials for current generator being asked
                    System.out.println("");
                    System.out.println("*** Total amount needed for one solar panel ***");
                    System.out.println("Wood: 10");
                    System.out.println("Metal: 20");
                    System.out.println("Copper: 14");
                    System.out.println("Glass: 14");
                    System.out.println("Steel: 3");
                    System.out.println("Total: $346");
                    
                    //User Input for How Many
                    int num2 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    //Transaction
                    solar.modifyPowerBank(num2, "São Paulo, Brazil");
                    solar.modifySolarMonitoringSystem(num2, "São Paulo, Brazil");
                    solar.modifySolarTransmissions(num2, "São Paulo, Brazil");
                    solar.modifySolarVoltageConversion(num2, "São Paulo, Brazil");
                    
                    //Generate Power
                    solar.generateSolarPower();
                    solar.startSolarPowerGeneration();
                    
                    //Checks Availability of Resources
                    raw.isCritical();
                    
                    //Random Event 
                    place.triggerEvent();
                    System.out.println("");
                    
                    //Allow user to use of their powers to boost one of their generators
                    //Remind users that although they have an unlimited amount of resource to use their powers from, they have a limit on how much their powers can take
                    System.out.println("Choose from one of these options to use your powers towards improving your sustainability score.");
                    System.out.println("Although you have unlimited resources from the planet, there is a limit on how much your power can be used.");
                    System.out.println("\t1. Water Ability");
                    System.out.println("\t2. Sunlight Ability");
                    System.out.println("\t3. Wind Ability");
                    System.out.println("\t4. Surprise Ability #1");
                    System.out.println("\t5. Surprise Ability #2");
                    System.out.println("\t6. Surprise Ability #3");
                    System.out.println("\t7. Surprise Ability #4");
                    System.out.println("\t8. Surprise Ability #5");
                    System.out.println("\t9. Surprise Ability #6");
                    
                    int num3 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                switch (num3) {
                    case 1:
                        elements.useWaterAbility();
                        break;
                    case 2:
                        elements.useSunlightAbility();
                        break;
                    case 3:
                        elements.useAirAbility();
                        break;
                    case 4:
                        elements.manipulateWaterFlow();
                        break;
                    case 5:
                        elements.summonRain();
                        break;
                    case 6:
                        elements.createStrongWinds();
                        break;
                    case 7:
                        elements.purifyAir();
                        break;
                    case 8:
                        elements.elementalFusion();
                        break;
                    case 9:
                        elements.solarFlare();
                        break;
                    default:
                        break;
                }
                    
                    //Wind Turbine
                    
                    //Ask how many you would like to build for wind turbines
                    System.out.println("");
                    System.out.println("HOW MANY WIND TURBINES WOULD YOU LIKE TO BUILD? ");
                    System.out.println("*** Prices of Materials ***");
                    System.out.println("Wood: $2");
                    System.out.println("Brick: $4");
                    System.out.println("Metal: $5");
                    System.out.println("Glass: $6");
                    System.out.println("Copper: $8");
                    System.out.println("Concrete: $3");
                    System.out.println("Steel: $10");
                    System.out.println("");
                    
                    //Print out list of current raw materials in city
                    System.out.println("*** Current Amount of Raw Material in São Paulo, Brazil");
                    raw.displayCurrentCityRawMaterials(num); 
                    
                    //Print out list of needed materials for current generator being asked
                    System.out.println("");
                    System.out.println("*** Total amount needed for one hydropower system ***");
                    System.out.println("Metal: 37");
                    System.out.println("Copper: 43");
                    System.out.println("Glass: 50");
                    System.out.println("Steel: 61");
                    System.out.println("Concrete: 50");
                    System.out.println("Total: $1589");
                    
                    //User Input for How Many
                    int num4 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    //Transaction
                    gust.adjustRotorBlades(num2, "São Paulo, Brazil");
                    gust.adjustWindMonitoringSystems(num2, "São Paulo, Brazil");
                    gust.adjustWindDriveShaft(num2, "São Paulo, Brazil");
                    gust.adjustWindPowerStorage(num2, "São Paulo, Brazil");
                    gust.adjustWindTower(num2, "São Paulo, Brazil");
                    gust.adjustWindTransmissions(num2, "São Paulo, Brazil");
                    gust.adjustWindVoltageConversion(num2, "São Paulo, Brazil");
                    
                    //Power Generation
                    gust.generateWindPower();
                    gust.startSolarPowerGeneration();
                    
                    
                    //Checks Availability of Resources
                    raw.isCritical();
                    
                    //Random Event 
                    place.triggerEvent();
                    System.out.println("");
                    
                    //Allow user to use of their powers to boost one of their generators
                    //Remind users that although they have an unlimited amount of resource to use their powers from, they have a limit on how much their powers can take
                    System.out.println("Choose from one of these options to use your powers towards improving your sustainability score.");
                    System.out.println("Although you have unlimited resources from the planet, there is a limit on how much your power can be used.");
                    System.out.println("\t1. Water Ability");
                    System.out.println("\t2. Sunlight Ability");
                    System.out.println("\t3. Wind Ability");
                    System.out.println("\t4. Surprise Ability #1");
                    System.out.println("\t5. Surprise Ability #2");
                    System.out.println("\t6. Surprise Ability #3");
                    System.out.println("\t7. Surprise Ability #4");
                    System.out.println("\t8. Surprise Ability #5");
                    System.out.println("\t9. Surprise Ability #6");
                    
                    int num5 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                switch (num5) {
                    case 1:
                        elements.useWaterAbility();
                        break;
                    case 2:
                        elements.useSunlightAbility();
                        break;
                    case 3:
                        elements.useAirAbility();
                        break;
                    case 4:
                        elements.manipulateWaterFlow();
                        break;
                    case 5:
                        elements.summonRain();
                        break;
                    case 6:
                        elements.createStrongWinds();
                        break;
                    case 7:
                        elements.purifyAir();
                        break;
                    case 8:
                        elements.elementalFusion();
                        break;
                    case 9:
                        elements.solarFlare();
                        break;
                    default:
                        break;
                }
                    
                    //Hydropower System
                    
                    //Ask how many you would like to build for hydropower systems
                    System.out.println("");
                    System.out.println("HOW MANY HYDROPOWER SYSTEMS WOULD YOU LIKE TO BUILD? ");
                    System.out.println("*** Prices of Materials ***");
                    System.out.println("Wood: $2");
                    System.out.println("Brick: $4");
                    System.out.println("Metal: $5");
                    System.out.println("Glass: $6");
                    System.out.println("Copper: $8");
                    System.out.println("Concrete: $3");
                    System.out.println("Steel: $10");
                    System.out.println("");
                    
                    //Print out list of current raw materials in city
                    System.out.println("*** Current Amount of Raw Material in São Paulo, Brazil ***");
                    raw1.displayCurrentCityRawMaterials(num); 
                    
                    //Print out list of needed materials for current generator being asked
                    System.out.println("");
                    System.out.println("*** Total amount needed for one hydropower system ***");
                    System.out.println("Metal: 70");
                    System.out.println("Copper: 50");
                    System.out.println("Glass: 10");
                    System.out.println("Steel: 63");
                    System.out.println("Concrete: 300");
                    System.out.println("Total: $2340");
                    
                    //User Input for How Many
                    int num6 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    //Transaction
                    hydro.updateDams(num6, "São Paulo, Brazil");
                    hydro.updateHydroMonitoringSystems(num6, "São Paulo, Brazil");
                    hydro.updateHydroPenStock(num6, "São Paulo, Brazil");
                    hydro.updateHydroReservoirs(num6, "São Paulo, Brazil");
                    hydro.updateHydroTransmissions(num6, "São Paulo, Brazil");
                    hydro.updateWaterGenerator(num6, "São Paulo, Brazil");
                    hydro.updateWaterPowerStorage(num6, "São Paulo, Brazil");
                    hydro.updateWaterTurbines(num6, "São Paulo, Brazil");
                    hydro.updateWaterVoltageConversion(num6, "São Paulo, Brazil");
                    
                    //Power Generation
                    hydro.generateHydropower();
                    hydro.startSolarPowerGeneration();
                    
                    
                    //Checks Availability of Resources
                    raw.isCritical();
                    
                    //Random Event 
                    place.triggerEvent();
                    System.out.println("");
                    
                    //Allow user to use of their powers to boost one of their generators
                    //Remind users that although they have an unlimited amount of resource to use their powers from, they have a limit on how much their powers can take
                    System.out.println("Choose from one of these options to use your powers towards improving your sustainability score.");
                    System.out.println("Although you have unlimited resources from the planet, there is a limit on how much your power can be used.");
                    System.out.println("\t1. Water Ability");
                    System.out.println("\t2. Sunlight Ability");
                    System.out.println("\t3. Wind Ability");
                    System.out.println("\t4. Surprise Ability #1");
                    System.out.println("\t5. Surprise Ability #2");
                    System.out.println("\t6. Surprise Ability #3");
                    System.out.println("\t7. Surprise Ability #4");
                    System.out.println("\t8. Surprise Ability #5");
                    System.out.println("\t9. Surprise Ability #6");
                    
                    int num7 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                                        
                    switch (num7) {
                        case 1:
                            elements.useWaterAbility();
                            break;
                        case 2:
                            elements.useSunlightAbility();
                            break;
                        case 3:
                            elements.useAirAbility();
                            break;
                        case 4:
                            elements.manipulateWaterFlow();
                            break;
                        case 5:
                            elements.summonRain();
                            break;
                        case 6:
                            elements.createStrongWinds();
                            break;
                        case 7:
                            elements.purifyAir();
                            break;
                        case 8:
                            elements.elementalFusion();
                            break;
                        case 9:
                            elements.solarFlare();
                            break;
                        default:
                            break;
                }
                    //Comparsion Method
                    //Checks if user passed
                    //If user did pass
                    //Print out Sustainability Score, Amount of Money Produced, and Amount of Electricity Produced
                    
                    for(Energy energy : historicalData) {
                        if (energy.getName().equals("São Paulo, Brazil")) {
                            spSustainabilityIndex = energy.getSustainabilityIndex();
                            System.out.println("São Paulo's Sustainability Index: " + spSustainabilityIndex);
                            System.out.println("Your sustainability index: " + elements.scoreImpact());
                            break;
                        }
                        else if(energy.getName().equals("Tokyo, Japan")) {
                            tokyoSustainabilityIndex = energy.getSustainabilityIndex();
                            System.out.println("Tokyo's Sustainability Index: " + tokyoSustainabilityIndex);
                            System.out.println("Your sustainability index: " + elements.scoreImpact());
                            break;
                        }
                        else if(energy.getName().equals("Neo-Terra, Arcadia")) {
                            ntSustainabilityIndex = energy.getSustainabilityIndex();
                            System.out.println("Neo-Terra's Sustainability Index: " + ntSustainabilityIndex);
                            System.out.println("Your sustainability index: " + elements.scoreImpact());
                            break;
                        }
                    }
                    
                    if(elements.scoreImpact() >= spSustainabilityIndex) {
                        
                        System.out.println("Congratulations! You succeeded and saved the city!");
                        System.out.println("Sustainability Index Needed: " + ntSustainabilityIndex);
                        System.out.println("Your sustainability index: " + elements.scoreImpact());

                        int result = hydro.compareTo(hydro);
                        int result2 = gust.compareTo(gust);

                        if (result > result2) {
                            System.out.println("WindTurbine has less generated power than Hydropower.");
                            System.out.println("");
                            exitMenu = true;
                            break;
                        } 
                        else if (result < result2) {
                            System.out.println("WindTurbine has more generated power than Hydropower.");
                            System.out.println("");
                            exitMenu = true;
                            break;
                        } 
                        else {
                            System.out.println("WindTurbine and Hydropower have the same generated power.");
                            System.out.println("");
                            exitMenu = true;
                            break;
                        }
                    }
                    else {
                        System.out.println("You did not achieve the sustainability index. Try again.");

                        //Random Event
                        //Ask if they want to use one of their elemental storage units
                        System.out.println("Since you did not pass, use one of your elemental storage units for an extra boost.");
                        System.out.println("\t1. Sunlight");
                        System.out.println("\t2. Water");
                        System.out.println("\t3. Wind");

                        int powers = scan.nextInt();
                        scan.nextLine();

                        switch (powers) {
                            case 1:
                                elements.updateSustainabilityScore(elements.getSunlightStorage());
                                elements.decrementSunlightstorage();
                                exitMenu = true;
                                break;
                            case 2:
                                elements.updateSustainabilityScore(elements.getWaterStorage());
                                elements.decrementWaterStorage();
                                exitMenu = true;
                                break;
                            case 3:
                                elements.updateSustainabilityScore(elements.getAirStorage());
                                elements.decrementAirStorage();
                                exitMenu = true;
                                break;
                            default:
                                break;
                      }
                    }
                  }
                }
                break;

                case 2: 
                while(!exitMenu) {
                    while(true) {
                    //Storyline for City in Present
                    System.out.println("Harmony in the Winds of Change: Tokyo's Energy Quest");
                    System.out.println("Welcome to 21st-century Tokyo, Japan.");
                    System.out.println("Background: Tokyo, a city blending tradition with innovation, stands at a critical point. In the present, it grapples with sustainable energy and weather challenges. \nDespite technological leadership, Tokyo faces electricity infrastructure issues, relying heavily on nuclear power. The city also deals with rising energy demands and the need for diversification.");
                    System.out.println();
                    System.out.println("*** Current Issues ***");
                    System.out.println("\t1. Non-Renewable Energy Dependence: Japan heavily relies on non-renewable sources, especially nuclear power, raising environmental and safety concerns.");
                    System.out.println("\t2. Natural Disaster Vulnerability: Tokyo faces threats from earthquakes and typhoons, disrupting energy infrastructure and posing challenges for sustainable solutions.");
                    System.out.println("\t3. Balancing Growth and Environment: Achieving economic growth while maintaining environmental sustainability is challenging, given the unique ecosystem of Japan.");

                    System.out.println("*** Mission Objectives ***");
                    System.out.println("\t1. Lead the shift to solar panels, wind turbines, and hydropower. Overcome regulatory hurdles and public perception to integrate renewables into Tokyo's power grid.");
                    System.out.println("\t2. Use elemental abilities to fortify the city against natural disasters. Manipulate weather patterns to protect against typhoons, earthquakes, and other weather challenges.");
                    System.out.println("\t3. Navigate the complex financial landscape with strategic decisions, including environmental research and eco-friendly technology.");
                    System.out.println("");
                    
                    //Ask how many they would like to build of each generator
                    
                    //Display generators they will use
                    System.out.println("These are the generators that will be accompanying you as a tool to use on your journey.");
                    
                    // Sort the generator names
                    Collections.sort(generatorNames);

                    // Display the sorted list
                    System.out.println("Sorted Generators: " + generatorNames);
                    System.out.println("");
                    
                    //Solar Panel
                    System.out.println("*** Your Current Inventory ***");
                    System.out.println("Current Balance in Universal Currency (Time Traveler Bucks that are Eligible Anywhere): $10000");
                    System.out.println("*** Current Amount of Given Elements in Storage Units ***");
                    System.out.println("Sunlight: 10000");
                    System.out.println("Water: 500");
                    System.out.println("Wind: 1000");
                    
                    System.out.println("Here is the sustainability score you need to get");
                    System.out.println("Sustainability Score: " + tokyoSustainabilityIndex);
                    
                    //Ask how many you would like to build for solar panels
                    System.out.println("");
                    System.out.println("HOW MANY SOLAR PANELS WOULD YOU LIKE TO BUILD? ");
                    System.out.println("*** Prices of Materials ***");
                    System.out.println("Wood: $2");
                    System.out.println("Brick: $4");
                    System.out.println("Metal: $5");
                    System.out.println("Glass: $6");
                    System.out.println("Copper: $8");
                    System.out.println("Concrete: $3");
                    System.out.println("Steel: $10");
                    System.out.println("");
                    
                    //Print out list of current raw materials in city
                    System.out.println("*** Current Amount of Raw Material in Tokyo, Japan ***");
                    raw2.displayCurrentCityRawMaterials(num); 
                    
                    //Print out list of needed materials for current generator being asked
                    System.out.println("");
                    System.out.println("*** Total amount needed for one solar panel ***");
                    System.out.println("Wood: 10");
                    System.out.println("Metal: 20");
                    System.out.println("Copper: 14");
                    System.out.println("Glass: 14");
                    System.out.println("Steel: 3");
                    System.out.println("Total: $346");
                    
                    //User Input for How Many
                    int num8 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    //Transaction
                    solar.modifyPowerBank(num8, "Tokyo, Japan");
                    solar.modifySolarMonitoringSystem(num8, "Tokyo, Japan");
                    solar.modifySolarTransmissions(num8, "Tokyo, Japan");
                    solar.modifySolarVoltageConversion(num8, "Tokyo, Japan");
                    
                    //Generate Power
                    solar.generateSolarPower();
                    solar.startSolarPowerGeneration();

                    
                    //Checks Availability of Resources
                    raw.isCritical();
                    
                    //Random Event 
                    place.triggerEvent();
                    System.out.println("");
                    
                    //Allow user to use of their powers to boost one of their generators
                    //Remind users that although they have an unlimited amount of resource to use their powers from, they have a limit on how much their powers can take
                    System.out.println("Choose from one of these options to use your powers towards improving your sustainability score.");
                    System.out.println("Although you have unlimited resources from the planet, there is a limit on how much your power can be used.");
                    System.out.println("\t1. Water Ability");
                    System.out.println("\t2. Sunlight Ability");
                    System.out.println("\t3. Wind Ability");
                    System.out.println("\t4. Surprise Ability #1");
                    System.out.println("\t5. Surprise Ability #2");
                    System.out.println("\t6. Surprise Ability #3");
                    System.out.println("\t7. Surprise Ability #4");
                    System.out.println("\t8. Surprise Ability #5");
                    System.out.println("\t9. Surprise Ability #6");
                    
                    int num9 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    switch (num9) {
                        case 1:
                            elements.useWaterAbility();
                            break;
                        case 2:
                            elements.useSunlightAbility();
                            break;
                        case 3:
                            elements.useAirAbility();
                            break;
                        case 4:
                            elements.manipulateWaterFlow();
                            break;
                        case 5:
                            elements.summonRain();
                            break;
                        case 6:
                            elements.createStrongWinds();
                            break;
                        case 7:
                            elements.purifyAir();
                            break;
                        case 8:
                            elements.elementalFusion();
                            break;
                        case 9:
                            elements.solarFlare();
                            break;
                        default:
                            break;
                    }
                    
                    //Wind Turbine
                    
                    //Ask how many you would like to build for wind turbines
                    System.out.println("");
                    System.out.println("HOW MANY WIND TURBINES WOULD YOU LIKE TO BUILD? ");
                    System.out.println("*** Prices of Materials ***");
                    System.out.println("Wood: $2");
                    System.out.println("Brick: $4");
                    System.out.println("Metal: $5");
                    System.out.println("Glass: $6");
                    System.out.println("Copper: $8");
                    System.out.println("Concrete: $3");
                    System.out.println("Steel: $10");
                    System.out.println("");
                    
                    //Print out list of current raw materials in city
                    System.out.println("*** Current Amount of Raw Material in Tokyo, Japan ***");
                    raw.displayCurrentCityRawMaterials(num); 
                    
                    //Print out list of needed materials for current generator being asked
                    System.out.println("");
                    System.out.println("*** Total amount needed for one wind turbine ***");
                    System.out.println("Metal: 37");
                    System.out.println("Copper: 43");
                    System.out.println("Glass: 50");
                    System.out.println("Steel: 61");
                    System.out.println("Concrete: 50");
                    System.out.println("Total: $1589");   
                    
                    //User Input for How Many
                    int num10 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    //Transaction
                    gust.adjustRotorBlades(num10, "Tokyo, Japan");
                    gust.adjustWindMonitoringSystems(num10, "Tokyo, Japan");
                    gust.adjustWindDriveShaft(num10, "Tokyo, Japan");
                    gust.adjustWindPowerStorage(num10, "Tokyo, Japan");
                    gust.adjustWindTower(num10, "Tokyo, Japan");
                    gust.adjustWindTransmissions(num10, "Tokyo, Japan");
                    gust.adjustWindVoltageConversion(num10, "Tokyo, Japan");
                    
                    
                    //Checks Availability of Resources
                    raw.isCritical();
                    
                    //Random Event 
                    place.triggerEvent();
                    System.out.println("");
                    
                    //Allow user to use of their powers to boost one of their generators
                    //Remind users that although they have an unlimited amount of resource to use their powers from, they have a limit on how much their powers can take
                    System.out.println("Choose from one of these options to use your powers towards improving your sustainability score.");
                    System.out.println("Although you have unlimited resources from the planet, there is a limit on how much your power can be used.");
                    System.out.println("\t1. Water Ability");
                    System.out.println("\t2. Sunlight Ability");
                    System.out.println("\t3. Wind Ability");
                    System.out.println("\t4. Surprise Ability #1");
                    System.out.println("\t5. Surprise Ability #2");
                    System.out.println("\t6. Surprise Ability #3");
                    System.out.println("\t7. Surprise Ability #4");
                    System.out.println("\t8. Surprise Ability #5");
                    System.out.println("\t9. Surprise Ability #6");
                    
                    int num11 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    switch (num11) {
                        case 1:
                            elements.useWaterAbility();
                            break;
                        case 2:
                            elements.useSunlightAbility();
                            break;
                        case 3:
                            elements.useAirAbility();
                            break;
                        case 4:
                            elements.manipulateWaterFlow();
                            break;
                        case 5:
                            elements.summonRain();
                            break;
                        case 6:
                            elements.createStrongWinds();
                            break;
                        case 7:
                            elements.purifyAir();
                            break;
                        case 8:
                            elements.elementalFusion();
                            break;
                        case 9:
                            elements.solarFlare();
                            break;
                        default:
                            break;
                    }
                    
                    //Hydropower System
                    
                    //Ask how many you would like to build for hydropower systems
                    System.out.println("");
                    System.out.println("HOW MANY HYDROPOWER SYSTEMS WOULD YOU LIKE TO BUILD? ");
                    System.out.println("*** Prices of Materials ***");
                    System.out.println("Wood: $2");
                    System.out.println("Brick: $4");
                    System.out.println("Metal: $5");
                    System.out.println("Glass: $6");
                    System.out.println("Copper: $8");
                    System.out.println("Concrete: $3");
                    System.out.println("Steel: $10");
                    System.out.println("");
                    
                    //Print out list of current raw materials in city
                    System.out.println("*** Current Amount of Raw Material in Tokyo, Japan ***");
                    raw2.displayCurrentCityRawMaterials(num); 
                    
                    //Print out list of needed materials for current generator being asked
                    System.out.println("");
                    System.out.println("*** Total amount needed for one hydropower system ***");
                    System.out.println("Metal: 70");
                    System.out.println("Copper: 50");
                    System.out.println("Glass: 10");
                    System.out.println("Steel: 63");
                    System.out.println("Concrete: 300");
                    System.out.println("Total: $2340");
                    
                    //User Input for How Many
                    int num12 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    //Transaction
                    hydro.updateDams(num12, "Tokyo, Japan");
                    hydro.updateHydroMonitoringSystems(num12, "Tokyo, Japan");
                    hydro.updateHydroPenStock(num12, "Tokyo, Japan");
                    hydro.updateHydroReservoirs(num12, "Tokyo, Japan");
                    hydro.updateHydroTransmissions(num12, "Tokyo, Japan");
                    hydro.updateWaterGenerator(num12, "Tokyo, Japan");
                    hydro.updateWaterPowerStorage(num12, "Tokyo, Japan");
                    hydro.updateWaterTurbines(num12, "Tokyo, Japan");
                    hydro.updateWaterVoltageConversion(num12, "Tokyo, Japan");
                    
                    //Power Generation
                    hydro.generateHydropower();
                    hydro.startSolarPowerGeneration();
                    
                    
                    //Checks Availability of Resources
                    raw.isCritical();
                    
                    //Random Event 
                    place.triggerEvent();
                    System.out.println("");
                    
                    //Allow user to use of their powers to boost one of their generators
                    //Remind users that although they have an unlimited amount of resource to use their powers from, they have a limit on how much their powers can take
                    System.out.println("Choose from one of these options to use your powers towards improving your sustainability score.");
                    System.out.println("Although you have unlimited resources from the planet, there is a limit on how much your power can be used.");
                    System.out.println("\t1. Water Ability");
                    System.out.println("\t2. Sunlight Ability");
                    System.out.println("\t3. Wind Ability");
                    System.out.println("\t4. Surprise Ability #1");
                    System.out.println("\t5. Surprise Ability #2");
                    System.out.println("\t6. Surprise Ability #3");
                    System.out.println("\t7. Surprise Ability #4");
                    System.out.println("\t8. Surprise Ability #5");
                    System.out.println("\t9. Surprise Ability #6");
                    
                    int num13 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    switch (num13) {
                        case 1:
                            elements.useWaterAbility();
                            break;
                        case 2:
                            elements.useSunlightAbility();
                            break;
                        case 3:
                            elements.useAirAbility();
                            break;
                        case 4:
                            elements.manipulateWaterFlow();
                            break;
                        case 5:
                            elements.summonRain();
                            break;
                        case 6:
                            elements.createStrongWinds();
                            break;
                        case 7:
                            elements.purifyAir();
                            break;
                        case 8:
                            elements.elementalFusion();
                            break;
                        case 9:
                            elements.solarFlare();
                            break;
                        default:
                            break;
                    }
                    
                    //Comparsion Method
                    //Checks if user passed
                    //If user did pass
                    //Print out Sustainability Score, Amount of Money Produced, and Amount of Electricity Produced
                    
                    for(Energy energy : historicalData) {
                        if (energy.getName().equals("São Paulo, Brazil")) {
                            spSustainabilityIndex = energy.getSustainabilityIndex();
                            System.out.println("São Paulo's Sustainability Index: " + spSustainabilityIndex);
                            System.out.println("Your sustainability index: " + elements.scoreImpact());
                            break;
                        }
                        else if(energy.getName().equals("Tokyo, Japan")) {
                            tokyoSustainabilityIndex = energy.getSustainabilityIndex();
                            System.out.println("Tokyo's Sustainability Index: " + tokyoSustainabilityIndex);
                            System.out.println("Your sustainability index: " + elements.scoreImpact());
                            break;
                        }
                        else if(energy.getName().equals("Neo-Terra, Arcadia")) {
                            ntSustainabilityIndex = energy.getSustainabilityIndex();
                            System.out.println("Neo-Terra's Sustainability Index: " + ntSustainabilityIndex);
                            System.out.println("Your sustainability index: " + elements.scoreImpact());
                            break;
                        }
                    }
                    
                    if(elements.scoreImpact() >= tokyoSustainabilityIndex) {
                        
                        System.out.println("Congratulations! You succeeded and saved the city!");
                        System.out.println("Sustainability Index Needed: " + ntSustainabilityIndex);
                        System.out.println("Your sustainability index: " + elements.scoreImpact());

                        int result = hydro.compareTo(hydro);
                        int result2 = gust.compareTo(gust);

                        if (result > result2) {
                            System.out.println("WindTurbine has less generated power than Hydropower.");
                            System.out.println("");
                            exitMenu = true;
                            break;
                        } 
                        else if (result < result2) {
                            System.out.println("WindTurbine has more generated power than Hydropower.");
                            System.out.println("");
                            exitMenu = true;
                            break;
                        } 
                        else {
                            System.out.println("WindTurbine and Hydropower have the same generated power.");
                            System.out.println("");
                            exitMenu = true;
                            break;
                        }
                    }
                    
                    else {
                        System.out.println("You did not achieve the sustainability index. Try again.");
                    
                        //Random Event
                        //Ask if they want to use one of their elemental storage units
                        System.out.println("Since you did not pass, use one of your elemental storage units for an extra boost.");
                        System.out.println("\t1. Sunlight");
                        System.out.println("\t2. Water");
                        System.out.println("\t3. Wind");

                        int powers2 = scan.nextInt();
                        scan.nextLine();

                        switch (powers2) {
                            case 1:
                                elements.updateSustainabilityScore(elements.getSunlightStorage());
                                elements.decrementSunlightstorage();
                                exitMenu = true;
                                break;
                            case 2:
                                elements.updateSustainabilityScore(elements.getWaterStorage());
                                elements.decrementWaterStorage();
                                exitMenu = true;
                                break;
                            case 3:
                                elements.updateSustainabilityScore(elements.getAirStorage());
                                elements.decrementAirStorage();
                                exitMenu = true;
                                break;
                            default:
                                break;
                        }   
                      }
                   }
                }
                break;

                case 3: 
                while(!exitMenu) {
                    while(true) {
                    //Storyline for City in Future
                    System.out.println("Neo-Terra's Dystopian Power Struggle");
                    System.out.println("Welcome to Neo-Terra, the utopian city on the exoplanet Arcadia in the year 2150.");
                    System.out.println("Background: Initially thriving as a beacon of sustainability, Neo-Terra faced environmental challenges on Earth and was colonized on Arcadia. \nOver time, the city has encountered a crisis with a shortage of sustainable electricity and severe weather disruptions.");
                    System.out.println();
                    System.out.println("*** Current Issues ***");
                    System.out.println("\t1. Generator Dysfunction: Neo-Terra relies on advanced energy generators powered by the planet's resources, facing frequent failures leading to crippling power outages.");
                    System.out.println("\t2. Energy Crisis: The city struggles with an energy crisis due to malfunctioning generators, impacting its infrastructure.");
                    System.out.println("\t3. Weather Manipulation Fallout: Previous attempts to control the weather have backfired, resulting in unpredictable storms and climatic events threatening the city's stability.");

                    System.out.println("*** Mission Objectives ***");
                    System.out.println("\t1. Repair malfunctioning generators to stabilize the energy supply and prevent blackouts.");
                    System.out.println("\t2. Use your weather-controlling powers to restore balance to Arcadia's climate.");
                    System.out.println("\t3. Implement measures to restore and protect Arcadia's unique ecosystem, ensuring coexistence of nature and technology.");
                    System.out.println("");
                    
                    //Ask how many they would like to build of each generator
                    
                    //Display generators they will use
                    System.out.println("These are the generators that will be accompanying you as a tool to use on your journey.");
                    
                    // Sort the generator names
                    Collections.sort(generatorNames);

                    // Display the sorted list
                    System.out.println("Sorted Generators: " + generatorNames);
                    System.out.println("");
                    
                    //Solar Panel
                    System.out.println("*** Your Current Inventory ***");
                    System.out.println("Current Balance in Universal Currency (Time Traveler Bucks that are Eligible Anywhere): $10000");
                    System.out.println("*** Current Amount of Given Elements in Storage Units ***");
                    System.out.println("Sunlight: 10000");
                    System.out.println("Water: 500");
                    System.out.println("Wind: 1000");
                    
                    System.out.println("Here is the sustainability score you need to get");
                    System.out.println("Sustainability Score: " + ntSustainabilityIndex);
                    
                    //Ask how many you would like to build for solar panels
                    System.out.println("");
                    System.out.println("HOW MANY SOLAR PANELS WOULD YOU LIKE TO BUILD? ");                    
                    System.out.println("*** Prices of Materials ***");
                    System.out.println("Wood: $2");
                    System.out.println("Brick: $4");
                    System.out.println("Metal: $5");
                    System.out.println("Glass: $6");
                    System.out.println("Copper: $8");
                    System.out.println("Concrete: $3");
                    System.out.println("Steel: $10");
                    System.out.println("");
                    
                    //Print out list of current raw materials in city
                    System.out.println("*** Current Amount of Raw Material in Neo-Terra, Arcadia ***");
                    raw3.displayCurrentCityRawMaterials(num); 
                    
                    //Print out list of needed materials for current generator being asked
                    System.out.println("");
                    System.out.println("*** Total amount needed for one solar panel ***");
                    System.out.println("Wood: 10");
                    System.out.println("Metal: 20");
                    System.out.println("Copper: 14");
                    System.out.println("Glass: 14");
                    System.out.println("Steel: 3");
                    System.out.println("Total: $346");
                    
                    //User Input for How Many
                    int num14 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    //Transaction
                    solar.modifyPowerBank(num14, "Neo-Terra, Arcadia");
                    solar.modifySolarMonitoringSystem(num14, "Neo-Terra, Arcadia");
                    solar.modifySolarTransmissions(num14, "Neo-Terra, Arcadia");
                    solar.modifySolarVoltageConversion(num14, "Neo-Terra, Arcadia");
                    
                    
                    //Checks Availability of Resources
                    raw.isCritical();
                    
                    //Random Event 
                    place.triggerEvent();
                    System.out.println("");
                    
                    //Allow user to use of their powers to boost one of their generators
                    //Remind users that although they have an unlimited amount of resource to use their powers from, they have a limit on how much their powers can take
                    System.out.println("Choose from one of these options to use your powers towards improving your sustainability score.");
                    System.out.println("Although you have unlimited resources from the planet, there is a limit on how much your power can be used.");
                    System.out.println("\t1. Water Ability");
                    System.out.println("\t2. Sunlight Ability");
                    System.out.println("\t3. Wind Ability");
                    System.out.println("\t4. Surprise Ability #1");
                    System.out.println("\t5. Surprise Ability #2");
                    System.out.println("\t6. Surprise Ability #3");
                    System.out.println("\t7. Surprise Ability #4");
                    System.out.println("\t8. Surprise Ability #5");
                    System.out.println("\t9. Surprise Ability #6");
                    
                    int num15 = scan.nextInt();
                    scan.nextLine();
                    
                    switch (num15) {
                        case 1:
                            elements.useWaterAbility();
                            break;
                        case 2:
                            elements.useSunlightAbility();
                            break;
                        case 3:
                            elements.useAirAbility();
                            break;
                        case 4:
                            elements.manipulateWaterFlow();
                            break;
                        case 5:
                            elements.summonRain();
                            break;
                        case 6:
                            elements.createStrongWinds();
                            break;
                        case 7:
                            elements.purifyAir();
                            break;
                        case 8:
                            elements.elementalFusion();
                            break;
                        case 9:
                            elements.solarFlare();
                            break;
                        default:
                            break;
                }
                    
                    //Wind Turbine
                    //Ask how many you would like to build for wind turbines
                    System.out.println("");
                    System.out.println("HOW MANY WIND TURBINES WOULD YOU LIKE TO BUILD? ");
                    System.out.println("*** Prices of Materials ***");
                    System.out.println("Wood: $2");
                    System.out.println("Brick: $4");
                    System.out.println("Metal: $5");
                    System.out.println("Glass: $6");
                    System.out.println("Copper: $8");
                    System.out.println("Concrete: $3");
                    System.out.println("Steel: $10");
                    System.out.println("");
                    
                    //Print out list of current raw materials in city
                    System.out.println("*** Current Amount of Raw Material in Neo-Terra, Arcadia ***");
                    raw3.displayCurrentCityRawMaterials(num); 
                    
                    //Print out list of needed materials for current generator being asked
                    System.out.println("");
                    System.out.println("*** Total amount needed for one hydropower system ***");
                    System.out.println("Metal: 37");
                    System.out.println("Copper: 43");
                    System.out.println("Glass: 50");
                    System.out.println("Steel: 61");
                    System.out.println("Concrete: 50");
                    System.out.println("Total: $1589");
                    
                    //User Input for How Many
                    int num16 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    //Transaction
                    gust.adjustRotorBlades(num16, "Neo-Terra, Arcadia");
                    gust.adjustWindMonitoringSystems(num16, "Neo-Terra, Arcadia");
                    gust.adjustWindDriveShaft(num16, "Neo-Terra, Arcadia");
                    gust.adjustWindPowerStorage(num16, "Neo-Terra, Arcadia");
                    gust.adjustWindTower(num16, "Neo-Terra, Arcadia");
                    gust.adjustWindTransmissions(num16, "Neo-Terra, Arcadia");
                    gust.adjustWindVoltageConversion(num16, "Neo-Terra, Arcadia");
                    
                    //Power Generation
                    gust.generateWindPower();
                    gust.startSolarPowerGeneration();
                    
                    
                    //Checks Availability of Resources
                    raw.isCritical();
                    
                    //Random Event 
                    place.triggerEvent();
                    System.out.println("");
                    
                    //Allow user to use of their powers to boost one of their generators
                    //Remind users that although they have an unlimited amount of resource to use their powers from, they have a limit on how much their powers can take
                    System.out.println("Choose from one of these options to use your powers towards improving your sustainability score.");
                    System.out.println("Although you have unlimited resources from the planet, there is a limit on how much your power can be used.");
                    System.out.println("\t1. Water Ability");
                    System.out.println("\t2. Sunlight Ability");
                    System.out.println("\t3. Wind Ability");
                    System.out.println("\t4. Surprise Ability #1");
                    System.out.println("\t5. Surprise Ability #2");
                    System.out.println("\t6. Surprise Ability #3");
                    System.out.println("\t7. Surprise Ability #4");
                    System.out.println("\t8. Surprise Ability #5");
                    System.out.println("\t9. Surprise Ability #6");
                    
                    int num17 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    switch (num17) {
                        case 1:
                            elements.useWaterAbility();
                            break;
                        case 2:
                            elements.useSunlightAbility();
                            break;
                        case 3:
                            elements.useAirAbility();
                            break;
                        case 4:
                            elements.manipulateWaterFlow();
                            break;
                        case 5:
                            elements.summonRain();
                            break;
                        case 6:
                            elements.createStrongWinds();
                            break;
                        case 7:
                            elements.purifyAir();
                            break;
                        case 8:
                            elements.elementalFusion();
                            break;
                        case 9:
                            elements.solarFlare();
                            break;
                        default:
                            break;
                    }
                    
                    //Hydropower System
                    
                    //Ask how many you would like to build for hydropower systems
                    System.out.println("");
                    System.out.println("HOW MANY HYDROPOWER SYSTEMS WOULD YOU LIKE TO BUILD? ");
                    System.out.println("*** Prices of Materials ***");
                    System.out.println("Wood: $2");
                    System.out.println("Brick: $4");
                    System.out.println("Metal: $5");
                    System.out.println("Glass: $6");
                    System.out.println("Copper: $8");
                    System.out.println("Concrete: $3");
                    System.out.println("Steel: $10");
                    System.out.println("");
                    
                    //Print out list of current raw materials in city
                    System.out.println("*** Current Amount of Raw Material in Neo-Terra, Arcadia ***");
                    raw.displayCurrentCityRawMaterials(num); 
                    
                    //Print out list of needed materials for current generator being asked
                    System.out.println("");
                    System.out.println("*** Total amount needed for one hydropower system ***");
                    System.out.println("Metal: 70");
                    System.out.println("Copper: 50");
                    System.out.println("Glass: 10");
                    System.out.println("Steel: 63");
                    System.out.println("Concrete: 300");
                    System.out.println("Total: $2340");
                    
                    
                    //User Input for How Many
                    int num18 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    //Transaction
                    hydro.updateDams(num18, "São Paulo, Brazil");
                    hydro.updateHydroMonitoringSystems(num18, "São Paulo, Brazil");
                    hydro.updateHydroPenStock(num18, "São Paulo, Brazil");
                    hydro.updateHydroReservoirs(num18, "São Paulo, Brazil");
                    hydro.updateHydroTransmissions(num18, "São Paulo, Brazil");
                    hydro.updateWaterGenerator(num18, "São Paulo, Brazil");
                    hydro.updateWaterPowerStorage(num18, "São Paulo, Brazil");
                    hydro.updateWaterTurbines(num18, "São Paulo, Brazil");
                    hydro.updateWaterVoltageConversion(num18, "São Paulo, Brazil");
                    
                    //Power Generation
                    hydro.generateHydropower();
                    hydro.startSolarPowerGeneration();
                    
                    //Checks Availability of Resources
                    raw.isCritical();
                    
                    //Random Event 
                    place.triggerEvent();
                    System.out.println("");
                    
                    //Allow user to use of their powers to boost one of their generators
                    //Remind users that although they have an unlimited amount of resource to use their powers from, they have a limit on how much their powers can take
                    System.out.println("Choose from one of these options to use your powers towards improving your sustainability score.");
                    System.out.println("Although you have unlimited resources from the planet, there is a limit on how much your power can be used.");
                    System.out.println("\t1. Water Ability");
                    System.out.println("\t2. Sunlight Ability");
                    System.out.println("\t3. Wind Ability");
                    System.out.println("\t4. Surprise Ability #1");
                    System.out.println("\t5. Surprise Ability #2");
                    System.out.println("\t6. Surprise Ability #3");
                    System.out.println("\t7. Surprise Ability #4");
                    System.out.println("\t8. Surprise Ability #5");
                    System.out.println("\t9. Surprise Ability #6");
                    
                    int num19 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("");
                    
                    switch (num19) {
                        case 1:
                            elements.useWaterAbility();
                            break;
                        case 2:
                            elements.useSunlightAbility();
                            break;
                        case 3:
                            elements.useAirAbility();
                            break;
                        case 4:
                            elements.manipulateWaterFlow();
                            break;
                        case 5:
                            elements.summonRain();
                            break;
                        case 6:
                            elements.createStrongWinds();
                            break;
                        case 7:
                            elements.purifyAir();
                            break;
                        case 8:
                            elements.elementalFusion();
                            break;
                        case 9:
                            elements.solarFlare();
                            break;
                        default:
                            break;
                    }
                    
                    //Comparsion Method
                    //Checks if user passed
                    //If user did pass
                    //Print out Sustainability Score, Amount of Money Produced, and Amount of Electricity Produced
                    
                    for(Energy energy : historicalData) {
                        if (energy.getName().equals("São Paulo, Brazil")) {
                            spSustainabilityIndex = energy.getSustainabilityIndex();
                            System.out.println("São Paulo's Sustainability Index: " + spSustainabilityIndex);
                            System.out.println("Your sustainability index: " + elements.scoreImpact());
                            break;
                        }
                        else if(energy.getName().equals("Tokyo, Japan")) {
                            tokyoSustainabilityIndex = energy.getSustainabilityIndex();
                            System.out.println("Tokyo's Sustainability Index: " + tokyoSustainabilityIndex);
                            System.out.println("Your sustainability index: " + elements.scoreImpact());
                            break;
                        }
                        else if(energy.getName().equals("Neo-Terra, Arcadia")) {
                            ntSustainabilityIndex = energy.getSustainabilityIndex();
                            System.out.println("Neo-Terra's Sustainability Index: " + ntSustainabilityIndex);
                            System.out.println("Your sustainability index: " + elements.scoreImpact());
                            break;
                        }
                    }
                    
                    if(elements.scoreImpact() >= ntSustainabilityIndex) {
                        
                        System.out.println("Congratulations! You succeeded and saved the city!");
                        System.out.println("Sustainability Index Needed: " + ntSustainabilityIndex);
                        System.out.println("Your sustainability index: " + elements.scoreImpact());

                        int result = hydro.compareTo(hydro);
                        int result2 = gust.compareTo(gust);

                        if (result > result2) {
                            System.out.println("WindTurbine has less generated power than Hydropower.");
                            System.out.println("");
                            exitMenu = true;
                            break;
                        } 
                        else if (result < result2) {
                            System.out.println("WindTurbine has more generated power than Hydropower.");
                            System.out.println("");
                            exitMenu = true;
                            break;
                        } 
                        else {
                            System.out.println("WindTurbine and Hydropower have the same generated power.");
                            System.out.println("");
                            exitMenu = true;
                            break;
                        }
                    }
                    else {
                        System.out.println("You did not achieve the sustainability index. Try again.");

                        //Random Event
                        //Ask if they want to use one of their elemental storage units
                            System.out.println("Since you did not pass, use one of your elemental storage units for an extra boost.");
                            System.out.println("\t1. Sunlight");
                            System.out.println("\t2. Water");
                            System.out.println("\t3. Wind");

                            int powers3 = scan.nextInt();
                            scan.nextLine();

                            switch (powers3) {
                                case 1:
                                    elements.updateSustainabilityScore(elements.getSunlightStorage());
                                    elements.decrementSunlightstorage();
                                    exitMenu = true;
                                    break;
                                case 2:
                                    elements.updateSustainabilityScore(elements.getWaterStorage());
                                    elements.decrementWaterStorage();
                                    exitMenu = true;
                                    break;
                                case 3:
                                    elements.updateSustainabilityScore(elements.getAirStorage());
                                    elements.decrementAirStorage();
                                    exitMenu = true;
                                    break;
                                default:
                                    exitMenu = true;
                                    break;
                        }
                      }
                    }
                  }
                break;
                case 4:
                    System.out.println("Thank you for playing! Hope to see you in another time!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, but you need to enter a 1, 2, 3, 4, or 5");
            }
                
            }  
        }
    }
