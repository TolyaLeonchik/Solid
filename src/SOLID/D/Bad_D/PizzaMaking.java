package SOLID.D.Bad_D;

public class PizzaMaking implements PizzaCutting{
    private PizzaCutting cutting;

    public PizzaMaking() {
        this.cutting = new PizzaMaker();
    }

    @Override
    public void pizzaCutter() {
        cutting.pizzaCutter();
    }
}
