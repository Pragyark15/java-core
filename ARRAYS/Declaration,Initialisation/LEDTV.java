class LEDTV {

    // ===== DECLARATION ONLY =====
    static String brand;
    static String screenSize;
    static String displayType;
    static String colour;

    static boolean smartTV;
    static int refreshRateHz;
    static String soundTechnology;

    static String connectivity;
    static double rating;

    public static void main(String[] args) {

        // ===== INITIALIZATION =====
        brand = "Samsung";
        screenSize = "43 Inch";
        displayType = "4K UHD";
        colour = "Black";

        smartTV = true;
        refreshRateHz = 60;
        soundTechnology = "Dolby Audio";

        connectivity = "WiFi, HDMI, USB";
        rating = 4.5;

        // ===== PRINT =====
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Display Type: " + displayType);
        System.out.println("Colour: " + colour);

        System.out.println("Smart TV: " + smartTV);
        System.out.println("Refresh Rate: " + refreshRateHz + " Hz");
        System.out.println("Sound Technology: " + soundTechnology);

        System.out.println("Connectivity: " + connectivity);
        System.out.println("Rating: " + rating + " out of 5");
    }
}