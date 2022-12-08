package core.basesyntax;

import java.io.IOException;

public class UserService {
    public void registerUser(User user)  {
        //write your code here
        try {
            new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            throw new RuntimeException(e + "Your passwords are incorrect. Try again.");
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
