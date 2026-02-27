public class Main{
    public static void main(String[] args){
        List<User> users = List.of(
                new User(1, "Carlos", 25, true),
                new User(2, "Ana", 30, false),
                new User(3, "Beatriz", 22, true),
                new User(4, "David", 28, false),
                new User(5, "Elena", 35, true)
        );

        List<String> result = users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(result);
    }
}