package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("test1@org.com",
                "1234567890", "1234567891");

        new UserService().registerUser(user1);
    }
}
