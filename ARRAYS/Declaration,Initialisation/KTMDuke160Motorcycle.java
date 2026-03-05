class KTMDuke160Motorcycle {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String model;
    static String colour;
    static String vehicleType;
    static String countryOfOrigin;

    static double engineDisplacement;
    static int maxPowerPS;
    static int maxPowerRPM;
    static double torqueNM;
    static int torqueRPM;

    static double lengthMeters;
    static double widthMeters;
    static double heightMeters;
    static int fuelTankCapacityLitres;
    static int weightKg;

    static String specialFeatures;
    static String manufacturerAddress;
    static String asin;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "KTM";
        model = "Duke 160";
        colour = "Atlantic Blue";
        vehicleType = "Petrol Bike";
        countryOfOrigin = "India";

        engineDisplacement = 164.2;
        maxPowerPS = 19;
        maxPowerRPM = 9500;
        torqueNM = 15.5;
        torqueRPM = 7500;

        lengthMeters = 2.01;
        widthMeters = 0.77;
        heightMeters = 1.11;
        fuelTankCapacityLitres = 13;
        weightKg = 159;

        specialFeatures = "LCD speedometer, 6-speed manual transmission, liquid-cooled engine";
        manufacturerAddress = "KTM India Manufacturing Unit";
        asin = "B0FND45DX6";
        rating = 4.5;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Engine Displacement: " + engineDisplacement + " cc");
        System.out.println("Max Power: " + maxPowerPS + " PS @ " + maxPowerRPM + " RPM");
        System.out.println("Torque: " + torqueNM + " Nm @ " + torqueRPM + " RPM");

        System.out.println("Length: " + lengthMeters + " meters");
        System.out.println("Width: " + widthMeters + " meters");
        System.out.println("Height: " + heightMeters + " meters");
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacityLitres + " Litres");
        System.out.println("Weight: " + weightKg + " kg");

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating + " out of 5");
    }
}