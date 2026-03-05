class WashingMachine {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String type;
    static String colour;

    static int capacityKg;
    static int spinSpeedRPM;
    static boolean inverterMotor;

    static int washPrograms;
    static boolean childLock;
    static boolean autoRestart;

    static String drumMaterial;
    static String controlType;

    static int voltage;
    static double weightKg;

    static String warranty;
    static String countryOfOrigin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Samsung";
        model = "WA65A4002VS";
        type = "Top Load";
        colour = "Silver";

        capacityKg = 6;
        spinSpeedRPM = 680;
        inverterMotor = true;

        washPrograms = 6;
        childLock = true;
        autoRestart = true;

        drumMaterial = "Stainless Steel";
        controlType = "Fully Automatic";

        voltage = 230;
        weightKg = 28.5;

        warranty = "2 Years Product + 10 Years Motor";
        countryOfOrigin = "India";
        rating = 4.3;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Colour: " + colour);

        System.out.println("Capacity: " + capacityKg + " kg");
        System.out.println("Spin Speed: " + spinSpeedRPM + " RPM");
        System.out.println("Inverter Motor: " + inverterMotor);

        System.out.println("Wash Programs: " + washPrograms);
        System.out.println("Child Lock: " + childLock);
        System.out.println("Auto Restart: " + autoRestart);

        System.out.println("Drum Material: " + drumMaterial);
        System.out.println("Control Type: " + controlType);

        System.out.println("Voltage: " + voltage + " Volts");
        System.out.println("Weight: " + weightKg + " kg");

        System.out.println("Warranty: " + warranty);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}