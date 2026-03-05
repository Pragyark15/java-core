class ElectricKettle {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String colour;
    static String bodyMaterial;

    static double capacityLitres;
    static int powerWatts;
    static boolean autoCutOff;

    static boolean dryBoilProtection;
    static boolean indicatorLight;
    static String heatingElementType;

    static String handleType;
    static String lidType;

    static int voltage;
    static double weightKg;

    static String warranty;
    static String countryOfOrigin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Prestige";
        model = "PKOSS";
        colour = "Silver";
        bodyMaterial = "Stainless Steel";

        capacityLitres = 1.5;
        powerWatts = 1500;
        autoCutOff = true;

        dryBoilProtection = true;
        indicatorLight = true;
        heatingElementType = "Concealed";

        handleType = "Cool Touch";
        lidType = "Lockable Lid";

        voltage = 230;
        weightKg = 0.9;

        warranty = "1 Year Warranty";
        countryOfOrigin = "India";
        rating = 4.3;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Body Material: " + bodyMaterial);

        System.out.println("Capacity: " + capacityLitres + " Litres");
        System.out.println("Power: " + powerWatts + " Watts");
        System.out.println("Auto Cut Off: " + autoCutOff);

        System.out.println("Dry Boil Protection: " + dryBoilProtection);
        System.out.println("Indicator Light: " + indicatorLight);
        System.out.println("Heating Element Type: " + heatingElementType);

        System.out.println("Handle Type: " + handleType);
        System.out.println("Lid Type: " + lidType);

        System.out.println("Voltage: " + voltage + " Volts");
        System.out.println("Weight: " + weightKg + " kg");

        System.out.println("Warranty: " + warranty);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}