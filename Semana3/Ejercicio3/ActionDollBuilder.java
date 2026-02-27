package Semana3.Ejercicio3;

public class ActionDollBuilder implements ToyDollBuilder {
    private ToyDoll doll;

    public ActionDollBuilder() {
        this.doll = new ToyDoll();
    }

    @Override
    public void buildHead() { doll.setHead("Cabeza de acción con casco"); }

    @Override
    public void buildBody() { doll.setBody("Cuerpo musculoso con armadura"); }

    @Override
    public void buildArms() { doll.setArms("Brazos articulados con armas"); }

    @Override
    public void buildLegs() { doll.setLegs("Piernas articuladas con botas"); }

    @Override
    public void addAccessories() { doll.setHasAccessories(true); }

    public ToyDoll getResult() { return doll; }
}