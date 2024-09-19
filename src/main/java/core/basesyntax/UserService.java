package core.basesyntax;

public class UserService {
    public void registerUser(User user) {

        PasswordValidator passwordValidator = new PasswordValidator();

        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationExeption e) {
            System.out.println("Unfortuntly something goes rong. "
                    + "Check if the emails are the same and have at least 10 characters");
            return;
        }

        saveUser(user);
    }

    public void saveUser(User user) {

        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
