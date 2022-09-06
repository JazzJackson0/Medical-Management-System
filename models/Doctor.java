

/**
 * 
 */
public class Doctor {
    
    private Patient[] patientsTreated;
    private LinkedList upcomingAppointments;
    private LinkedList previousAppointments;
    
    
    public Doctor() {

    }

    public boolean SetAppointmentAvailability() {

    }

    /**
     * Returns the doctor's public ID for patient's to use for 
     * their favorites list.
     * @return
     */
    public boolean GetPublicID() {

        return false;
    }

    /**
     * 
     * @param patient_name
     * @param organ
     * @return
     */
    public boolean AddOrganDonation(String patient_name, String organ) {

        return false;
    }

    /**
     * 
     * @param patient_name
     * @param organ
     * @return
     */
    public boolean RemoveOrganDonation(String patient_name, String organ) {

        return false;
    }


    /**
     * 
     * @param patient_name
     * @param file
     * @return
     */
    public boolean UpdateMedicalRecords(String patient_name, String file) {

        return false;
    }

    /**
     * 
     * @param patient_name
     * @param file
     * @return
     */
    public boolean UpdateLabReports(String patient_name, String file) {

        return false;
    }

    /**
     * 
     * @param patient_name
     * @return
     */
    public boolean RemoveMedicalRecord(String patient_name) {

        return false;
    }


    /**
     * 
     * @param patient_name
     * @return
     */
    public boolean RemoveLabReport(String patient_name) {

        return false;
    }


    /**
     * 
     * @param perscription_type
     * @param amount
     * @param strength
     * @param patient_name
     * @param patient_id
     * @param doctor_name
     * @param doctor_id
     * @param details
     * @param begin_date
     * @param end_date
     * @return
     */
    public boolean CreatePerscription(String perscription_type, float amount, float strength,
        String patient_name, int patient_id, String doctor_name, int doctor_id, 
        String details, int begin_date, int end_date) {

        return false;
    }

    /**
     * 
     * @param patient_name
     * @param patient_id
     * @param doctor_name
     * @param doctor_id
     * @param date
     * @return
     */
    public boolean CreateMedicalRecommendation(String patient_name, int patient_id, 
        String doctor_name, int doctor_id, int date) {

        return false;
    }

}
