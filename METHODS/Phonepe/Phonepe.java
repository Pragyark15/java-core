class Phonepe{

    static double searchInsurancePremium(String insuranceName){
       System.out.println("searchInsurancePremium method invoked");
       if(insuranceName.equals("Star Insurance")){
           return 5000.00;
       } else if(insuranceName.equals("Ackro Insurance")){
           return 3567.55;
       } else if(insuranceName.equals("Policy Bazaar Insurance")){
           return 4000.56;
       } else if(insuranceName.equals("HDFC Insurance")){
           return 4879.00;
       } else if(insuranceName.equals("ICICI Insurance")){
           return 3853.00;
       } else {System.out.println("Insurance not found");
           return 0.0; 
	   }
    }
}