package SOLID.L.Bad_L;

public class BadChild extends Parent{
    @Override
    public void diveCar() {
        throw new RuntimeException("I can't drive!!! I doesn't have licence");
    }
}
