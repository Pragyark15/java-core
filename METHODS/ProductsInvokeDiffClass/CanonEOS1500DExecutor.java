class CanonEOS1500DExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = CanonEOS1500D.getProductName();
        System.out.println("Product Name: " + name);

        String brand = CanonEOS1500D.getBrand();
        System.out.println("Brand: " + brand);

        double price = CanonEOS1500D.getPrice();
        System.out.println("Price: ₹" + price);

        String color = CanonEOS1500D.getColor();
        System.out.println("Color: " + color);

        String sensor = CanonEOS1500D.getSensor();
        System.out.println("Sensor: " + sensor);

        String lens = CanonEOS1500D.getLens();
        System.out.println("Lens: " + lens);

        String video = CanonEOS1500D.getVideoRecording();
        System.out.println("Video Recording: " + video);

        String iso = CanonEOS1500D.getISO();
        System.out.println("ISO Range: " + iso);

        String connectivity = CanonEOS1500D.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String display = CanonEOS1500D.getDisplay();
        System.out.println("Display: " + display);

        String weight = CanonEOS1500D.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = CanonEOS1500D.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}