package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator validator = new PasswordValidator();
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException exception) {
            System.out.println(exception.getMessage() != "Correct" ? "Your passwords are incorrect. Try again." : saveUser(user));
        }
    }

    public String saveUser(User user) {
        return "User " + user.toString() + " was saved to database!!!";
    }
}
