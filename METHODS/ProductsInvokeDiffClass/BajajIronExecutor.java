class BajajIronExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = BajajIron.getProductName();
        System.out.println("Product Name: " + name);

        String brand = BajajIron.getBrand();
        System.out.println("Brand: " + brand);

        double price = BajajIron.getPrice();
        System.out.println("Price: ₹" + price);

        String color = BajajIron.getColor();
        System.out.println("Color: " + color);

        String power = BajajIron.getPower();
        System.out.println("Power: " + power);

        String soleplate = BajajIron.getSoleplate();
        System.out.println("Soleplate: " + soleplate);

        String temp = BajajIron.getTemperatureControl();
        System.out.println("Temperature Control: " + temp);

        String cord = BajajIron.getCordType();
        System.out.println("Cord Type: " + cord);

        String indicator = BajajIron.getIndicator();
        System.out.println("Indicator: " + indicator);

        String weight = BajajIron.getWeight();
        System.out.println("Weight: " + weight);

        String safety = BajajIron.getSafetyFeature();
        System.out.println("Safety Feature: " + safety);

        String warranty = BajajIron.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}