class MobilePhone {

    // Static variable declaration & initialization
    static String brandName = "iQOO";
    static String modelName = "Z10R 5G";
    static String operatingSystem = "Funtouch OS 15 Based on Android 15";

    static int ramGB = 8;
    static int storageGB = 128;
    static double processorSpeedGHz = 2.6;

    static String colour = "Aquamarine";
    static String simSlot = "Dual SIM";
    static String connectorType = "USB Type C";
    static String formFactor = "Bar";

    static String biometricSecurity = "Fingerprint Recognition";
    static String simCardSize = "Nano";
    static String waterResistance = "Water Resistant";
    static String productFeatures = "Fast Charging Support, Water Resistant";

    static int frontCameraMP = 32;
    static int rearCameraMP = 50;
    static int numberOfRearCameras = 2;
    static int numberOfFrontCameras = 1;

    public static void main(String[] args) {

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