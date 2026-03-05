class Gym{
    static String gymEquipments[]={"Dumble","Treadmill","Cross Trainer","Stationary Bike","Elliptical Trainer"};
	public static void getGymEquipments(){
		System.out.println("getGymEquipments invoked");
		for(String gymEquipment:gymEquipments){
			System.out.println(gymEquipment);
		}
		System.out.println("end of getGymEquipments");
	}
}