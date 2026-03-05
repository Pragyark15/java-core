class BluetoothEarphones {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String modelNumber;
    static String ageRange;
    static String countryOfOrigin;
    static String manufacturer;
    static String itemTypeName;
    static String manufacturerAddress;

    static String audioDriverType;
    static String productFeatures;
    static String enclosureMaterial;
    static String usage;
    static String compatibleDevices;
    static String waterResistance;

    static String connectivityTechnology;
    static String wirelessType;
    static double bluetoothRange;
    static double bluetoothVersion;

    static int batteryChargeTimeMinutes;
    static int batteryLifeHours;

    static String asin;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "Generic";
        modelNumber = "B0GHMXT";
        ageRange = "Teen, Adult";
        countryOfOrigin = "India";
        manufacturer = "VAGHANI ENTERPRISES";
        itemTypeName = "In-Ear Headphones";

        manufacturerAddress = "Vaghani Enterprises, India";

        audioDriverType = "Dynamic Driver";
        productFeatures = "Noise Cancellation, Sweatproof, Touch Control";
        enclosureMaterial = "Plastic";
        usage = "Music, Gaming";
        compatibleDevices = "Cellphones, Tablets, Laptops, Desktops";
        waterResistance = "Water Resistant";

        connectivityTechnology = "Wireless";
        wirelessType = "Bluetooth";
        bluetoothRange = 10.0;
        bluetoothVersion = 5.1;

        batteryChargeTimeMinutes = 10;
        batteryLifeHours = 7;

        asin = "B0GHMXTDCW";

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Age Range: " + ageRange);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Item Type Name: " + itemTypeName);
        System.out.println("Manufacturer Address: " + manufacturerAddress);

        System.out.println("Audio Driver Type: " + audioDriverType);
        System.out.println("Product Features: " + productFeatures);
        System.out.println("Enclosure Material: " + enclosureMaterial);
        System.out.println("Usage: " + usage);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Water Resistance: " + waterResistance);

        System.out.println("Connectivity Technology: " + connectivityTechnology);
        System.out.println("Wireless Type: " + wirelessType);
        System.out.println("Bluetooth Range: " + bluetoothRange + " meters");
        System.out.println("Bluetooth Version: " + bluetoothVersion);

        System.out.println("Battery Charge Time: " + batteryChargeTimeMinutes + " minutes");
        System.out.println("Battery Life: " + batteryLifeHours + " hours");

        System.out.println("ASIN: " + asin);
    }
}