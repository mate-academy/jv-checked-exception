package core.basesyntax;

import java.sql.SQLOutput;

public class UserService {
    public void registerUser(User user){
        PasswordValidator passwordValidator = new PasswordValidator();

        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again." + e);
        }

    }

    public void saveUser(User user){
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
