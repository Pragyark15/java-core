class LogitechMXMaster3SExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = LogitechMXMaster3S.getProductName();
        System.out.println("Product Name: " + name);

        String brand = LogitechMXMaster3S.getBrand();
        System.out.println("Brand: " + brand);

        double price = LogitechMXMaster3S.getPrice();
        System.out.println("Price: ₹" + price);

        String color = LogitechMXMaster3S.getColor();
        System.out.println("Color: " + color);

        String connectivity = LogitechMXMaster3S.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String dpi = LogitechMXMaster3S.getDPI();
        System.out.println("DPI: " + dpi);

        String battery = LogitechMXMaster3S.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String charging = LogitechMXMaster3S.getChargingType();
        System.out.println("Charging Type: " + charging);

        String compatibility = LogitechMXMaster3S.getCompatibility();
        System.out.println("Compatibility: " + compatibility);

        String weight = LogitechMXMaster3S.getWeight();
        System.out.println("Weight: " + weight);

        String feature = LogitechMXMaster3S.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        String warranty = LogitechMXMaster3S.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}