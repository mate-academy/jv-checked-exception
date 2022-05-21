package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("email@email", "Password#123", "Password#123");
        User jadeRussell = new User("jaderussell197@gmail.com", "Password#123", "Password#123");
        User newNull = new User("jaderussell197@gmail.com", null, null);
        new UserService().registerUser(user);
        new UserService().registerUser(jadeRussell);
        new UserService().registerUser(newNull);
    }
}
