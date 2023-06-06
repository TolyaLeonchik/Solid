package SOLID.S.Good_S;

public class Teacher {
    private String teacherName;
    private String teacherSubject;
    private int teacherExperience;

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public int getTeacherExperience() {
        return teacherExperience;
    }

    public Teacher(String teacherName, String teacherSubject, int teacherExperience) {
        this.teacherName = teacherName;
        this.teacherSubject = teacherSubject;
        this.teacherExperience = teacherExperience;
    }
}
