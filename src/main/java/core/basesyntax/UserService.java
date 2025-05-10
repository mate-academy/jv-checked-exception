package core.basesyntax;

public class UserService {
    private PasswordValidator validator = new PasswordValidator();

    public PasswordValidator getValidator() {
        return validator;
    }

    public void setValidator(PasswordValidator validator) {
        this.validator = validator;
    }

    public void registerUser(User user) {
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
