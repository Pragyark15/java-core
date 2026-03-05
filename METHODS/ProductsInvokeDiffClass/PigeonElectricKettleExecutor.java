class PigeonElectricKettleExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = PigeonElectricKettle.getProductName();
        System.out.println("Product Name: " + name);

        String brand = PigeonElectricKettle.getBrand();
        System.out.println("Brand: " + brand);

        double price = PigeonElectricKettle.getPrice();
        System.out.println("Price: ₹" + price);

        String color = PigeonElectricKettle.getColor();
        System.out.println("Color: " + color);

        String capacity = PigeonElectricKettle.getCapacity();
        System.out.println("Capacity: " + capacity);

        String power = PigeonElectricKettle.getPower();
        System.out.println("Power: " + power);

        String material = PigeonElectricKettle.getBodyMaterial();
        System.out.println("Body Material: " + material);

        String element = PigeonElectricKettle.getHeatingElement();
        System.out.println("Heating Element: " + element);

        String cutoff = PigeonElectricKettle.getAutoCutOff();
        System.out.println("Auto Cut-Off: " + cutoff);

        String base = PigeonElectricKettle.getBaseType();
        System.out.println("Base Type: " + base);

        String indicator = PigeonElectricKettle.getIndicator();
        System.out.println("Indicator: " + indicator);

        String warranty = PigeonElectricKettle.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}