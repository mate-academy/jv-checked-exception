package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User name = new User("name@name", "123456123456123456123456","1234567890");

        UserService service = new UserService();

        service.registerUser(name);
    }
}
