class WardrobeFreshener {

    // Static variable declaration & initialization
    static String brandName = "Desam Organics";
    static String itemType = "Wardrobe Freshener";
    static String scent = "Patchouli";
    static String includedComponents =
            "Wax Bar, Wardrobe Freshener, Cupboard Freshener in Budget";
    static String countryOfOrigin = "India";
    static String manufacturer = "Desam Organics";

    static int unitWeightGrams = 100;
    static int itemWeightGrams = 80;

    static String manufacturerAddress =
            "Desam Organics Manufacturer, India";

    static String asin = "B09T3DJLRG";
    static double rating = 3.7;

    public static void main(String[] args) {

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