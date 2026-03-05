class SamsungCrystal4KTVExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = SamsungCrystal4KTV.getProductName();
        System.out.println("Product Name: " + name);

        String brand = SamsungCrystal4KTV.getBrand();
        System.out.println("Brand: " + brand);

        double price = SamsungCrystal4KTV.getPrice();
        System.out.println("Price: ₹" + price);

        String size = SamsungCrystal4KTV.getDisplaySize();
        System.out.println("Display Size: " + size);

        String resolution = SamsungCrystal4KTV.getResolution();
        System.out.println("Resolution: " + resolution);

        String type = SamsungCrystal4KTV.getDisplayType();
        System.out.println("Display Type: " + type);

        String smart = SamsungCrystal4KTV.getSmartFeatures();
        System.out.println("Smart Features: " + smart);

        String sound = SamsungCrystal4KTV.getSoundOutput();
        System.out.println("Sound Output: " + sound);

        String connectivity = SamsungCrystal4KTV.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String refresh = SamsungCrystal4KTV.getRefreshRate();
        System.out.println("Refresh Rate: " + refresh);

        String warranty = SamsungCrystal4KTV.getWarranty();
        System.out.println("Warranty: " + warranty);

        String feature = SamsungCrystal4KTV.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        System.out.println("Main ended");
    }
}