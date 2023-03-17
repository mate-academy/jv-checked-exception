package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("qwerty@gmail.com", "zxcvbn", "zxcvbn");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
