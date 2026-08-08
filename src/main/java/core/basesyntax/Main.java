package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("nicktich284@gmail.com", "Hello world", "Hello world");
        userService.registerUser(user);
    }
}
