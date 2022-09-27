package core.basesyntax;

public class CheckClass {
    public static void main(String[] args) {
        User v = new User("test@gmail.com", "qwerrtyuui", "qwerrtyuui");
        UserService userService = new UserService();
        userService.registerUser(v);
    }
}
