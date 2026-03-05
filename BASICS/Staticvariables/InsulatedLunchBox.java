class InsulatedLunchBox {

    // Static variable declaration & initialization
    static String brand = "daiDokoro";
    static String itemTypeName = "Lunch Boxes";
    static String ageRange = "Adult";
    static String colour = "Berry Blue";

    static String theme = "Sport";
    static String pattern = "Solid";
    static String style = "Modern";
    static String shape = "Round";
    static String itemForm = "Box";

    static String countryOfOrigin = "China";
    static long upc = 700512758085L;

    static String includedComponents =
            "1 Cutlery Set, 1 Thermal Insulated Bag, 4 Lunch Box Container";

    static String manufacturerAddress =
            "The D7 Store, Brand Name: daiDokoro, A404, Indraprastha Apt, "
          + "Behind Ayyappa Temple, Baba Sitarm Marg, Mira Road (East), "
          + "Thane - 401107, India.";

    static String asin = "B0CXY9W4KT";
    static double rating = 3.8;

    public static void main(String[] args) {

        System.out.println("Brand: " + brand);
        System.out.println("Item Type Name: " + itemTypeName);
        System.out.println("Age Range: " + ageRange);
        System.out.println("Colour: " + colour);

        System.out.println("Theme: " + theme);
        System.out.println("Pattern: " + pattern);
        System.out.println("Style: " + style);
        System.out.println("Shape: " + shape);
        System.out.println("Item Form: " + itemForm);

        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("UPC: " + upc);
        System.out.println("Included Components: " + includedComponents);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}