class Redmi12Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = Redmi12.getProductName();
        System.out.println("Product Name: " + name);

        String brand = Redmi12.getBrand();
        System.out.println("Brand: " + brand);

        double price = Redmi12.getPrice();
        System.out.println("Price: ₹" + price);

        String color = Redmi12.getColor();
        System.out.println("Color: " + color);

        String display = Redmi12.getDisplay();
        System.out.println("Display: " + display);

        String processor = Redmi12.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = Redmi12.getRAM();
        System.out.println("RAM: " + ram);

        String storage = Redmi12.getStorage();
        System.out.println("Storage: " + storage);

        String camera = Redmi12.getCamera();
        System.out.println("Camera: " + camera);

        String battery = Redmi12.getBattery();
        System.out.println("Battery: " + battery);

        String os = Redmi12.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String warranty = Redmi12.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}