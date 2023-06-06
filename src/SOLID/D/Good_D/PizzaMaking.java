package SOLID.D.Good_D;

public class PizzaMaking implements PizzaCutting{
    private PizzaCutting cutting;

    public PizzaMaking(PizzaCutting cutting) {
        this.cutting = cutting;
    }

    @Override
    public void cutting() {
        cutting.cutting();
    }
}
