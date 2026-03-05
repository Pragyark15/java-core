class SamsungWashingMachineExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = SamsungWashingMachine.getProductName();
        System.out.println("Product Name: " + name);

        String brand = SamsungWashingMachine.getBrand();
        System.out.println("Brand: " + brand);

        double price = SamsungWashingMachine.getPrice();
        System.out.println("Price: ₹" + price);

        String color = SamsungWashingMachine.getColor();
        System.out.println("Color: " + color);

        String capacity = SamsungWashingMachine.getCapacity();
        System.out.println("Capacity: " + capacity);

        String load = SamsungWashingMachine.getLoadingType();
        System.out.println("Loading Type: " + load);

        String rating = SamsungWashingMachine.getEnergyRating();
        System.out.println("Energy Rating: " + rating);

        String programs = SamsungWashingMachine.getWashPrograms();
        System.out.println("Wash Programs: " + programs);

        String motor = SamsungWashingMachine.getMotorType();
        System.out.println("Motor Type: " + motor);

        String water = SamsungWashingMachine.getWaterLevel();
        System.out.println("Water Level: " + water);

        String feature = SamsungWashingMachine.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        String warranty = SamsungWashingMachine.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}