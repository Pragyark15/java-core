class LGRefrigerator260LExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = LGRefrigerator260L.getProductName();
        System.out.println("Product Name: " + name);

        String brand = LGRefrigerator260L.getBrand();
        System.out.println("Brand: " + brand);

        double price = LGRefrigerator260L.getPrice();
        System.out.println("Price: ₹" + price);

        String color = LGRefrigerator260L.getColor();
        System.out.println("Color: " + color);

        String capacity = LGRefrigerator260L.getCapacity();
        System.out.println("Capacity: " + capacity);

        String rating = LGRefrigerator260L.getEnergyRating();
        System.out.println("Energy Rating: " + rating);

        String cooling = LGRefrigerator260L.getCoolingType();
        System.out.println("Cooling Type: " + cooling);

        String compressor = LGRefrigerator260L.getCompressor();
        System.out.println("Compressor: " + compressor);

        String shelves = LGRefrigerator260L.getShelfType();
        System.out.println("Shelf Type: " + shelves);

        String defrost = LGRefrigerator260L.getDefrostingType();
        System.out.println("Defrosting Type: " + defrost);

        String warranty = LGRefrigerator260L.getWarranty();
        System.out.println("Warranty: " + warranty);

        String feature = LGRefrigerator260L.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        System.out.println("Main ended");
    }
}