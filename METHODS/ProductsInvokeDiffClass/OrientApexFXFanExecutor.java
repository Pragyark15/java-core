class OrientApexFXFanExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = OrientApexFXFan.getProductName();
        System.out.println("Product Name: " + name);

        String brand = OrientApexFXFan.getBrand();
        System.out.println("Brand: " + brand);

        double price = OrientApexFXFan.getPrice();
        System.out.println("Price: ₹" + price);

        String color = OrientApexFXFan.getColor();
        System.out.println("Color: " + color);

        String sweep = OrientApexFXFan.getSweepSize();
        System.out.println("Sweep Size: " + sweep);

        String motor = OrientApexFXFan.getMotorType();
        System.out.println("Motor Type: " + motor);

        String speed = OrientApexFXFan.getSpeed();
        System.out.println("Speed: " + speed);

        String air = OrientApexFXFan.getAirDelivery();
        System.out.println("Air Delivery: " + air);

        String blade = OrientApexFXFan.getBladeMaterial();
        System.out.println("Blade Material: " + blade);

        String power = OrientApexFXFan.getPowerConsumption();
        System.out.println("Power Consumption: " + power);

        String warranty = OrientApexFXFan.getWarranty();
        System.out.println("Warranty: " + warranty);

        String feature = OrientApexFXFan.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        System.out.println("Main ended");
    }
}