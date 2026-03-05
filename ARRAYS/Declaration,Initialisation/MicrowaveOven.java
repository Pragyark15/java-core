class MicrowaveOven {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String colour;
    static String type;

    static int capacityLitres;
    static int powerWatts;
    static boolean convection;

    static int autoMenus;
    static boolean childLock;
    static boolean timerAvailable;

    static String controlType;
    static String interiorMaterial;

    static int voltage;
    static double weightKg;

    static String warranty;
    static String countryOfOrigin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "IFB";
        model = "20SC2";
        colour = "Black";
        type = "Convection";

        capacityLitres = 20;
        powerWatts = 800;
        convection = true;

        autoMenus = 24;
        childLock = true;
        timerAvailable = true;

        controlType = "Touch Key Pad";
        interiorMaterial = "Stainless Steel";

        voltage = 230;
        weightKg = 13.5;

        warranty = "1 Year Product Warranty";
        countryOfOrigin = "India";
        rating = 4.2;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Type: " + type);

        System.out.println("Capacity: " + capacityLitres + " Litres");
        System.out.println("Power: " + powerWatts + " Watts");
        System.out.println("Convection: " + convection);

        System.out.println("Auto Menus: " + autoMenus);
        System.out.println("Child Lock: " + childLock);
        System.out.println("Timer Available: " + timerAvailable);

        System.out.println("Control Type: " + controlType);
        System.out.println("Interior Material: " + interiorMaterial);

        System.out.println("Voltage: " + voltage + " Volts");
        System.out.println("Weight: " + weightKg + " kg");

        System.out.println("Warranty: " + warranty);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}