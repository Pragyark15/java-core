class PhilipsAirFryerExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = PhilipsAirFryer.getProductName();
        System.out.println("Product Name: " + name);

        String brand = PhilipsAirFryer.getBrand();
        System.out.println("Brand: " + brand);

        double price = PhilipsAirFryer.getPrice();
        System.out.println("Price: ₹" + price);

        String color = PhilipsAirFryer.getColor();
        System.out.println("Color: " + color);

        String capacity = PhilipsAirFryer.getCapacity();
        System.out.println("Capacity: " + capacity);

        String power = PhilipsAirFryer.getPower();
        System.out.println("Power: " + power);

        String tech = PhilipsAirFryer.getTechnology();
        System.out.println("Technology: " + tech);

        String temp = PhilipsAirFryer.getTemperatureControl();
        System.out.println("Temperature Control: " + temp);

        String timer = PhilipsAirFryer.getTimer();
        System.out.println("Timer: " + timer);

        String material = PhilipsAirFryer.getBodyMaterial();
        System.out.println("Body Material: " + material);

        String dish = PhilipsAirFryer.getDishwasherSafe();
        System.out.println("Dishwasher Safe: " + dish);

        String warranty = PhilipsAirFryer.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}