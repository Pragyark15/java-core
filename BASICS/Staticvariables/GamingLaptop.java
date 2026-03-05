class GamingLaptop {

    // Static variable declaration & initialization
    static String brandName = "Dell";
    static String modelName = "G15 5530";
    static String colour = "Dark Shadow Gray";
    static String operatingSystem = "Windows 11 Home";

    static String processorBrand = "Intel";
    static String graphicsProcessor = "NVIDIA GeForce RTX 3050";
    static int graphicsRamGB = 6;
    static String graphicsRamType = "GDDR6";

    static int storageTB = 1;
    static String storageType = "SSD";
    static String specialFeatures = "Backlit Keyboard";
    static String usage = "Gaming";

    static boolean webcamAvailable = true;
    static int itemWeightGrams = 2600;
    static String videoOutput = "HDMI 2.1";

    static String warrantyType =
            "1 Year Basic Onsite Service after remote diagnosis with Hardware-Only Support";

    public static void main(String[] args) {

        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Colour: " + colour);
        System.out.println("Operating System: " + operatingSystem);

        System.out.println("Processor Brand: " + processorBrand);
        System.out.println("Graphics Processor: " + graphicsProcessor);
        System.out.println("Graphics RAM: " + graphicsRamGB + " GB");
        System.out.println("Graphics RAM Type: " + graphicsRamType);

        System.out.println("Storage Capacity: " + storageTB + " TB");
        System.out.println("Storage Type: " + storageType);
        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Usage: " + usage);

        System.out.println("Webcam Available: " + webcamAvailable);
        System.out.println("Item Weight: " + itemWeightGrams + " grams");
        System.out.println("Video Output: " + videoOutput);
        System.out.println("Warranty Type: " + warrantyType);
    }
}