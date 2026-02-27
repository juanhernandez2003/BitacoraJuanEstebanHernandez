package Semana1.EjerciciosDeTarea;
import Semana1.EjerciciosEnClase.Ejercicio3.User;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User(1, "Carlos", 25, true),
                new User(2, "Ana", 16, false),
                new User(3, "Beatriz", 15, true),
                new User(4, "David", 28, false),
                new User(5, "Elena", 35, true)
        );

        List<String> result = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .toList();

        System.out.println(result);
    }
}