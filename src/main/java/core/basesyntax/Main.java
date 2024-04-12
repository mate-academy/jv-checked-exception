package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        UserService userService = new UserService();
        User bob = new User("bob.doe@gmail.com", null, "null");
        User jane = new User("jane.doe@gmail.com", "qwerty123", "qwerty123");
        User jack = new User("jack.doe@gmail.com", "rty123", "qwerty12345");
        userService.registerUser(bob);
        userService.registerUser(jane);
        userService.registerUser(jack);
    }
}
