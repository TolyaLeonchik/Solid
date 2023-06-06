package SOLID.S.Bad_S;

public class AllInOne {
    public AllInOne() {

    }
    public void Teacher(String name, String subject, int experience) {
        String teacherName = name;
        String teacherSubject = subject;
        int teacherExperience = experience;
        System.out.println("Меня зовут " + teacherName + ", мой предмет: " + teacherSubject +
                ", мой стаж: " + teacherExperience);
    }
    public void Doctor(String name, String speciality, int experience) {
        String doctorName = name;
        String doctorSpeciality = speciality;
        int doctorExperience = experience;
        System.out.println("Меня зовут " + doctorName + ", моя специальность в медицине: " + doctorSpeciality +
                ", мой стаж: " + doctorExperience);
    }

    public void Engineer(String name, String speciality, int experience) {
        String engineerName = name;
        String engineerSpeciality = speciality;
        int engineerExperience = experience;
        System.out.println("Меня зовут " + engineerName + ", моя специальность инженер-" + engineerSpeciality +
                ", мой стаж: " + engineerExperience);
    }

}
