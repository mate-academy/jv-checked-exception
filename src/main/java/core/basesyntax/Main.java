package core.basesyntax;

public class Main {
    public static void main(String[] agr) {
        UserService userService = new UserService();
        User bob = new User("bob@email.com", "1234567890", "1234567890");
        User alice = new User("alice@gmail.com", "1234567890", "0987654321");
        User mark = new User("mark@gmail.com", "1234", "1234");
        User marie = new User("marie@gmail.com", "1234567890", null);
        User[] users = new User[]{bob, alice, mark, marie};

        for (User user : users) {
            userService.registerUser(user);
        }
    }
}
