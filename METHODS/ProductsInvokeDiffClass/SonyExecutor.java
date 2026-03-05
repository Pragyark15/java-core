class SonyExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = Sony.getProductName();
        System.out.println("Product Name: " + name);

        String brand = Sony.getBrand();
        System.out.println("Brand: " + brand);

        double price = Sony.getPrice();
        System.out.println("Price: ₹" + price);

        String color = Sony.getColor();
        System.out.println("Color: " + color);

        String connectivity = Sony.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = Sony.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String charging = Sony.getChargingTime();
        System.out.println("Charging Time: " + charging);

        String noise = Sony.getNoiseCancellation();
        System.out.println("Noise Cancellation: " + noise);

        String driver = Sony.getDriverSize();
        System.out.println("Driver Size: " + driver);

        String weight = Sony.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = Sony.getWarranty();
        System.out.println("Warranty: " + warranty);

        String feature = Sony.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        System.out.println("Main ended");
    }
}