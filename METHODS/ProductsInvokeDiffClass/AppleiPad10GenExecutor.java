class AppleiPad10GenExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = AppleiPad10Gen.getProductName();
        System.out.println("Product Name: " + name);

        String brand = AppleiPad10Gen.getBrand();
        System.out.println("Brand: " + brand);

        double price = AppleiPad10Gen.getPrice();
        System.out.println("Price: ₹" + price);

        String color = AppleiPad10Gen.getColor();
        System.out.println("Color: " + color);

        String display = AppleiPad10Gen.getDisplay();
        System.out.println("Display: " + display);

        String processor = AppleiPad10Gen.getProcessor();
        System.out.println("Processor: " + processor);

        String storage = AppleiPad10Gen.getStorage();
        System.out.println("Storage: " + storage);

        String camera = AppleiPad10Gen.getCamera();
        System.out.println("Camera: " + camera);

        String connectivity = AppleiPad10Gen.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = AppleiPad10Gen.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String os = AppleiPad10Gen.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String warranty = AppleiPad10Gen.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}