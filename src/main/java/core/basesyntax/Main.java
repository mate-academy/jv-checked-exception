package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("regen@gmail.com","1123123123","1123123123");
        userService.registerUser(user);
    }
}
