package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        User validUser = new User("john.doe@example.com",
                "1234567890",
                "1234567890");
        User invalidUser = new User("jane.doe@example.com",
                "short",
                "short");

        service.registerUser(validUser);
        service.registerUser(invalidUser);
    }
}
