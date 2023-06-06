package SOLID.L.Good_L;

public class main {
    public static void main(String[] args) {
        FirstChild firstChild = new FirstChild();
        SecondChilde secondChilde = new SecondChilde();
        System.out.println(firstChild.getName() + " can:");
        firstChild.all();
        System.out.println(secondChilde.getName() + " can:");
        secondChilde.all();
    }
}
