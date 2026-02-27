package Semana2.Ejercicio4;

public class Calculator {
    public double calculate(Operation operation, double a, double b) {
        double result = operation.execute(a, b);
        System.out.println(operation.getName() + " de " + a + " y " + b + " = " + result);
        return result;
    }
}