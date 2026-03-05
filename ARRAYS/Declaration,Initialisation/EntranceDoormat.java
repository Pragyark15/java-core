class EntranceDoormat {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String modelName;
    static String itemType;
    static String weaveType;
    static String constructionType;
    static String usage;

    static boolean stainResistant;
    static String specialFeatures;
    static String waterResistance;
    static String surfaceMaterial;
    static String backMaterial;
    static String careInstructions;
    static String countryOfOrigin;
    static String includedComponents;
    static int unitCount;

    static String manufacturerAddress;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "VIKCLIQUE";
        modelName = "Mandir";
        itemType = "Doormat";
        weaveType = "Flat Woven";
        constructionType = "Machine Made";
        usage = "Indoor and Outdoor";

        stainResistant = true;
        specialFeatures = "Fade Resistant, Non Slip, Stain Resistant, Washable, Waterproof";
        waterResistance = "Water Resistant";
        surfaceMaterial = "Fur";
        backMaterial = "Rubber";
        careInstructions = "Machine Wash";
        countryOfOrigin = "India";
        includedComponents = "1 Doormat";
        unitCount = 1;

        manufacturerAddress = "VIKCLIQUE Home Furnishing Manufacturer, India";
        asin = "B0F88PJMSL";
        rating = 4.2;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Weave Type: " + weaveType);
        System.out.println("Construction Type: " + constructionType);
        System.out.println("Usage: " + usage);

        System.out.println("Stain Resistant: " + stainResistant);
        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Surface Material: " + surfaceMaterial);
        System.out.println("Back Material: " + backMaterial);
        System.out.println("Care Instructions: " + careInstructions);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Unit Count: " + unitCount);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}