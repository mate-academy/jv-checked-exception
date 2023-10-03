package core.basesyntax;

public class Main {
    public static void main(String[] arg) {
        User user = new User("mail@gmail.com", "26537h", "dgjx");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
