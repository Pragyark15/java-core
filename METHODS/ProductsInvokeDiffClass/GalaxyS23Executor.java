class GalaxyS23Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = GalaxyS23.getProductName();
        System.out.println("Product Name: " + name);

        String brand = GalaxyS23.getBrand();
        System.out.println("Brand: " + brand);

        double price = GalaxyS23.getPrice();
        System.out.println("Price: ₹" + price);

        String color = GalaxyS23.getColor();
        System.out.println("Color: " + color);

        String display = GalaxyS23.getDisplay();
        System.out.println("Display: " + display);

        String processor = GalaxyS23.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = GalaxyS23.getRAM();
        System.out.println("RAM: " + ram);

        String storage = GalaxyS23.getStorage();
        System.out.println("Storage: " + storage);

        String camera = GalaxyS23.getCamera();
        System.out.println("Camera: " + camera);

        String battery = GalaxyS23.getBattery();
        System.out.println("Battery: " + battery);

        String warranty = GalaxyS23.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}