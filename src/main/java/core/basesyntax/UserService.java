package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator validator = new PasswordValidator();
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();

        try {
            validator.validate(password, repeatPassword);
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
