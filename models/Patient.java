

/**
 * 
 */
public class Patient {
    
    private Doctor[] favoritesList;
    private Patient[] watchList;
    private Perscription[] validPerscriptions;
    private Perscription[] expiredPerscriptions;
    private MedicalRecommendation[] medicalRecommendations;
    private LinkedList upcomingAppointments;
    private LinkedList previousAppointments;
    private boolean donating;
    private String[] donations;
    
    // Patients Database

    // Doctors Database

    // User Database





    Patient() {

    }

    /**
     * 
     * @return
     */
    public MedicalRecommendation GetMedicalRecommendation() {

    }

    /**
     * 
     * @return
     */
    public Perscription GetPerscription() {

    }

    /**
     * 
     * @return
     */
    public String GetLabReport() {

    }

    /**
     * 
     * @return
     */
    public String GetMedicalRecords() {

    }

    /**
     * 
     * @return
     */
    public boolean RemoveMedicalRecords() {

        return false;
    }

    /**
     * 
     * @return
     */
    public String[] GetFavoritedDoctors() {

    }

    /**
     * 
     * @return
     */
    public String[] GetWatchedDoctors() {

    }

    /**
     * 
     * @param doctor_id
     * @return
     */
    public boolean FavoriteDoctor(int doctor_id) {

    }

    /**
     * 
     * @param patient_id
     * @return
     */
    public boolean WatchOrganDonor(int patient_id) {

    }

    /**
     * Returns the patient's public ID for other patient's to use for 
     * their watchlist.
     * @return
     */
    public int GetPublicID() {

    }

    /**
     * 
     * @return
     */
    public LinkedList[] GetUpcomingAppointments() {

    }

    /**
     * 
     * @param organ
     * @return
     */
    public boolean RemoveOrganDonation(String organ) {


    }

}