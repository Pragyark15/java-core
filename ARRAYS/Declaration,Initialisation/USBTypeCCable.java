class USBTypeCCable {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String connectorType;
    static String cableType;
    static String compatibleDevices;
    static String specialFeatures;

    static String compatiblePhoneModels;
    static String connectorGender;
    static double dataTransferRateGbps;
    static int numberOfPins;
    static int maximumCurrentAmps;

    static String connectivityTechnology;
    static String specificationMet;
    static String usage;

    static int unitCount;
    static int itemWeightGrams;
    static int numberOfItems;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "Ambrane";
        connectorType = "USB Type C";
        cableType = "USB";
        compatibleDevices = "Tablet, Laptop, Smartphone, Headphones, Charging Adapter, Android";
        specialFeatures = "Fast Charging, Tangle Free, Data Transfer, Data Sync, Flexible, Braided, Durable";

        compatiblePhoneModels = "All Smartphones";
        connectorGender = "Male to Male";
        dataTransferRateGbps = 0.48;
        numberOfPins = 24;
        maximumCurrentAmps = 3;

        connectivityTechnology = "USB";
        specificationMet = "Qualcomm";
        usage = "Indoor";

        unitCount = 2;
        itemWeightGrams = 140;
        numberOfItems = 2;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Cable Type: " + cableType);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Special Features: " + specialFeatures);

        System.out.println("Compatible Phone Models: " + compatiblePhoneModels);
        System.out.println("Connector Gender: " + connectorGender);
        System.out.println("Data Transfer Rate: " + dataTransferRateGbps + " Gbps");
        System.out.println("Number of Pins: " + numberOfPins);
        System.out.println("Maximum Current: " + maximumCurrentAmps + " Amps");

        System.out.println("Connectivity Technology: " + connectivityTechnology);
        System.out.println("Specification Met: " + specificationMet);
        System.out.println("Usage: " + usage);

        System.out.println("Unit Count: " + unitCount);
        System.out.println("Item Weight: " + itemWeightGrams + " grams");
        System.out.println("Number Of Items: " + numberOfItems);
    }
}