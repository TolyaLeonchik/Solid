package SOLID.I.Good_I;

public class Helicopter implements HelicopterChoice, MilitaryHelicopter{
    double price;
    String color;
    int countOfRockets;
    int targetTime;

    public Helicopter(double price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void military(int countOfRockets, int targetTime) {
        this.countOfRockets = countOfRockets;
        this.targetTime = targetTime;
    }
}
