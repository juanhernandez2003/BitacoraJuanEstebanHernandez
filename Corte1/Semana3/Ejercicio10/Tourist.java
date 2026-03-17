package Semana3.Ejercicio10;

public class Tourist {

    public void exploreTour(Aggregate<Place> route) {
        Iterator<Place> iterator = route.createIterator();

        while (iterator.hasNext()) {
            Place p = iterator.next();
            System.out.println("Visiting " + p.getName());
        }
    }
}