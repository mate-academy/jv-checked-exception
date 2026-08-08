package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser(new User("email@email", "Password#123", "Password#123"));
    }
}
