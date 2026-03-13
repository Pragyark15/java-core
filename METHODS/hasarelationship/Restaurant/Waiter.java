class Waiter {

    public static void takeOrder() {
        System.out.println("Waiter takes the order from guests");
        OrderSystem.sendToKitchen();
    }
}