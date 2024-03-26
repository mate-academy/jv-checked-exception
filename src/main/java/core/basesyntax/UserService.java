package core.basesyntax;

public class UserService {

    private final PasswordValidator passwordValidator;

    public UserService() {
        this.passwordValidator = new PasswordValidator();
    }

    public void registerUser(User user) {
        try {
            if (user.getPassword() == null || user.getRepeatPassword() == null) {
                throw new PasswordValidationException("Password or repeatPassword is null");
            }
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
