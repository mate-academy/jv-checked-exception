package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("reastador@gmail.com","qwerty1111","qwerty1111");
        userService.registerUser(user);
    }
}
