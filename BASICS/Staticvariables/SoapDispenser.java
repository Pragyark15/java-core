class SoapDispenser {

    // Static variable declaration & initialization
    static String brandName = "SWAPKART";
    static String itemType = "Soap Dispenser";
    static String colour = "White";
    static String shape = "Rectangular";

    static int numberOfSets = 1;
    static String countryOfOrigin = "India";
    static int itemHeightMM = 50;
    static int itemWeightGrams = 100;

    static String importer = "Oxygen Enterprise";
    static String manufacturerAddress = "Oxygen Enterprise, India";

    static int unitCount = 1;
    static String asin = "B0F9FQXX9W";
    static double rating = 4.1;

    public static void main(String[] args) {

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