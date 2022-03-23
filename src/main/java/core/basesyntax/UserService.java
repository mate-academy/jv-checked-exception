package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
            System.out.println("User " + user + " was saved to database!!!");
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}
