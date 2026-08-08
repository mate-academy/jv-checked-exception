package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            if (PasswordValidator.validate(user.getPassword(), user.getRepeatPassword())) {
                saveUser(user);
            }  else {
                System.out.println("Your passwords are incorrect. Try again.");
            }
        } catch (PasswordValidationException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void saveUser(User user){
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
