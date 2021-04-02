package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("ttt@yy", "1234567890a", "1234567890a");
        User user2 = new User("tt@uu.o", "1234", "1234");
        UserService test = new UserService();
        test.registerUser(user);
        test.registerUser(user2);
    }
}
