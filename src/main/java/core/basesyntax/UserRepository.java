package core.basesyntax;

public class UserRepository {
    public void saveUser(User user) {
        // логіка збереження користувача
        System.out.println("Користувача збережено: " + user.getUsername());
    }
}
