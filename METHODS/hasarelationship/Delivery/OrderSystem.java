class OrderSystem {
    public static void takeOrder() {
        System.out.println("Order taken");
        InventoryCheck.validate();
    }
}