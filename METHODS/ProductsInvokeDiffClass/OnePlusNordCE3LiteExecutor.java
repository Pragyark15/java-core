class OnePlusNordCE3LiteExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = OnePlusNordCE3Lite.getProductName();
        System.out.println("Product Name: " + name);

        String brand = OnePlusNordCE3Lite.getBrand();
        System.out.println("Brand: " + brand);

        double price = OnePlusNordCE3Lite.getPrice();
        System.out.println("Price: ₹" + price);

        String color = OnePlusNordCE3Lite.getColor();
        System.out.println("Color: " + color);

        String display = OnePlusNordCE3Lite.getDisplay();
        System.out.println("Display: " + display);

        String processor = OnePlusNordCE3Lite.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = OnePlusNordCE3Lite.getRAM();
        System.out.println("RAM: " + ram);

        String storage = OnePlusNordCE3Lite.getStorage();
        System.out.println("Storage: " + storage);

        String camera = OnePlusNordCE3Lite.getCamera();
        System.out.println("Camera: " + camera);

        String battery = OnePlusNordCE3Lite.getBattery();
        System.out.println("Battery: " + battery);

        String os = OnePlusNordCE3Lite.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String warranty = OnePlusNordCE3Lite.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}