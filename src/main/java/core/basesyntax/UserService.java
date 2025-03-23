package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(String username, String password, String repeatPassword) {
        try {
            passwordValidator.validate(password, repeatPassword);
            saveUser(new User(username, password));
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(User user) {
        System.out.println("User " + user.getUsername() + " successfully registered!");
    }
}
