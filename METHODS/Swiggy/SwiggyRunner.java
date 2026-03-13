class SwiggyRunner{
    public static void main(String[] args){

        double foodPrice = Swiggy.search(98.00);

        double foodPriceWithQuantity = Swiggy.search(98.00, 5);

        System.out.println(foodPrice);
        System.out.println(foodPriceWithQuantity);
    }
}