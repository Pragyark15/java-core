class MiPowerBank3iExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = MiPowerBank3i.getProductName();
        System.out.println("Product Name: " + name);

        String brand = MiPowerBank3i.getBrand();
        System.out.println("Brand: " + brand);

        double price = MiPowerBank3i.getPrice();
        System.out.println("Price: ₹" + price);

        String color = MiPowerBank3i.getColor();
        System.out.println("Color: " + color);

        String capacity = MiPowerBank3i.getCapacity();
        System.out.println("Capacity: " + capacity);

        String output = MiPowerBank3i.getOutputPorts();
        System.out.println("Output Ports: " + output);

        String input = MiPowerBank3i.getInputPort();
        System.out.println("Input Port: " + input);

        String fast = MiPowerBank3i.getFastCharging();
        System.out.println("Fast Charging: " + fast);

        String safety = MiPowerBank3i.getSafetyFeatures();
        System.out.println("Safety Features: " + safety);

        String material = MiPowerBank3i.getBodyMaterial();
        System.out.println("Body Material: " + material);

        String weight = MiPowerBank3i.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = MiPowerBank3i.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}