package core.basesyntax;

public class UserService {
    private final PasswordValidator validator = new PasswordValidator();

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }

    public void registerUser(String email, String password, String repeatPassword) {
        try {
            validator.validate(password, repeatPassword);
            User newUser = new User(email, password, repeatPassword);
            saveUser(newUser);

        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}
