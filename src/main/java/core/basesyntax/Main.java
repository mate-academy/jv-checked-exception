package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        String email = "greem@gmail.com";
        String password = "1234567890";
        String repeatPassword = "1234567890";

        UserService userService = new UserService();
        User user = new User(email, password, repeatPassword);
        userService.registerUser(user);
    }
}
