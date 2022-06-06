package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private PasswordValidator passwordValidator() {
        return null;
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
