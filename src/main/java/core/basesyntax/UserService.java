package core.basesyntax;

public class UserService {

    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
         try{
             passwordValidator.validate("Password#123", "Password#123");
             saveUser(new User("email@email","Password#123", "Password#123"));
         } catch (PasswordValidationException e) {
             System.out.println("Your passwords are incorrect. Try again.");
         }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
