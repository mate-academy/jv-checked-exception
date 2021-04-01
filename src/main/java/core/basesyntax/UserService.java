package core.basesyntax;

public class UserService extends PasswordValidator{
    public void registerUser(User user) {


    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
