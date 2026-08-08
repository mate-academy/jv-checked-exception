package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User user1 = new User("john.do@eample", "2001andrei", "2001andrei");
        userService.registerUser(user1);

        User user2 = new User("john.do@eample", "john", "johner");
        userService.registerUser(user2);
    }
}
