class Laptop {

    static String brandName = "Dell";
    static String modelName = "XPS 15";
    static String itemType = "Laptop";
    static String processor = "Intel i7";
    static int ramGB = 16;
    static int storageGB = 512;
    static String specialFeatures = "Touchscreen, Backlit Keyboard";
    static String material = "Aluminum";
    static String countryOfOrigin = "China";
    static String includedComponents = "Laptop, Charger";
    static int unitCount = 1;
    static String asin = "B0DELLXPS15";
    static double customerRating = 4.5;

    public static void main(String[] args) {

        String brandName = "HP";
        String modelName = "Spectre x360";
        String itemType = "Laptop";
        String processor = "Intel i7";
        int ramGB = 16;
        int storageGB = 512;
        String specialFeatures = "Convertible, Touchscreen";
        String material = "Aluminum";
        String countryOfOrigin = "USA";
        String includedComponents = "Laptop, Charger";
        int unitCount = 1;
        String asin = "B0HPSPECTRE";
        double customerRating = 4.6;

        System.out.println("Brand Name: " + brandName);
        System.out.println("Brand Name: " + Laptop.brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Name: " + Laptop.modelName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Item Type: " + Laptop.itemType);
        System.out.println("Processor: " + processor);
        System.out.println("Processor: " + Laptop.processor);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("RAM: " + Laptop.ramGB + " GB");
        System.out.println("Storage: " + storageGB + " GB");
        System.out.println("Storage: " + Laptop.storageGB + " GB");
        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Special Features: " + Laptop.specialFeatures);
        System.out.println("Material: " + material);
        System.out.println("Material: " + Laptop.material);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Country Of Origin: " + Laptop.countryOfOrigin);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Included Components: " + Laptop.includedComponents);
        System.out.println("Unit Count: " + unitCount);
        System.out.println("Unit Count: " + Laptop.unitCount);
        System.out.println("ASIN: " + asin);
        System.out.println("ASIN: " + Laptop.asin);
        System.out.println("Customer Rating: " + customerRating + " out of 5");
        System.out.println("Customer Rating: " + Laptop.customerRating + " out of 5");
    }
}
