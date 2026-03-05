class BluetoothSpeaker {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String colour;
    static String connectivity;

    static int batteryHours;
    static int powerOutputWatts;
    static boolean waterproof;

    static String compatibleDevices;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Boat";
        model = "Stone 350";
        colour = "Black";
        connectivity = "Bluetooth";

        batteryHours = 12;
        powerOutputWatts = 10;
        waterproof = true;

        compatibleDevices = "Mobile, Laptop";
        rating = 4.4;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Connectivity: " + connectivity);

        System.out.println("Battery Hours: " + batteryHours);
        System.out.println("Power Output: " + powerOutputWatts + " Watts");
        System.out.println("Waterproof: " + waterproof);

        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Rating: " + rating + " out of 5");
    }
}