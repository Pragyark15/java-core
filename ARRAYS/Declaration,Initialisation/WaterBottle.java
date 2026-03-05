class WaterBottle {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String modelName;
    static int manufactureYear;
    static String itemType;
    static String colour;
    static String shape;
    static String materialType;
    static String careInstructions;

    static int itemWeightGrams;
    static String includedComponents;
    static String manufacturer;
    static String countryOfOrigin;

    static String manufacturerAddress;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "4Mura";
        modelName = "4mu56f";
        manufactureYear = 2024;
        itemType = "Water Bottle";
        colour = "Green";
        shape = "Cylindrical";
        materialType = "Acrylonitrile Butadiene Styrene";
        careInstructions = "Hand Wash Only";

        itemWeightGrams = 499;
        includedComponents = "Water Bottle";
        manufacturer = "4Mura";
        countryOfOrigin = "India";

        manufacturerAddress = "4Mura Manufacturer Address, India";
        asin = "B0F262VBTZ";
        rating = 4.0;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Item Type: " + itemType);
        System.out.println("Colour: " + colour);
        System.out.println("Shape: " + shape);
        System.out.println("Material Type: " + materialType);
        System.out.println("Care Instructions: " + careInstructions);
        System.out.println("Item Weight: " + itemWeightGrams + " grams");
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}