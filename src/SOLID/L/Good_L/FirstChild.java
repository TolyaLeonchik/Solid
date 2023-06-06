package SOLID.L.Good_L;

public class FirstChild extends CanDrive{

    @Override
    public void diveCar() {
        System.out.println("I can drive");
    }

    @Override
    public String getName() {
        return "Petya";
    }
}
