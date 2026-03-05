
class LenovoTabExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = LenovoTab.getProductName();
        System.out.println("Product Name: " + name);

        String brand = LenovoTab.getBrand();
        System.out.println("Brand: " + brand);

        double price = LenovoTab.getPrice();
        System.out.println("Price: ₹" + price);

        String color = LenovoTab.getColor();
        System.out.println("Color: " + color);

        String display = LenovoTab.getDisplay();
        System.out.println("Display: " + display);

        String processor = LenovoTab.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = LenovoTab.getRAM();
        System.out.println("RAM: " + ram);

        String storage = LenovoTab.getStorage();
        System.out.println("Storage: " + storage);

        String camera = LenovoTab.getCamera();
        System.out.println("Camera: " + camera);

        String battery = LenovoTab.getBattery();
        System.out.println("Battery: " + battery);

        String os = LenovoTab.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String warranty = LenovoTab.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}