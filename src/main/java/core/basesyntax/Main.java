package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        UserService userService = new UserService();
        User user = new User("qwerty@gmail.com", "","");
        userService.registerUser(user);
    }
}
