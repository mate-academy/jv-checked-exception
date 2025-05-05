package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();
        PasswordValidator passwordValidator = new PasswordValidator();

        try {
            passwordValidator.validate(password, repeatPassword);
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
            return;
        }

        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
