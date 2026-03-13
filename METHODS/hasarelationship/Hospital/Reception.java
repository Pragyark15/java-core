class Reception {

    public static void book(String patientName, String symptom, String email, long mobile) {
        System.out.println("Appointment booked");
        Hospital.bookAppointment(patientName, symptom);
    }
}