package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            PasswordValidator validator = new PasswordValidator();
            String str1 = user.getPassword();
            String str2 = user.getRepeatPassword();
            validator.validate(str1, str2);
            UserService service = new UserService();
            service.saveUser(user);
        } catch (PasswordValidationException a) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser (User user){
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
