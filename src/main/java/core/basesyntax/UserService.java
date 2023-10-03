package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            PasswordValidator validator = new PasswordValidator();
            String userPassword = user.getPassword();
            String userRepeatPassword = user.getRepeatPassword();
            validator.validate(userPassword, userRepeatPassword);
            UserService service = new UserService();
            service.saveUser(user);
        } catch (PasswordValidationException a) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
