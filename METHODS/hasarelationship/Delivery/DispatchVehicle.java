class DispatchVehicle {
    public static void outOfDelivery() {
        System.out.println("Out for delivery");
        DeliveryAgent.reachDoorStep();
    }
}