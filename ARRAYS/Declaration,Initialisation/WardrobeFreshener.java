class WardrobeFreshener {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String itemType;
    static String scent;
    static String includedComponents;
    static String countryOfOrigin;
    static String manufacturer;

    static int unitWeightGrams;
    static int itemWeightGrams;

    static String manufacturerAddress;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "Desam Organics";
        itemType = "Wardrobe Freshener";
        scent = "Patchouli";
        includedComponents = "Wax Bar, Wardrobe Freshener, Cupboard Freshener in Budget";
        countryOfOrigin = "India";
        manufacturer = "Desam Organics";

        unitWeightGrams = 100;
        itemWeightGrams = 80;

        manufacturerAddress = "Desam Organics Manufacturer, India";
        asin = "B09T3DJLRG";
        rating = 3.7;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Scent: " + scent);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Unit Weight: " + unitWeightGrams + " grams");
        System.out.println("Item Weight: " + itemWeightGrams + " grams");

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}