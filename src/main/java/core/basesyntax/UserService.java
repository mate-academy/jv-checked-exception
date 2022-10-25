package core.basesyntax;

public class UserService {
    public void registerUser(User user) {

        PasswordValidator validator = new PasswordValidator();
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (AuthenticationException e) {
            System.out.println("Your passwords are incorrect");
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
