package core.basesyntax;

public class UserService {
    private String password;
    private String repeatPassword;
    public void registerUser(User user) {
        PasswordValidator validator = new PasswordValidator();

        password = user.getPassword();
        repeatPassword = user.getRepeatPassword();

        if (validator.validate(password, repeatPassword)) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
