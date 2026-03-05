class InsulatedLunchBox {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String itemTypeName;
    static String ageRange;
    static String colour;

    static String theme;
    static String pattern;
    static String style;
    static String shape;
    static String itemForm;

    static String countryOfOrigin;
    static long upc;

    static String includedComponents;
    static String manufacturerAddress;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "daiDokoro";
        itemTypeName = "Lunch Boxes";
        ageRange = "Adult";
        colour = "Berry Blue";

        theme = "Sport";
        pattern = "Solid";
        style = "Modern";
        shape = "Round";
        itemForm = "Box";

        countryOfOrigin = "China";
        upc = 700512758085L;

        includedComponents = "1 Cutlery Set, 1 Thermal Insulated Bag, 4 Lunch Box Container";
        manufacturerAddress = "The D7 Store, Brand Name: daiDokoro, A404, Indraprastha Apt, Behind Ayyappa Temple, Baba Sitarm Marg, Mira Road (East), Thane - 401107, India.";
        asin = "B0CXY9W4KT";
        rating = 3.8;

        // ===== PRINT =====
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