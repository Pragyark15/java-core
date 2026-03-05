class Refrigerator {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String colour;
    static String energyRating;

    static int capacityLitres;
    static boolean inverterCompressor;
    static boolean frostFree;

    static int shelves;
    static int doorBaskets;
    static String coolingTechnology;

    static int voltage;
    static double weightKg;

    static String warranty;
    static String countryOfOrigin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "LG";
        model = "GL-S292RPZX";
        colour = "Shiny Steel";
        energyRating = "3 Star";

        capacityLitres = 260;
        inverterCompressor = true;
        frostFree = true;

        shelves = 3;
        doorBaskets = 4;
        coolingTechnology = "Smart Inverter";

        voltage = 230;
        weightKg = 52.5;

        warranty = "10 Years Compressor Warranty";
        countryOfOrigin = "India";
        rating = 4.4;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Energy Rating: " + energyRating);

        System.out.println("Capacity: " + capacityLitres + " Litres");
        System.out.println("Inverter Compressor: " + inverterCompressor);
        System.out.println("Frost Free: " + frostFree);

        System.out.println("Shelves: " + shelves);
        System.out.println("Door Baskets: " + doorBaskets);
        System.out.println("Cooling Technology: " + coolingTechnology);

        System.out.println("Voltage: " + voltage + " Volts");
        System.out.println("Weight: " + weightKg + " kg");

        System.out.println("Warranty: " + warranty);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}