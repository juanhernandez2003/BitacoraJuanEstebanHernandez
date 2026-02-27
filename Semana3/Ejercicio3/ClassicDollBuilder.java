package Semana3.Ejercicio3;

public class ClassicDollBuilder implements ToyDollBuilder {
    private ToyDoll doll;

    public ClassicDollBuilder() {
        this.doll = new ToyDoll();
    }

    @Override
    public void buildHead() { doll.setHead("Cabeza clásica con cabello rubio"); }

    @Override
    public void buildBody() { doll.setBody("Cuerpo clásico con vestido"); }

    @Override
    public void buildArms() { doll.setArms("Brazos delgados"); }

    @Override
    public void buildLegs() { doll.setLegs("Piernas con zapatos de tacón"); }

    @Override
    public void addAccessories() { doll.setHasAccessories(false); }

    public ToyDoll getResult() { return doll; }
}