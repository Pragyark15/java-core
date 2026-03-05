class FitnessTracker {

    static String brandName = "Fitbit";
    static String modelName = "Charge 5";
    static String itemType = "Fitness Tracker";
    static String connectivity = "Bluetooth, Wi-Fi";
    static int batteryLifeHours = 168; // 7 days
    static String specialFeatures = "Heart Rate Monitor, Sleep Tracking, GPS";
    static String material = "Aluminum + Silicone";
    static String countryOfOrigin = "China";
    static String includedComponents = "Tracker, Charging Cable, User Manual";
    static int unitCount = 1;
    static String asin = "B0FITBITCHARGE5";
    static double customerRating = 4.4;

    public static void main(String[] args) {

        String brandName = "Garmin";
        String modelName = "Vivosmart 5";
        String itemType = "Fitness Tracker";
        String connectivity = "Bluetooth";
        int batteryLifeHours = 120; // 5 days
        String specialFeatures = "Heart Rate Monitor, Stress Tracking, GPS";
        String material = "Plastic + Silicone";
        String countryOfOrigin = "Taiwan";
        String includedComponents = "Tracker, Charging Cable";
        int unitCount = 1;
        String asin = "B0GARMINV5";
        double customerRating = 4.3;

        System.out.println("Brand Name: " + brandName);
        System.out.println("Brand Name: " + FitnessTracker.brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Name: " + FitnessTracker.modelName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Item Type: " + FitnessTracker.itemType);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Connectivity: " + FitnessTracker.connectivity);
        System.out.println("Battery Life: " + batteryLifeHours + " hours");
        System.out.println("Battery Life: " + FitnessTracker.batteryLifeHours + " hours");
        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Special Features: " + FitnessTracker.specialFeatures);
        System.out.println("Material: " + material);
        System.out.println("Material: " + FitnessTracker.material);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Country Of Origin: " + FitnessTracker.countryOfOrigin);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Included Components: " + FitnessTracker.includedComponents);
        System.out.println("Unit Count: " + unitCount);
        System.out.println("Unit Count: " + FitnessTracker.unitCount);
        System.out.println("ASIN: " + asin);
        System.out.println("ASIN: " + FitnessTracker.asin);
        System.out.println("Customer Rating: " + customerRating + " out of 5");
        System.out.println("Customer Rating: " + FitnessTracker.customerRating + " out of 5");
    }
}
