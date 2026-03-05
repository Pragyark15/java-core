class Hospital{
    static String doctorNames[]={"Orthopedician","Cardiologist","Neurologist","Gynacologist","Pediatrician","Dermatologist"};
	
	public static void getDoctorNames(){
	System.out.println("getDoctorNames invoked");
	for(String doctorName:doctorNames){
	System.out.println(doctorName);
	
	}
	
	System.out.println("end of getDoctorNames");
}

}