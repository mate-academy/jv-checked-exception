package core.basesyntax;

public class UserDao {
    public void saveUser(User user) {
        System.out.println(user.toString() + " was saved to database!!!");
    }
}
