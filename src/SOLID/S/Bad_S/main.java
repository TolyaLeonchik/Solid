package SOLID.S.Bad_S;

public class main {
    public static void main(String[] args) {
        AllInOne person = new AllInOne();
        person.Teacher("Петя", "Химия", 5);
        person.Doctor("Вася", "Травматолог", 6);
        person.Engineer("Стас", "сварщик", 2);
    }
}
