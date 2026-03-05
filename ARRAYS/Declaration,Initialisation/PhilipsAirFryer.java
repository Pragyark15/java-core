class PhilipsAirFryer {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String modelName;
    static String itemType;
    static String recommendedUses;

    static int outputWattage;
    static int voltage;
    static String controlMethod;
    static String airFryingTechnology;

    static int minTemperatureCelsius;
    static int maxTemperatureCelsius;

    static String specialFeatures;
    static String includedComponents;
    static String countryOfOrigin;

    static String manufacturerAddress;
    static String warranty;
    static String asin;
    static double rating;
    static int unitCount;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "Philips";
        modelName = "HD9200/90";
        itemType = "Air Fryer";
        recommendedUses = "Bake, Reheat, Roast";

        outputWattage = 1400;
        voltage = 240;
        controlMethod = "Touch";
        airFryingTechnology = "Rapid Air";

        minTemperatureCelsius = 60;
        maxTemperatureCelsius = 200;

        specialFeatures = "Programmable, Temperature Control";
        includedComponents = "Air Fryer, User Manual";
        countryOfOrigin = "India";

        manufacturerAddress = "Versuni India Home Solutions Ltd., 3rd Floor, Tower A, DLF IT Park, 08 Block AF Major Arterial Road, New Town (Rajarhat), Kolkata, West Bengal 700156, India";
        warranty = "2 Year World Wide Warranty";
        asin = "B09CTWFV5W";
        rating = 4.3;
        unitCount = 1;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Recommended Uses: " + recommendedUses);

        System.out.println("Output Wattage: " + outputWattage + " Watts");
        System.out.println("Voltage: " + voltage + " Volts");
        System.out.println("Control Method: " + controlMethod);
        System.out.println("Air Frying Technology: " + airFryingTechnology);

        System.out.println("Minimum Temperature: " + minTemperatureCelsius + " °C");
        System.out.println("Maximum Temperature: " + maxTemperatureCelsius + " °C");

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Warranty: " + warranty);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
        System.out.println("Unit Count: " + unitCount);
    }
}