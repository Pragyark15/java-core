class MiniHandyChopper {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String itemTypeName;
    static String recommendedUse;
    static String colour;

    static String bladeMaterial;
    static String enclosureMaterial;
    static String bladeShape;
    static String productCareInstructions;

    static String includedComponents;
    static String countryOfOrigin;

    static String manufacturerAddress;
    static int unitCount;
    static String warrantyDescription;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "Pigeon";
        itemTypeName = "Pigeon Mini Handy Chopper";
        recommendedUse = "Chop";
        colour = "Green";

        bladeMaterial = "Stainless Steel";
        enclosureMaterial = "Polypropylene";
        bladeShape = "Round";
        productCareInstructions = "Hand Wash Only";

        includedComponents = "1-Piece Handy Chopper";
        countryOfOrigin = "India";

        manufacturerAddress = "Stovekraft Limited, 81/1 Harohalli Industrial Area, Kanakapura Taluk, Bangalore Kanakapura, Bengaluru, Karnataka 562112. For any issues contact 080 26985800 or WhatsApp +91 63649 14202 or mail to customercare@stovekraft.com";
        unitCount = 1;
        warrantyDescription = "30 days manufacturer's warranty";
        asin = "B01LWYDEQ7";
        rating = 3.9;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type Name: " + itemTypeName);
        System.out.println("Recommended Use: " + recommendedUse);
        System.out.println("Colour: " + colour);

        System.out.println("Blade Material: " + bladeMaterial);
        System.out.println("Enclosure Material: " + enclosureMaterial);
        System.out.println("Blade Shape: " + bladeShape);
        System.out.println("Product Care Instructions: " + productCareInstructions);

        System.out.println("Included Components: " + includedComponents);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Unit Count: " + unitCount);
        System.out.println("Warranty Description: " + warrantyDescription);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}