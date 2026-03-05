class Backpack {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String colour;
    static String material;

    static int capacityLitres;
    static int numberOfCompartments;
    static boolean waterResistant;

    static boolean laptopCompartment;
    static String strapType;
    static String closureType;

    static String suitableFor;
    static double weightKg;

    static String warranty;
    static String countryOfOrigin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Skybags";
        model = "Casual Daypack";
        colour = "Blue";
        material = "Polyester";

        capacityLitres = 30;
        numberOfCompartments = 3;
        waterResistant = true;

        laptopCompartment = true;
        strapType = "Adjustable Shoulder Strap";
        closureType = "Zipper";

        suitableFor = "College & Travel";
        weightKg = 0.7;

        warranty = "1 Year Warranty";
        countryOfOrigin = "India";
        rating = 4.4;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Material: " + material);

        System.out.println("Capacity: " + capacityLitres + " Litres");
        System.out.println("Number Of Compartments: " + numberOfCompartments);
        System.out.println("Water Resistant: " + waterResistant);

        System.out.println("Laptop Compartment: " + laptopCompartment);
        System.out.println("Strap Type: " + strapType);
        System.out.println("Closure Type: " + closureType);

        System.out.println("Suitable For: " + suitableFor);
        System.out.println("Weight: " + weightKg + " kg");

        System.out.println("Warranty: " + warranty);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}