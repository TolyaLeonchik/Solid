package SOLID.L.Good_L;

public abstract class CanDrive extends Parent{
    public void diveCar() {
        System.out.println("f");
    }

    @Override
    public void all() {
        super.all();
        this.diveCar();
    }
}
