class LaptopSleeve {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String itemTypeName;
    static String colour;
    static String styleName;

    static String handbagSilhouette;
    static String occasionDescription;
    static String pattern;
    static String itemShape;
    static String ageRangeDescription;

    static String modelName;
    static String countryOfOrigin;
    static int itemWeight;

    static String importerAddress;
    static String includedItems;
    static int unitCount;
    static String warrantyDescription;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Dyazo";
        itemTypeName = "Laptop Sleeve";
        colour = "Grey";
        styleName = "Oxford Fabric 15.6 Inch Grey";

        handbagSilhouette = "Briefcase";
        occasionDescription = "Business";
        pattern = "Solid";
        itemShape = "Rectangular";
        ageRangeDescription = "Adult";

        modelName = "DZ 471";
        countryOfOrigin = "China";
        itemWeight = 190;

        importerAddress = "Alliance Trade Links, 38, 2nd Floor, Dsidc Okhala Phase 1, New Delhi 110048, India";
        includedItems = "Laptop Sleeve";
        unitCount = 1;
        warrantyDescription = "1 Year Warranty";
        asin = "B09BFV96TS";
        rating = 4.3;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Item Type Name: " + itemTypeName);
        System.out.println("Colour: " + colour);
        System.out.println("Style Name: " + styleName);

        System.out.println("Handbag Silhouette: " + handbagSilhouette);
        System.out.println("Occasion Description: " + occasionDescription);
        System.out.println("Pattern: " + pattern);
        System.out.println("Item Shape: " + itemShape);
        System.out.println("Age Range Description: " + ageRangeDescription);

        System.out.println("Model Name: " + modelName);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Item Weight: " + itemWeight + " grams");

        System.out.println("Importer Address: " + importerAddress);
        System.out.println("Included Items: " + includedItems);
        System.out.println("Unit Count: " + unitCount);
        System.out.println("Warranty Description: " + warrantyDescription);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}