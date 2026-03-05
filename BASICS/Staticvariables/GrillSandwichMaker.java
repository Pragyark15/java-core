class GrillSandwichMaker {

    // Static variable declaration & initialization
    static String brandName = "MILTON";
    static String itemType = "Sandwich Maker";
    static String colour = "Black";
    static String productStyle = "Griller";

    static int wattage = 800;
    static int voltage = 230;

    static String specialFeatures = "Non Stick Coating";
    static String includedComponents =
            "Griller, Instruction Manual, Warranty Card";

    static String countryOfOrigin = "India";

    static String manufacturerAddress =
            "Hydro Valves, Customer Support Call @ 9355645866 or Email: info@miltonhomeappliances.com "
          + "(Monday to Saturday, 10:00 AM to 5:30 PM, Excluding National Holidays)";

    static int unitCount = 1;
    static String asin = "B0CGBWMK1";
    static double rating = 4.0;

    public static void main(String[] args) {

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