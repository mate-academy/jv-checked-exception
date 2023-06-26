package core.basesyntax;

public class UserService {
    private PasswordValidator pV;

    public UserService() {
        this.pV = new PasswordValidator();
    }

    public void registerUser(User user) {
        try {
            pV.validate(user.getPassword(),
                    user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
