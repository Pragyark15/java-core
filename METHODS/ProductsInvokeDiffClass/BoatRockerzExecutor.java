class BoatRockerzExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = BoatRockerz.getProductName();
        System.out.println("Product Name: " + name);

        String brand = BoatRockerz.getBrand();
        System.out.println("Brand: " + brand);

        double price = BoatRockerz.getPrice();
        System.out.println("Price: ₹" + price);

        String color = BoatRockerz.getColor();
        System.out.println("Color: " + color);

        String connectivity = BoatRockerz.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = BoatRockerz.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String charging = BoatRockerz.getChargingTime();
        System.out.println("Charging Time: " + charging);

        String driver = BoatRockerz.getDriverSize();
        System.out.println("Driver Size: " + driver);

        String water = BoatRockerz.getWaterResistance();
        System.out.println("Water Resistance: " + water);

        String weight = BoatRockerz.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = BoatRockerz.getWarranty();
        System.out.println("Warranty: " + warranty);

        String feature = BoatRockerz.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        System.out.println("Main ended");
    }
}