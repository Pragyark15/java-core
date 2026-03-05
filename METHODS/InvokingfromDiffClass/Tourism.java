class Tourism{
    static String PlaceNames[]={"Ladakh","Manali","Shimla","Srinagar","Varnasi","Goa"};
	
	public static void getPlaceNames(){
	System.out.println("getPlaceNames invoked");
	for(String placeName:PlaceNames){
	System.out.println(placeName);
	
	}
	
	System.out.println("end of getPlaceNames");
}

}