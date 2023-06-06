package SOLID.L.Good_L;

public abstract class CantDrive extends Parent{
    public void driveCar() {

    }

    @Override
    public void all() {
        super.all();
        this.driveCar();
    }
}
