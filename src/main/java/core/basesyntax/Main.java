package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("email@email", "Password#123", "Password#123");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
