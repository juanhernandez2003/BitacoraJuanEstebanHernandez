package Semana1.EjerciciosDeTarea.Ejercicio2;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Transaction> transactions = List.of(
                new Transaction("T001", 150.00, true),
                new Transaction("T002", 200.00, false),
                new Transaction("T003", 350.00, true),
                new Transaction("T004", 100.00, false)
        );

        boolean isValid = transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .allMatch(t -> t.approved);

        System.out.println("\n¿Lote válido? " + isValid);
    }
}