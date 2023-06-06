package SOLID.S.Good_S;

public class Doctor {
    private String doctorName;
    private String doctorSpeciality;
    private int doctorExperience;

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public int getDoctorExperience() {
        return doctorExperience;
    }

    public Doctor(String doctorName, String doctorSpeciality, int doctorExperience) {
        this.doctorName = doctorName;
        this.doctorSpeciality = doctorSpeciality;
        this.doctorExperience = doctorExperience;
    }
}
