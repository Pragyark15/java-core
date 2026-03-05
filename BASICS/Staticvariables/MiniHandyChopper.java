class MiniHandyChopper {

    // Static variable declaration & initialization
    static String brandName = "Pigeon";
    static String itemTypeName = "Pigeon Mini Handy Chopper";
    static String recommendedUse = "Chop";
    static String colour = "Green";

    static String bladeMaterial = "Stainless Steel";
    static String enclosureMaterial = "Polypropylene";
    static String bladeShape = "Round";
    static String productCareInstructions = "Hand Wash Only";

    static String includedComponents = "1-Piece Handy Chopper";
    static String countryOfOrigin = "India";

    static String manufacturerAddress =
            "Stovekraft Limited, 81/1 Harohalli Industrial Area, Kanakapura Taluk, "
          + "Bangalore Kanakapura, Bengaluru, Karnataka 562112. "
          + "For any issues contact 080 26985800 or WhatsApp +91 63649 14202 "
          + "or mail to customercare@stovekraft.com";

    static int unitCount = 1;
    static String warrantyDescription = "30 days manufacturer's warranty";
    static String asin = "B01LWYDEQ7";
    static double rating = 3.9;

    public static void main(String[] args) {

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