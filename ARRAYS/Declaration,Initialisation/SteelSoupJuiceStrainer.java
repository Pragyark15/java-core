class SteelSoupJuiceStrainer {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String itemTypeName;
    static String material;
    static String colour;
    static String style;

    static int manufactureYear;
    static String countryOfOrigin;
    static String includedComponents;
    static boolean dishwasherSafe;

    static String packerAddress;
    static int unitCount;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Kanshita's Rasioware";
        itemTypeName = "Soup Strainer";
        material = "Stainless Steel";
        colour = "Silver";
        style = "Close Mesh";

        manufactureYear = 2025;
        countryOfOrigin = "India";
        includedComponents = "Steel Soup & Juice Strainer";
        dishwasherSafe = true;

        packerAddress = "JPS Enterprises, Mangolpuri Industrial Area, Phase II, New Delhi - 110034, India";
        unitCount = 1;
        asin = "B07MQ8LM29";
        rating = 4.4;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Item Type Name: " + itemTypeName);
        System.out.println("Material: " + material);
        System.out.println("Colour: " + colour);
        System.out.println("Style: " + style);

        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Dishwasher Safe: " + dishwasherSafe);

        System.out.println("Packer Address: " + packerAddress);
        System.out.println("Unit Count: " + unitCount);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}