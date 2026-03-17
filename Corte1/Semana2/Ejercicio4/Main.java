package Semana2.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Números enteros
        calculator.calculate(new Addition(), 10, 5);
        calculator.calculate(new Subtraction(), 10, 5);
        calculator.calculate(new Multiplication(), 10, 5);
        calculator.calculate(new Division(), 10, 5);

        System.out.println("-----");

        // Números decimales
        calculator.calculate(new Addition(), 10.5, 3.2);
        calculator.calculate(new Subtraction(), 10.5, 3.2);
        calculator.calculate(new Multiplication(), 10.5, 3.2);
        calculator.calculate(new Division(), 10.5, 3.2);
    }
}