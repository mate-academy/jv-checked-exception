package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public void registerUser(User user) {
        try {
            PasswordValidator.validate(user.getEmail(), user.getPassword(),
                    user.getRepeatPassword());
            saveUser(user);
            System.out.println("User " + user.toString() + " was saved to database!!!");
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        try {
            PasswordValidator.validate(user.getEmail(), user.getPassword(),
                    user.getRepeatPassword());
            userList.add(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}
