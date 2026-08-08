package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        if (user == null) {
            return;
        }
        String firstPass = user.getPassword();
        String secondPass = user.getRepeatPassword();
        try {
            passwordValidator.validate(firstPass, secondPass);
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
