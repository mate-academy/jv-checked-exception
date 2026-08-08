package core.basesyntax;

public class UserRepository {
    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
