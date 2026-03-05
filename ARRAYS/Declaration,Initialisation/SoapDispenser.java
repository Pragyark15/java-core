class SoapDispenser {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String itemType;
    static String colour;
    static String shape;

    static int numberOfSets;
    static String countryOfOrigin;
    static int itemHeightMM;
    static int itemWeightGrams;

    static String importer;
    static String manufacturerAddress;

    static int unitCount;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "SWAPKART";
        itemType = "Soap Dispenser";
        colour = "White";
        shape = "Rectangular";

        numberOfSets = 1;
        countryOfOrigin = "India";
        itemHeightMM = 50;
        itemWeightGrams = 100;

        importer = "Oxygen Enterprise";
        manufacturerAddress = "Oxygen Enterprise, India";

        unitCount = 1;
        asin = "B0F9FQXX9W";
        rating = 4.1;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Colour: " + colour);
        System.out.println("Shape: " + shape);

        System.out.println("Number Of Sets: " + numberOfSets);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Item Height: " + itemHeightMM + " mm");
        System.out.println("Item Weight: " + itemWeightGrams + " grams");

        System.out.println("Importer: " + importer);
        System.out.println("Manufacturer Address: " + manufacturerAddress);

        System.out.println("Unit Count: " + unitCount);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}