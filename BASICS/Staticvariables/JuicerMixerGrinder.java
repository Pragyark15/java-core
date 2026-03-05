class JuicerMixerGrinder {

    // Static variable declaration & initialization
    static String brandName = "NutriPro";
    static String itemType = "Mixer Grinder";
    static String includedComponents = "Mixers";
    static String recommendedUses = "Grinding, Juices";

    static int wattage = 500;
    static int numberOfSpeeds = 2;
    static int voltage = 230;
    static String powerSource = "Corded Electric";

    static String specialFeatures = "Detachable Attachment";
    static String countryOfOrigin = "India";

    static String manufacturerAddress =
            "Cookwell Domestic Appliances Pvt Ltd, Bhiwandi - 421302, Maharashtra, India. "
          + "Customer Care Number: 90225 90225";

    static String warranty = "2 Year Pick & Drop Warranty";
    static String asin = "B09J2T124D";
    static double rating = 4.4;
    static int unitCount = 1;

    public static void main(String[] args) {

        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Recommended Uses: " + recommendedUses);

        System.out.println("Wattage: " + wattage + " Watts");
        System.out.println("Number Of Speeds: " + numberOfSpeeds);
        System.out.println("Voltage: " + voltage + " Volts");
        System.out.println("Power Source: " + powerSource);

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Warranty: " + warranty);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
        System.out.println("Unit Count: " + unitCount);
    }
}