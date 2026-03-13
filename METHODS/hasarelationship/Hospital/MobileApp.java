class MobileApp {

    public static void register(String patientName, String symptom, String email, long mobile) {
        System.out.println("Patient registered in mobileapp");
        Reception.book(patientName, symptom, email, mobile);
    }
}