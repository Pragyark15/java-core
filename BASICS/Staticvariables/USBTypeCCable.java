class USBTypeCCable {

    // Static variable declaration & initialization
    static String brandName = "Ambrane";
    static String connectorType = "USB Type C";
    static String cableType = "USB";
    static String compatibleDevices =
            "Tablet, Laptop, Smartphone, Headphones, Charging Adapter, Android";
    static String specialFeatures =
            "Fast Charging, Tangle Free, Data Transfer, Data Sync, Flexible, Braided, Durable";

    static String compatiblePhoneModels = "All Smartphones";
    static String connectorGender = "Male to Male";
    static double dataTransferRateGbps = 0.48;
    static int numberOfPins = 24;
    static int maximumCurrentAmps = 3;

    static String connectivityTechnology = "USB";
    static String specificationMet = "Qualcomm";
    static String usage = "Indoor";

    static int unitCount = 2;
    static int itemWeightGrams = 140;
    static int numberOfItems = 2;

    public static void main(String[] args) {

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