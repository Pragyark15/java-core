class PandaCoffeeMug {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String recommendedUses;
    static String includedComponents;
    static String specificUses;
    static String countryOfOrigin;
    static String packageType;
    static String manufacturer;
    static int manufactureYear;
    static String itemTypeName;
    static String manufacturerAddress;

    static String colour;
    static String productStyle;
    static String theme;
    static String occasion;
    static String shape;
    static String pattern;
    static String character;

    static boolean dishwasherSafe;
    static boolean microwaveSafe;

    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Vasukie";
        recommendedUses = "Home, Office";
        includedComponents = "Lid, Straw";
        specificUses = "Cold Drinks, Hot Drinks";
        countryOfOrigin = "China";
        packageType = "Box Packing";
        manufacturer = "Vasukie";
        manufactureYear = 2025;
        itemTypeName = "Coffee Mug";

        manufacturerAddress = "Vasukie Manufacturer Address, China";

        colour = "Panda Mug";
        productStyle = "Antique";
        theme = "Cartoon";
        occasion = "Birthday, Christmas, Friendship Day, Thanksgiving, Valentine's Day";
        shape = "Round";
        pattern = "Cartoon";
        character = "Panda";

        dishwasherSafe = true;
        microwaveSafe = true;

        asin = "B0DTKKJZX1";
        rating = 4.4;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Recommended Uses: " + recommendedUses);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Specific Uses: " + specificUses);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Package Type: " + packageType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Item Type Name: " + itemTypeName);
        System.out.println("Manufacturer Address: " + manufacturerAddress);

        System.out.println("Colour: " + colour);
        System.out.println("Product Style: " + productStyle);
        System.out.println("Theme: " + theme);
        System.out.println("Occasion: " + occasion);
        System.out.println("Shape: " + shape);
        System.out.println("Pattern: " + pattern);
        System.out.println("Character: " + character);

        System.out.println("Dishwasher Safe: " + dishwasherSafe);
        System.out.println("Microwave Safe: " + microwaveSafe);

        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}