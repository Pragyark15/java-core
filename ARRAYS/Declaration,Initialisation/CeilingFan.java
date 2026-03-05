class CeilingFan {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String colour;
    static String bladeMaterial;

    static int numberOfBlades;
    static int speedRPM;
    static int powerWatts;

    static boolean remoteControl;
    static boolean ledLight;
    static String mountingType;

    static String airDelivery;
    static String motorType;

    static int voltage;
    static double weightKg;

    static String warranty;
    static String countryOfOrigin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Havells";
        model = "Andria";
        colour = "Brown";
        bladeMaterial = "Aluminium";

        numberOfBlades = 3;
        speedRPM = 390;
        powerWatts = 50;

        remoteControl = false;
        ledLight = false;
        mountingType = "Ceiling Mount";

        airDelivery = "230 CMM";
        motorType = "Copper Motor";

        voltage = 230;
        weightKg = 4.5;

        warranty = "2 Years Warranty";
        countryOfOrigin = "India";
        rating = 4.1;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Blade Material: " + bladeMaterial);

        System.out.println("Number Of Blades: " + numberOfBlades);
        System.out.println("Speed: " + speedRPM + " RPM");
        System.out.println("Power: " + powerWatts + " Watts");

        System.out.println("Remote Control: " + remoteControl);
        System.out.println("LED Light: " + ledLight);
        System.out.println("Mounting Type: " + mountingType);

        System.out.println("Air Delivery: " + airDelivery);
        System.out.println("Motor Type: " + motorType);

        System.out.println("Voltage: " + voltage + " Volts");
        System.out.println("Weight: " + weightKg + " kg");

        System.out.println("Warranty: " + warranty);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}