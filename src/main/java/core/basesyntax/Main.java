package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("login@email","Test_123d45","Test_12345");
        UserService userService = new UserService();

        userService.registerUser(user);


    }
}
