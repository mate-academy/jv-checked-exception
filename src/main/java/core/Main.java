package core;

import core.basesyntax.User;
import core.basesyntax.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser(new User("hryak@example.com", "hryakRyba111", "hryakRyba111"));
        userService.registerUser(new User("test@example.com", "password123", "wrongPassword"));
        userService.registerUser(new User("hryak@example.com", "hryakRyba111", "hryakRyba111"));
        userService.getUserDatabase().forEach(user -> System.out.println(user.getEmail()));
    }
}
