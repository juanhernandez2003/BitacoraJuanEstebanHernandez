package Semana3.Ejercicio3;

public class ToyFactory {
    private ToyDollBuilder builder;

    public void constructDoll(ToyDollBuilder builder) {
        this.builder = builder;
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        builder.addAccessories();
    }
}