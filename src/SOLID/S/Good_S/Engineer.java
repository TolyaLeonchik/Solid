package SOLID.S.Good_S;

public class Engineer {
    private String engineerName;
    private String engineerSpeciality;
    private int engineerExperience;

    public String getEngineerName() {
        return engineerName;
    }

    public String getEngineerSpeciality() {
        return engineerSpeciality.toLowerCase();
    }

    public int getEngineerExperience() {
        return engineerExperience;
    }

    public Engineer(String engineerName, String engineerSpeciality, int engineerExperience) {
        this.engineerName = engineerName;
        this.engineerSpeciality = engineerSpeciality;
        this.engineerExperience = engineerExperience;
    }
}
