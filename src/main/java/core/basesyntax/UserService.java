package core.basesyntax;

public class UserService {

    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        while (true) {
            try {
                passwordValidator.validate(user.getPassword(),user.getRepeatPassword());
            } catch (PasswordValidationException e) {
                e.printStackTrace();
                break;
            }
            saveUser(user);
            break;
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
