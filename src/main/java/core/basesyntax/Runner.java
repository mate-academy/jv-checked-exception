package core.basesyntax;

public class Runner {
    public static void main(String[] args) {
        User user = new User("123@gmail.com","1111111111","1111111111");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
