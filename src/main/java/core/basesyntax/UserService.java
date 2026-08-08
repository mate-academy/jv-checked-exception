package core.basesyntax;

public class UserService {
    public void registerUser(User user) {

        PasswordValidator passwordValidEx = new PasswordValidator();
        if (user.getPassword().equals(user.getRepeatPassword())) {
            try {
                User user1 = new User(user.getEmail(),
                        user.getPassword(), user.getRepeatPassword());
                passwordValidEx.validate(user.getPassword(), user.getRepeatPassword());
                saveUser(user1);
            } catch (PasswordValidationException e) {
                System.out.println("Your passwords are incorrect. Try again.");
            }
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}

