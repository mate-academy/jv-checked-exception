package core.basesyntax;

public class UserService {
    private static final PasswordValidator password_Validator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            password_Validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            throw new RuntimeException("Your passwords are incorrect. Try again.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }

}
