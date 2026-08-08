package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        boolean status = true;
        if (user.getPassword() == null || user.getRepeatPassword() == null) {
            System.out.println("Enter correct password");
        }
        try {
            new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
        } catch (Exception e) {
            status = false;
            System.out.println("Your passwords are incorrect. Try again.");
        }
        if (status) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
