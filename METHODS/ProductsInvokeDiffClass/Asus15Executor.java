class Asus15Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = Asus15.getProductName();
        System.out.println("Product Name: " + name);

        String brand = Asus15.getBrand();
        System.out.println("Brand: " + brand);

        double price = Asus15.getPrice();
        System.out.println("Price: ₹" + price);

        String color = Asus15.getColor();
        System.out.println("Color: " + color);

        String processor = Asus15.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = Asus15.getRAM();
        System.out.println("RAM: " + ram);

        String storage = Asus15.getStorage();
        System.out.println("Storage: " + storage);

        String graphics = Asus15.getGraphics();
        System.out.println("Graphics: " + graphics);

        String display = Asus15.getDisplay();
        System.out.println("Display: " + display);

        String keyboard = Asus15.getKeyboard();
        System.out.println("Keyboard: " + keyboard);

        String os = Asus15.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String warranty = Asus15.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}