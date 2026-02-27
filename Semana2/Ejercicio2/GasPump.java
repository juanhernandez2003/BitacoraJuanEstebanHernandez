package Semana2.Ejercicio2;

public class GasPump implements FuelService {
    @Override
    public void supply(int liters) {
        System.out.println("Suministrando " + liters + " litros de gasolina.");
    }
}