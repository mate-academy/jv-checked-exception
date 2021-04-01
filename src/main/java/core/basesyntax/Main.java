package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User("email@email", null, null);
        UserService service = new UserService();
        service.registerUser(user);
    }
}
