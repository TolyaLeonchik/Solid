package SOLID.L.Good_L;

public abstract class Parent {
    public abstract String getName();

    public void jump() {
        System.out.println("I am jumping");
    }

    public void walk() {
        System.out.println("I am walking...");
    }

    public void sleep() {
        System.out.println("I sleep");
    }

    public void all() {
        walk();
        jump();
        sleep();
    }
}
