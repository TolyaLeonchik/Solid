package SOLID.L.Bad_L;

public class main {
    public static void main(String[] args) {
        Child child = new Child();
        BadChild badChild = new BadChild();
        child.all();
        badChild.all();
    }
}
