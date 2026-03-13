class Hospital {

    public static void bookAppointment(String patientName, String symptom) {
        System.out.println("Hospital has scheduled appointment");
        Nurse.basicCheck(patientName, symptom, 170, 85);
    }
}