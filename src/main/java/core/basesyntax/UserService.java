package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(password, repeatPassword);
            saveUser(user);
        } catch(Exception e){
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user){
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
