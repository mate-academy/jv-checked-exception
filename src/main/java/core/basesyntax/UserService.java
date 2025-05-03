package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            if (user.getPassword() == null || user.getRepeatPassword() == null) {
                throw new PasswordValidationException("Your passwords are incorrect. Try again.");
            } else if (user.getPassword() != null || user.getRepeatPassword() != null) {
                passwordValidator.validate(user.getPassword(),
                        user.getRepeatPassword());
                saveUser(user);
            }
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString()
                + " was saved to database!!!");
    }
}
