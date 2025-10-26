package core.basesyntax;

public class UserService {

    public void registerUser(User user) {
        boolean exception = false;
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            exception = true;
        }
        if (!exception) {
            saveUser(user);
        } else {
            System.out.println("Your passwords are incorrect. Try again.");
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
