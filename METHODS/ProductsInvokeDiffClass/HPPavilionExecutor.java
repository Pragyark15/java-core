class HPPavilionExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = HPPavilion.getProductName();
        System.out.println("Product Name: " + name);

        String brand = HPPavilion.getBrand();
        System.out.println("Brand: " + brand);

        double price = HPPavilion.getPrice();
        System.out.println("Price: ₹" + price);

        String color = HPPavilion.getColor();
        System.out.println("Color: " + color);

        String processor = HPPavilion.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = HPPavilion.getRAM();
        System.out.println("RAM: " + ram);

        String storage = HPPavilion.getStorage();
        System.out.println("Storage: " + storage);

        String display = HPPavilion.getDisplay();
        System.out.println("Display: " + display);

        String graphics = HPPavilion.getGraphics();
        System.out.println("Graphics: " + graphics);

        String os = HPPavilion.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String weight = HPPavilion.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = HPPavilion.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}