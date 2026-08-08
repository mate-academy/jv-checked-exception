package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();
        UserService userService = new UserService();
        User user = new User("JohnDoe", "password1234", "password1234");
        userService.registerUser(user);
    }
}
