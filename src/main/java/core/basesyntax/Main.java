package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("kqlynero@gmail.com",
                "12345678901",
                "123456");
        new UserService().registerUser(user);
    }
}
