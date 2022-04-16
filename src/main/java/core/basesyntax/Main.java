package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("hi", "", "");
        UserService userService = new UserService();
        userService.registerUser(user1);
    }
}
