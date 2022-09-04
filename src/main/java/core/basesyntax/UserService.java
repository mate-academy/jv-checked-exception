package core.basesyntax;

public class UserService {
    public void registerUser(User user) {

        if (user != null) {
            PasswordValidator passwordValidator = new PasswordValidator();
            try {
                passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
                saveUser(user);
            } catch (PasswordValidationException e) {
                System.out.println("Pleace! Try Again " + e);
            }
        }
    }

    public void saveUser(User user) {

        System.out.println("User " + user.toString() + " was saved to database!!!");
    }


}
