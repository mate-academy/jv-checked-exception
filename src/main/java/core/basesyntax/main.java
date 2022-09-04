package core.basesyntax;

public class main {
    public static void main(String[] args) throws PasswordValidationException {

        User vlad = new User("qwert@.usa","12345678910","12345678910");
        UserService userService = new UserService();
        userService.registerUser(vlad);


    }
}
