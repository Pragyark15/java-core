class PrestigeMixerGrinderExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = PrestigeMixerGrinder.getProductName();
        System.out.println("Product Name: " + name);

        String brand = PrestigeMixerGrinder.getBrand();
        System.out.println("Brand: " + brand);

        double price = PrestigeMixerGrinder.getPrice();
        System.out.println("Price: ₹" + price);

        String color = PrestigeMixerGrinder.getColor();
        System.out.println("Color: " + color);

        String power = PrestigeMixerGrinder.getPower();
        System.out.println("Power: " + power);

        String jars = PrestigeMixerGrinder.getNumberOfJars();
        System.out.println("Number of Jars: " + jars);

        String capacity = PrestigeMixerGrinder.getJarCapacity();
        System.out.println("Jar Capacity: " + capacity);

        String blade = PrestigeMixerGrinder.getBladeType();
        System.out.println("Blade Type: " + blade);

        String speed = PrestigeMixerGrinder.getSpeedControl();
        System.out.println("Speed Control: " + speed);

        String safety = PrestigeMixerGrinder.getSafetyFeature();
        System.out.println("Safety Feature: " + safety);

        String material = PrestigeMixerGrinder.getBodyMaterial();
        System.out.println("Body Material: " + material);

        String warranty = PrestigeMixerGrinder.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}