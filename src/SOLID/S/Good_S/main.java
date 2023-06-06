package SOLID.S.Good_S;

public class main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петя", "Химия", 4);
        Doctor doctor = new Doctor("Вася", "Травматолог", 6);
        Engineer engineer = new Engineer("Стас", "Сварщик", 2);
        System.out.println("Меня зовут " + teacher.getTeacherName() + ", мой предмет: " +
                teacher.getTeacherSubject() + ", мой стаж: " + teacher.getTeacherExperience());
        System.out.println("Меня зовут " + doctor.getDoctorName() + ", моя специальность в медицине: " +
                doctor.getDoctorSpeciality() + ", мой стаж: " + doctor.getDoctorExperience());
        System.out.println("Меня зовут " + engineer.getEngineerName() + ", моя специальность инженер-" +
                engineer.getEngineerSpeciality() + ", мой стаж: " + engineer.getEngineerExperience());

    }
}
