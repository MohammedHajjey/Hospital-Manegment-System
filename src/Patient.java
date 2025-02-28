
public class Patient {
    private int patientId,patientAge;
    private String PatientName,gender,adress,contact;

    public Patient(int patientId, int patientAge, String PatientName, String gender, String adress, String contact) {
        this.patientId = patientId;
        this.patientAge = patientAge;
        this.PatientName = PatientName;
        this.gender = gender;
        this.adress = adress;
        this.contact = contact;
    }

    public Patient() {
        this.patientId = 0;
        this.patientAge = 0;
        this.PatientName = "";
        this.gender = "";
        this.adress = "";
        this.contact = "";
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientId=" + patientId + ", patientAge=" + patientAge + ", PatientName=" + PatientName + ", gender=" + gender + ", adress=" + adress + ", contact=" + contact + '}';
    }
    
     
   
    
}
