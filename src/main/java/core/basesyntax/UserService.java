//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public UserService() {
    }

    public void registerUser(User user) {
        try {
            this.passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            this.saveUser(user);
        } catch (PasswordValidationException var3) {
            System.out.println("Registration failed: " + var3.getMessage());
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
