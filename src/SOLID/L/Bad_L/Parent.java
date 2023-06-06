package SOLID.L.Bad_L;

public class Parent {
    public void jump() {
        System.out.println("I am jumping");
    }

    public void walk() {
        System.out.println("I am walking...");
    }

    public void sleep() {
        System.out.println("I sleep");
    }

    public void diveCar() {

    }

    public void all() {
        walk();
        jump();
        sleep();
        diveCar();
    }
}
