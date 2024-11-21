package core;
import core.basesyntax.UserServise;

public class Main {
    public static void main(String[] args) {
        UserServise userService = new UserServise();
        userService.registerUser("hryak@example.com", "hryakRyba111", "hryakRyba111");
        userService.registerUser("test@example.com", "password123", "wrongPassword");
        userService.registerUser("hryak@example.com", "hryakRyba111", "hryakRyba111");
        System.out.println("\nRegistered users:");
        userService.getUserDatabase().forEach(user -> System.out.println(user.getEmail()));
    }
}
