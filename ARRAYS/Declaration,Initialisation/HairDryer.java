class HairDryer {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String colour;
    static String bodyMaterial;

    static int powerWatts;
    static int heatSettings;
    static int speedSettings;

    static boolean coolShot;
    static boolean foldableHandle;
    static String nozzleType;

    static String cordLength;
    static String motorType;

    static int voltage;
    static double weightKg;

    static String warranty;
    static String countryOfOrigin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Philips";
        model = "HP8100";
        colour = "Pink";
        bodyMaterial = "Plastic";

        powerWatts = 1000;
        heatSettings = 2;
        speedSettings = 2;

        coolShot = true;
        foldableHandle = true;
        nozzleType = "Concentrator";

        cordLength = "1.5 meters";
        motorType = "DC Motor";

        voltage = 230;
        weightKg = 0.4;

        warranty = "2 Years Warranty";
        countryOfOrigin = "India";
        rating = 4.2;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Body Material: " + bodyMaterial);

        System.out.println("Power: " + powerWatts + " Watts");
        System.out.println("Heat Settings: " + heatSettings);
        System.out.println("Speed Settings: " + speedSettings);

        System.out.println("Cool Shot: " + coolShot);
        System.out.println("Foldable Handle: " + foldableHandle);
        System.out.println("Nozzle Type: " + nozzleType);

        System.out.println("Cord Length: " + cordLength);
        System.out.println("Motor Type: " + motorType);

        System.out.println("Voltage: " + voltage + " Volts");
        System.out.println("Weight: " + weightKg + " kg");

        System.out.println("Warranty: " + warranty);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}