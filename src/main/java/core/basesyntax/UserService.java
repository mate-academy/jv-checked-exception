package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();
    private final UserDao userDao = new UserDao();

    public void registerUser(User user) {
        try {
            String email = user.getEmail();
            String password = user.getPassword();
            String repeatPassword = user.getRepeatPassword();
            passwordValidator.validate(password, repeatPassword);
            userDao.saveUser(user);//write your code here
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}
