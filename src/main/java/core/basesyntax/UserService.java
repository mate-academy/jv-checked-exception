package core.basesyntax;

public class UserService {

    private PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {

        if (user == null || passwordValidator == null) {

            throw new NullPointerException("Not found user or passwordValidator");
        }
        try {
            if (passwordValidator.validate(user.getPassword(), user.getRepeatPassword())) {
                saveUser(user);
            }

        } catch (PasswordValidationException e) {

            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to data base!!!");
    }
}
