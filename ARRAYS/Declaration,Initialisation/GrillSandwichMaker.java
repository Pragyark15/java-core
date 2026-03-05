class GrillSandwichMaker {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String itemType;
    static String colour;
    static String productStyle;

    static int wattage;
    static int voltage;

    static String specialFeatures;
    static String includedComponents;
    static String countryOfOrigin;

    static String manufacturerAddress;
    static int unitCount;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "MILTON";
        itemType = "Sandwich Maker";
        colour = "Black";
        productStyle = "Griller";

        wattage = 800;
        voltage = 230;

        specialFeatures = "Non Stick Coating";
        includedComponents = "Griller, Instruction Manual, Warranty Card";
        countryOfOrigin = "India";

        manufacturerAddress = "Hydro Valves, Customer Support Call @ 9355645866 or Email: info@miltonhomeappliances.com (Monday to Saturday, 10:00 AM to 5:30 PM, Excluding National Holidays)";
        unitCount = 1;
        asin = "B0CGBWMK1";
        rating = 4.0;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Colour: " + colour);
        System.out.println("Product Style: " + productStyle);

        System.out.println("Wattage: " + wattage + " Watts");
        System.out.println("Voltage: " + voltage + " Volts");

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Unit Count: " + unitCount);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}