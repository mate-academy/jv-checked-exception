package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        //write your code here
        boolean validate = false;
        try {
            validate = new PasswordValidator().validate(user.getPassword(),
                    user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            throw new RuntimeException(e);
        }
        if (validate) {
            saveUser(user);
        } else {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
