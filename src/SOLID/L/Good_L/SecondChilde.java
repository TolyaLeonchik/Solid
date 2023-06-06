package SOLID.L.Good_L;

public class SecondChilde extends CantDrive{

    @Override
    public void driveCar() {
        System.out.println("I can't drive a Car!");
    }

    @Override
    public String getName() {
        return "Stas";
    }
}
