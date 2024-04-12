package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException{
        UserService userService = new UserService();
        User bob = new User("web.lapikov@gmail.com", "qwerty12345", "qwerty12345");
        userService.registerUser(bob);
    }
}
