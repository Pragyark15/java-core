class SmartWatch {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String displayType;
    static String colour;

    static int batteryLifeDays;
    static boolean bluetoothCalling;
    static boolean waterResistant;

    static String compatibleOS;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Noise";
        model = "ColorFit Pro";
        displayType = "AMOLED";
        colour = "Black";

        batteryLifeDays = 7;
        bluetoothCalling = true;
        waterResistant = true;

        compatibleOS = "Android & iOS";
        rating = 4.2;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Display Type: " + displayType);
        System.out.println("Colour: " + colour);

        System.out.println("Battery Life Days: " + batteryLifeDays);
        System.out.println("Bluetooth Calling: " + bluetoothCalling);
        System.out.println("Water Resistant: " + waterResistant);

        System.out.println("Compatible OS: " + compatibleOS);
        System.out.println("Rating: " + rating + " out of 5");
    }
}