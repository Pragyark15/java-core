class MacBookAirM2Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = MacBookAirM2.getProductName();
        System.out.println("Product Name: " + name);

        String brand = MacBookAirM2.getBrand();
        System.out.println("Brand: " + brand);

        double price = MacBookAirM2.getPrice();
        System.out.println("Price: ₹" + price);

        String color = MacBookAirM2.getColor();
        System.out.println("Color: " + color);

        String processor = MacBookAirM2.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = MacBookAirM2.getRAM();
        System.out.println("RAM: " + ram);

        String storage = MacBookAirM2.getStorage();
        System.out.println("Storage: " + storage);

        String display = MacBookAirM2.getDisplay();
        System.out.println("Display: " + display);

        String battery = MacBookAirM2.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String os = MacBookAirM2.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String weight = MacBookAirM2.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = MacBookAirM2.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}