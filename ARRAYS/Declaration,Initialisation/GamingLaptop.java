class GamingLaptop {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String modelName;
    static String colour;
    static String operatingSystem;

    static String processorBrand;
    static String graphicsProcessor;
    static int graphicsRamGB;
    static String graphicsRamType;

    static int storageTB;
    static String storageType;
    static String specialFeatures;
    static String usage;

    static boolean webcamAvailable;
    static int itemWeightGrams;
    static String videoOutput;

    static String warrantyType;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "Dell";
        modelName = "G15 5530";
        colour = "Dark Shadow Gray";
        operatingSystem = "Windows 11 Home";

        processorBrand = "Intel";
        graphicsProcessor = "NVIDIA GeForce RTX 3050";
        graphicsRamGB = 6;
        graphicsRamType = "GDDR6";

        storageTB = 1;
        storageType = "SSD";
        specialFeatures = "Backlit Keyboard";
        usage = "Gaming";

        webcamAvailable = true;
        itemWeightGrams = 2600;
        videoOutput = "HDMI 2.1";

        warrantyType = "1 Year Basic Onsite Service after remote diagnosis with Hardware-Only Support";

        // ===== PRINT =====
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