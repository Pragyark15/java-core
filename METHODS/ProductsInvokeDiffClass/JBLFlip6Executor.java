class JBLFlip6Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = JBLFlip6.getProductName();
        System.out.println("Product Name: " + name);

        String brand = JBLFlip6.getBrand();
        System.out.println("Brand: " + brand);

        double price = JBLFlip6.getPrice();
        System.out.println("Price: ₹" + price);

        String color = JBLFlip6.getColor();
        System.out.println("Color: " + color);

        String connectivity = JBLFlip6.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = JBLFlip6.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String charging = JBLFlip6.getChargingTime();
        System.out.println("Charging Time: " + charging);

        String water = JBLFlip6.getWaterResistance();
        System.out.println("Water Resistance: " + water);

        String power = JBLFlip6.getOutputPower();
        System.out.println("Output Power: " + power);

        String freq = JBLFlip6.getFrequencyResponse();
        System.out.println("Frequency Response: " + freq);

        String weight = JBLFlip6.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = JBLFlip6.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}