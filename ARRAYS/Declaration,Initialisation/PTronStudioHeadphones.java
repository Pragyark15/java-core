class PTronStudioHeadphones {

    // ===== DECLARATION ONLY =====
    static String brandName;
    static String modelNumber;
    static String modelName;
    static String boxContents;
    static String ageRange;
    static String countryOfOrigin;
    static String packageType;
    static int numberOfItems;
    static boolean isAutographed;
    static String manufacturerAddress;
    static String itemType;
    static String colour;
    static String controlMethod;
    static int batteryChargeTime;
    static int batteryLife;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brandName = "pTron";
        modelNumber = "Studio";
        modelName = "Studio";
        boxContents = "Cable, User Manual";
        ageRange = "Adult";
        countryOfOrigin = "China";
        packageType = "Standard Packaging";
        numberOfItems = 4;
        isAutographed = false;

        manufacturerAddress = "Building A1, Red Box Creative Park, No.3 Huancheng South Road, Bantian Street, Longgang District, Shenzhen City, China 518116";

        itemType = "Wireless Headphones";
        colour = "Beige";
        controlMethod = "Push Button, Voice";
        batteryChargeTime = 2;
        batteryLife = 70;
        asin = "B0FGTZ19JS";
        rating = 4.1;

        // ===== PRINT =====
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Name: " + modelName);
        System.out.println("Box Contents: " + boxContents);
        System.out.println("Age Range: " + ageRange);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Package Type: " + packageType);
        System.out.println("Number Of Items: " + numberOfItems);
        System.out.println("Is Autographed: " + isAutographed);
        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Item Type: " + itemType);
        System.out.println("Colour: " + colour);
        System.out.println("Control Method: " + controlMethod);
        System.out.println("Battery Charge Time: " + batteryChargeTime + " Hours");
        System.out.println("Battery Life: " + batteryLife + " Hours");
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}