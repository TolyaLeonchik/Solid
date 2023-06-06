package SOLID.I.Bad_I;

public class Helicopter implements BadInterface{
    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void military() {
        int countOfRockets;
        int targetTime;
    }

    @Override
    public void civilian() {
        int countOfPassengers;
    }
}
