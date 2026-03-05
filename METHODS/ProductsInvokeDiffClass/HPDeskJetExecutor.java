class HPDeskJetExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = HPDeskJet.getProductName();
        System.out.println("Product Name: " + name);

        String brand = HPDeskJet.getBrand();
        System.out.println("Brand: " + brand);

        double price = HPDeskJet.getPrice();
        System.out.println("Price: ₹" + price);

        String color = HPDeskJet.getColor();
        System.out.println("Color: " + color);

        String functions = HPDeskJet.getFunctions();
        System.out.println("Functions: " + functions);

        String tech = HPDeskJet.getPrintTechnology();
        System.out.println("Print Technology: " + tech);

        String resolution = HPDeskJet.getPrintResolution();
        System.out.println("Print Resolution: " + resolution);

        String speed = HPDeskJet.getPrintSpeed();
        System.out.println("Print Speed: " + speed);

        String paper = HPDeskJet.getPaperSize();
        System.out.println("Supported Paper Size: " + paper);

        String connectivity = HPDeskJet.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String ink = HPDeskJet.getCompatibleInk();
        System.out.println("Compatible Ink: " + ink);

        String warranty = HPDeskJet.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}