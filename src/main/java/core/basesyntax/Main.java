package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("sidorenko.igorek@gmail.com", "1234567", "1234");
        userService.registerUser(user);
    }
}
