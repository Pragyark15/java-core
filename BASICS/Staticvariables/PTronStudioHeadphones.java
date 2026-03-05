class PTronStudioHeadphones {

    // Static variable declaration & initialization
    static String brandName = "pTron";
    static String modelNumber = "Studio";
    static String modelName = "Studio";
    static String boxContents = "Cable, User Manual";
    static String ageRange = "Adult";
    static String countryOfOrigin = "China";
    static String packageType = "Standard Packaging";
    static int numberOfItems = 4;
    static boolean isAutographed = false;

    static String manufacturerAddress =
            "Building A1, Red Box Creative Park, No.3 Huancheng South Road, Bantian Street, "
          + "Longgang District, Shenzhen City, China 518116";

    static String itemType = "Wireless Headphones";
    static String colour = "Beige";
    static String controlMethod = "Push Button, Voice";
    static int batteryChargeTime = 2;
    static int batteryLife = 70;
    static String asin = "B0FGTZ19JS";
    static double rating = 4.1;

    public static void main(String[] args) {

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