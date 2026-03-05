class GenericBluetoothEarphones {

    // Static variable declaration & initialization
    static String brandName = "Generic";
    static String modelNumber = "B0GHMXT";
    static String ageRange = "Teen, Adult";
    static String countryOfOrigin = "India";
    static String manufacturer = "VAGHANI ENTERPRISES";
    static String itemTypeName = "In-Ear Headphones";

    static String manufacturerAddress =
            "Vaghani Enterprises, India";

    static String audioDriverType = "Dynamic Driver";
    static String productFeatures = "Noise Cancellation, Sweatproof, Touch Control";
    static String enclosureMaterial = "Plastic";
    static String usage = "Music, Gaming";
    static String compatibleDevices = "Cellphones, Tablets, Laptops, Desktops";
    static String waterResistance = "Water Resistant";

    static String connectivityTechnology = "Wireless";
    static String wirelessType = "Bluetooth";
    static double bluetoothRange = 10.0;
    static double bluetoothVersion = 5.1;

    static int batteryChargeTimeMinutes = 10;
    static int batteryLifeHours = 7;

    static String asin = "B0GHMXTDCW";

    public static void main(String[] args) {

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