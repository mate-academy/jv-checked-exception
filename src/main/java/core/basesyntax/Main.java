package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        User user = new User("vakosovij@gmail.com","1234124","1234567890");
        service.registerUser(user);
    }
}
