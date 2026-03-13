class State {
    public static void run() {
        System.out.println("State administration running");
        District.run();
        District.taxing();
        District.measure();
        District.collect();
        District.revenue();
        District.budget();
    }
}