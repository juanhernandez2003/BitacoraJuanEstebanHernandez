package Semana2.Ejercicio4;

public class Addition implements Operation {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }

    @Override
    public String getName() {
        return "Suma";
    }
}