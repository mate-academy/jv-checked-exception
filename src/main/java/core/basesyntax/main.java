package core.basesyntax;

public class main {
    public static void main(String[] args) {
        User user = new User("qwert@.com", "qazwsx12341", "qazwsx12341");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
