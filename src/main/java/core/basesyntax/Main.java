package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final UserService us = new UserService();
        User user = new User("email@com", "1234567890", "1234567890");
        us.registerUser(user);
    }
}
