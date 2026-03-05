class RealmeWatch3ProExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = RealmeWatch3Pro.getProductName();
        System.out.println("Product Name: " + name);

        String brand = RealmeWatch3Pro.getBrand();
        System.out.println("Brand: " + brand);

        double price = RealmeWatch3Pro.getPrice();
        System.out.println("Price: ₹" + price);

        String color = RealmeWatch3Pro.getColor();
        System.out.println("Color: " + color);

        String display = RealmeWatch3Pro.getDisplay();
        System.out.println("Display: " + display);

        String connectivity = RealmeWatch3Pro.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = RealmeWatch3Pro.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String gps = RealmeWatch3Pro.getGPS();
        System.out.println("GPS: " + gps);

        String health = RealmeWatch3Pro.getHealthFeatures();
        System.out.println("Health Features: " + health);

        String water = RealmeWatch3Pro.getWaterResistance();
        System.out.println("Water Resistance: " + water);

        String compatibility = RealmeWatch3Pro.getCompatibility();
        System.out.println("Compatibility: " + compatibility);

        String warranty = RealmeWatch3Pro.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}