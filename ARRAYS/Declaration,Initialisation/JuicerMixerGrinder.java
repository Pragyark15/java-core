class JuicerMixerGrinder {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String itemType;
    static String includedComponents;
    static String recommendedUses;

    static int wattage;
    static int numberOfSpeeds;
    static int voltage;
    static String powerSource;

    static String specialFeatures;
    static String countryOfOrigin;

    static String manufacturerAddress;
    static String warranty;
    static String asin;
    static double rating;
    static int unitCount;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "NutriPro";
        itemType = "Mixer Grinder";
        includedComponents = "Mixers";
        recommendedUses = "Grinding, Juices";

        wattage = 500;
        numberOfSpeeds = 2;
        voltage = 230;
        powerSource = "Corded Electric";

        specialFeatures = "Detachable Attachment";
        countryOfOrigin = "India";

        manufacturerAddress = "Cookwell Domestic Appliances Pvt Ltd, Bhiwandi - 421302, Maharashtra, India. Customer Care Number: 90225 90225";
        warranty = "2 Year Pick & Drop Warranty";
        asin = "B09J2T124D";
        rating = 4.4;
        unitCount = 1;

        // ===== PRINT =====
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