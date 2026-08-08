package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();
        UserService userService = new UserService();
        User user = new User("Johny", "password12345", "password12345");
        userService.registerUser(user);
    }
}
