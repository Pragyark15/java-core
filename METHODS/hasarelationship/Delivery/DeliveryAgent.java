class DeliveryAgent {
    public static void reachDoorStep() {
        System.out.println("Reached customer");
        SignaturePortal.collectESign();
    }
}