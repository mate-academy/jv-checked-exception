package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        UserService service = new UserService();

        User user = new User("testEmail@gmail.com", "password123", "password123");

        service.registerUser(user);
    }
}
