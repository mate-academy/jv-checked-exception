package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("seeyou@nbnbnb", "asd12345678","zxc12345678");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
