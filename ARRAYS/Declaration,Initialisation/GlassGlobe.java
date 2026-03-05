class GlassGlobe {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String itemType;
    static String colour;
    static String mapType;
    static String baseMaterial;
    static String finishType;
    static String size;

    static int itemWeightGrams;
    static int unitCount;

    static String manufacturerAddress;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "GLOBE DADDY";
        itemType = "Crystal Glass Globe";
        colour = "Crystal Gold";
        mapType = "World Map";
        baseMaterial = "Metal";
        finishType = "Glass";
        size = "50 mm";

        itemWeightGrams = 350;
        unitCount = 1;

        manufacturerAddress = "Globe Daddy Decorative Products Manufacturer";
        asin = "B0CVS6Y4B7";
        rating = 3.6;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Colour: " + colour);
        System.out.println("Map Type: " + mapType);
        System.out.println("Base Material: " + baseMaterial);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Size: " + size);
        System.out.println("Item Weight: " + itemWeightGrams + " grams");
        System.out.println("Unit Count: " + unitCount);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}