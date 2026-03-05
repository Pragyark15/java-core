class PhilipsAirFryer {

    // Static variable declaration & initialization
    static String brandName = "Philips";
    static String modelName = "HD9200/90";
    static String itemType = "Air Fryer";
    static String recommendedUses = "Bake, Reheat, Roast";

    static int outputWattage = 1400;
    static int voltage = 240;
    static String controlMethod = "Touch";
    static String airFryingTechnology = "Rapid Air";

    static int minTemperatureCelsius = 60;
    static int maxTemperatureCelsius = 200;

    static String specialFeatures = "Programmable, Temperature Control";
    static String includedComponents = "Air Fryer, User Manual";
    static String countryOfOrigin = "India";

    static String manufacturerAddress =
            "Versuni India Home Solutions Ltd., 3rd Floor, Tower A, DLF IT Park, "
          + "08 Block AF Major Arterial Road, New Town (Rajarhat), Kolkata, West Bengal 700156, India";

    static String warranty = "2 Year World Wide Warranty";
    static String asin = "B09CTWFV5W";
    static double rating = 4.3;
    static int unitCount = 1;

    public static void main(String[] args) {

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