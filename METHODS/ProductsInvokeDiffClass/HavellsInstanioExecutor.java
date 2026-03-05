class HavellsInstanioExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = HavellsInstanio.getProductName();
        System.out.println("Product Name: " + name);

        String brand = HavellsInstanio.getBrand();
        System.out.println("Brand: " + brand);

        double price = HavellsInstanio.getPrice();
        System.out.println("Price: ₹" + price);

        String color = HavellsInstanio.getColor();
        System.out.println("Color: " + color);

        String capacity = HavellsInstanio.getCapacity();
        System.out.println("Capacity: " + capacity);

        String power = HavellsInstanio.getPower();
        System.out.println("Power: " + power);

        String element = HavellsInstanio.getHeatingElement();
        System.out.println("Heating Element: " + element);

        String pressure = HavellsInstanio.getPressureRating();
        System.out.println("Pressure Rating: " + pressure);

        String safety = HavellsInstanio.getSafetyFeatures();
        System.out.println("Safety Features: " + safety);

        String material = HavellsInstanio.getBodyMaterial();
        System.out.println("Body Material: " + material);

        String indicator = HavellsInstanio.getIndicator();
        System.out.println("Indicator: " + indicator);

        String warranty = HavellsInstanio.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}