class PowerBank {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String modelName;
    static String modelNumber;
    static String itemType;

    static int batteryCapacitymAh;
    static String connectorType;
    static int numberOfPorts;
    static String powerSource;

    static String specialFeatures;
    static String compatibleDevices;
    static String countryOfOrigin;
    static String boxContents;

    static String manufacturerAddress;
    static String warranty;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "Portronics";
        modelName = "Power Shutter";
        modelNumber = "POR-2265";
        itemType = "Power Bank";

        batteryCapacitymAh = 10000;
        connectorType = "USB Type C";
        numberOfPorts = 1;
        powerSource = "Type C";

        specialFeatures = "22.5W PD Output, Digital Display, In-Built Type C & 8 Pin Cable, Wireless Charging";
        compatibleDevices = "Smartphone";
        countryOfOrigin = "India";
        boxContents = "1 Powerbank, 1 Documentation, 1 Charging Cable";

        manufacturerAddress = "Portronics Digital Pvt. Ltd., First Floor, Property No D 8 Upper Basement, Sector 8, Noida, Uttar Pradesh 201301";
        warranty = "1 Year";
        asin = "B0DKXPL1HS";
        rating = 4.0;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Item Type: " + itemType);

        System.out.println("Battery Capacity: " + batteryCapacitymAh + " mAh");
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Number Of Ports: " + numberOfPorts);
        System.out.println("Power Source: " + powerSource);

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Box Contents: " + boxContents);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Warranty: " + warranty);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}