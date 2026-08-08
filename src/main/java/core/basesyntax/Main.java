package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User("fff@ddd.com","11", "10");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
