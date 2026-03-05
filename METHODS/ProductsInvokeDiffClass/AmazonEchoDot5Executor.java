class AmazonEchoDot5Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = AmazonEchoDot5.getProductName();
        System.out.println("Product Name: " + name);

        String brand = AmazonEchoDot5.getBrand();
        System.out.println("Brand: " + brand);

        double price = AmazonEchoDot5.getPrice();
        System.out.println("Price: ₹" + price);

        String color = AmazonEchoDot5.getColor();
        System.out.println("Color: " + color);

        String assistant = AmazonEchoDot5.getVoiceAssistant();
        System.out.println("Voice Assistant: " + assistant);

        String connectivity = AmazonEchoDot5.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String speaker = AmazonEchoDot5.getSpeakerSize();
        System.out.println("Speaker Size: " + speaker);

        String smart = AmazonEchoDot5.getSmartHomeControl();
        System.out.println("Smart Home Control: " + smart);

        String mic = AmazonEchoDot5.getMicrophones();
        System.out.println("Microphones: " + mic);

        String power = AmazonEchoDot5.getPowerSource();
        System.out.println("Power Source: " + power);

        String feature = AmazonEchoDot5.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        String warranty = AmazonEchoDot5.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}