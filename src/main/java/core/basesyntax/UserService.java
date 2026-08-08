package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        if (user == null) {
            System.err.println("User cannot be null");
            return; // Or handle the error as required
        }
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();

        PasswordValidator validator = new PasswordValidator();
        try {
            validator.validate(password, repeatPassword);
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
