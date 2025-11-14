package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        User user = new User("google@.com", "23677555", "2367755553");
        service.registerUser(user);

    }
}

