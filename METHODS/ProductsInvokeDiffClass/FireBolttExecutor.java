class FireBolttExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = FireBoltt.getProductName();
        System.out.println("Product Name: " + name);

        String brand = FireBoltt.getBrand();
        System.out.println("Brand: " + brand);

        double price = FireBoltt.getPrice();
        System.out.println("Price: ₹" + price);

        String color = FireBoltt.getColor();
        System.out.println("Color: " + color);

        String display = FireBoltt.getDisplay();
        System.out.println("Display: " + display);

        String calling = FireBoltt.getBluetoothCalling();
        System.out.println("Bluetooth Calling: " + calling);

        String battery = FireBoltt.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String health = FireBoltt.getHealthTracking();
        System.out.println("Health Tracking: " + health);

        String sports = FireBoltt.getSportsModes();
        System.out.println("Sports Modes: " + sports);

        String water = FireBoltt.getWaterResistance();
        System.out.println("Water Resistance: " + water);

        String compatibility = FireBoltt.getCompatibility();
        System.out.println("Compatibility: " + compatibility);

        String warranty = FireBoltt.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}