class Dmart{
    static String ItemNames[]={"Perfume","Box","Spoon","Socks","Shirt","Mat"};
	
	public static void getItemNames(){
	System.out.println("getItemNames invoked");
	for(String itemName:ItemNames){
	System.out.println(itemName);
	
	}
	
	System.out.println("end of getItemNames");
}

}