package core.basesyntax;

public class UserService extends PasswordValidator {
    public void registerUser(User user) throws PasswordValidationException {
        PasswordValidator psValid = new PasswordValidator();
        try {
            psValid.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException ex) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {

        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
