package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("nazarko@gmail.com","Nazarko9089","Nazarko9090");
        userService.registerUser(user);
    }
}
