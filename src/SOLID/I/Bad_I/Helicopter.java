package SOLID.I.Bad_I;

public class House implements BadInterface{
    double price;
    String color;
    int countOfRooms;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void numberOfRooms(int countOfRooms) {
        this.countOfRooms = countOfRooms;
    }

    @Override
    public void buy() {

    }

    @Override
    public void decorate() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void penthouse() {

    }

    @Override
    public void oneStoryHouse() {

    }

    @Override
    public void multiStoryHouse() {

    }
}
