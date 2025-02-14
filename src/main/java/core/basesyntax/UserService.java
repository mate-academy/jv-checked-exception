package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(String password, String repeatPassword) {
        try {
            passwordValidator.validate(password, repeatPassword);
            saveUser(password);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(String password) {
        User user = new User(password);

        System.out.println("User successfully registered with password: " + user.password());
    }

}
