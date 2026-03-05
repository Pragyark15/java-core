class DellInspironExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = DellInspiron.getProductName();
        System.out.println("Product Name: " + name);

        String brand = DellInspiron.getBrand();
        System.out.println("Brand: " + brand);

        double price = DellInspiron.getPrice();
        System.out.println("Price: ₹" + price);

        String color = DellInspiron.getColor();
        System.out.println("Color: " + color);

        String processor = DellInspiron.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = DellInspiron.getRAM();
        System.out.println("RAM: " + ram);

        String storage = DellInspiron.getStorage();
        System.out.println("Storage: " + storage);

        String display = DellInspiron.getDisplay();
        System.out.println("Display: " + display);

        String graphics = DellInspiron.getGraphics();
        System.out.println("Graphics: " + graphics);

        String os = DellInspiron.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String weight = DellInspiron.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = DellInspiron.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}