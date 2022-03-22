package core.basesyntax;

public class UserService {
    public void registerUser(User user){
        PasswordValidator validator = new PasswordValidator();
        validator.validate(user.getPassword(), user.getRepeatPassword());
    }

    public void saveUser(User user){
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
