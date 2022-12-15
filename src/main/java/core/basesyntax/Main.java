package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User("email@email","abcdefghijkl", "abcde");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
