package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            PasswordValidator validator = new PasswordValidator();
            validator.validate(user.getPassword(), user.getRepeatPassword());

            if (user.getPassword().equals(user.getRepeatPassword())) {
                saveUser(user);
            }
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
