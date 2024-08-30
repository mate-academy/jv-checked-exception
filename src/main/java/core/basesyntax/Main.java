package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        User user = new User("nikolya.cr@gmail.com", "123456789110", "12345678910");
        UserService service = new UserService();
        service.registerUser(user);
    }
}
