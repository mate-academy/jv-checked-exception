package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("test@gmail.com", "mypassword123", "mypassword123");
        userService.registerUser(user);
    }
}
