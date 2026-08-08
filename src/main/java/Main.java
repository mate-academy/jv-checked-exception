import core.basesyntax.User;
import core.basesyntax.UserService;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        User userPositive = new User("email@email.com", "Password123", "Password123");
        //  User userNegative = new User("email@email.com", "Password", "Password");

        service.registerUser(userPositive);
    }
}

