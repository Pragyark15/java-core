class MobilePhone {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String modelName;
    static String operatingSystem;

    static int ramGB;
    static int storageGB;
    static double processorSpeedGHz;

    static String colour;
    static String simSlot;
    static String connectorType;
    static String formFactor;

    static String biometricSecurity;
    static String simCardSize;
    static String waterResistance;
    static String productFeatures;

    static int frontCameraMP;
    static int rearCameraMP;
    static int numberOfRearCameras;
    static int numberOfFrontCameras;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "iQOO";
        modelName = "Z10R 5G";
        operatingSystem = "Funtouch OS 15 Based on Android 15";

        ramGB = 8;
        storageGB = 128;
        processorSpeedGHz = 2.6;

        colour = "Aquamarine";
        simSlot = "Dual SIM";
        connectorType = "USB Type C";
        formFactor = "Bar";

        biometricSecurity = "Fingerprint Recognition";
        simCardSize = "Nano";
        waterResistance = "Water Resistant";
        productFeatures = "Fast Charging Support, Water Resistant";

        frontCameraMP = 32;
        rearCameraMP = 50;
        numberOfRearCameras = 2;
        numberOfFrontCameras = 1;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Operating System: " + operatingSystem);

        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Storage: " + storageGB + " GB");
        System.out.println("Processor Speed: " + processorSpeedGHz + " GHz");

        System.out.println("Colour: " + colour);
        System.out.println("SIM Slot: " + simSlot);
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Form Factor: " + formFactor);

        System.out.println("Biometric Security: " + biometricSecurity);
        System.out.println("SIM Card Size: " + simCardSize);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Product Features: " + productFeatures);

        System.out.println("Front Camera: " + frontCameraMP + " MP");
        System.out.println("Rear Camera: " + rearCameraMP + " MP");
        System.out.println("Number Of Rear Cameras: " + numberOfRearCameras);
        System.out.println("Number Of Front Cameras: " + numberOfFrontCameras);
    }
}