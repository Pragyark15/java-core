class KTMDuke160Motorcycle {

    // Static variable declaration & initialization
    static String brand = "KTM";
    static String model = "Duke 160";
    static String colour = "Atlantic Blue";
    static String vehicleType = "Petrol Bike";
    static String countryOfOrigin = "India";

    static double engineDisplacement = 164.2;
    static int maxPowerPS = 19;
    static int maxPowerRPM = 9500;
    static double torqueNM = 15.5;
    static int torqueRPM = 7500;

    static double lengthMeters = 2.01;
    static double widthMeters = 0.77;
    static double heightMeters = 1.11;
    static int fuelTankCapacityLitres = 13;
    static int weightKg = 159;

    static String specialFeatures =
            "LCD speedometer, 6-speed manual transmission, liquid-cooled engine";

    static String manufacturerAddress =
            "KTM India Manufacturing Unit";

    static String asin = "B0FND45DX6";
    static double rating = 4.5;

    public static void main(String[] args) {

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