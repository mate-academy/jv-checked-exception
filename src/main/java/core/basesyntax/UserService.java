package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        boolean validationSuccess = true;

        try {
            new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
            validationSuccess = false;
        }

        if (validationSuccess) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
