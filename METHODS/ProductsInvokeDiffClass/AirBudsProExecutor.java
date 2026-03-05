class AirBudsProExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String productName = AirBudsPro.getProductName();
        System.out.println("Product Name: " + productName);

        String brand = AirBudsPro.getBrand();
        System.out.println("Brand: " + brand);

        double price = AirBudsPro.getPrice();
        System.out.println("Price: ₹" + price);

        String color = AirBudsPro.getColor();
        System.out.println("Color: " + color);

        String connectivity = AirBudsPro.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = AirBudsPro.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String charging = AirBudsPro.getChargingType();
        System.out.println("Charging Type: " + charging);

        String noise = AirBudsPro.getNoiseControl();
        System.out.println("Noise Control: " + noise);

        String water = AirBudsPro.getWaterResistance();
        System.out.println("Water Resistance: " + water);

        String warranty = AirBudsPro.getWarranty();
        System.out.println("Warranty: " + warranty);

        double weight = AirBudsPro.getWeight();
        System.out.println("Weight (per earbud): " + weight + " grams");

        System.out.println("Main ended");
    }
}