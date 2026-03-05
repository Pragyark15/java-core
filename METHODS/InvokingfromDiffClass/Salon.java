class Salon{
    static String ServiceNames[]={"Haircut","Manicure","Pedicure","Facial","Massage","Spa"};
	
	public static void getServiceNames(){
	System.out.println("getServiceNames invoked");
	for(String serviceName:ServiceNames){
	System.out.println(serviceName);
	
	}
	
	System.out.println("end of getServiceNames");
}

}