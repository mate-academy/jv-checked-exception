package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        String userPassword = user.getPassword();
        String userRepeatPassword = user.getRepeatPassword();

        try {
            new PasswordValidator().validate(userPassword, userRepeatPassword);
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
