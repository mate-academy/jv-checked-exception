package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        //write your code here
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.
                validate(user.getPassword(),
                        user.getRepeatPassword()); // Нужно обработать ошибку!!
        saveUser(user);

    }

    public void saveUser(User user){
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
