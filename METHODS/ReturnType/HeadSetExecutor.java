class HeadSetExecutor{
    public static void main(String[] args){
        System.out.println("main started");
        String brand=HeadSet.getBrand();
        System.out.println("Brand is " +brand);

        double price=HeadSet.getPrice();
        System.out.println("Price is " +price);

        String color=HeadSet.getColor();
        System.out.println("Color is " +color);

    }
}