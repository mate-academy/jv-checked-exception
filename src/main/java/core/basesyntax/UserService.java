package core.basesyntax;

public class UserService {


    public void passwordValidate(String password, String repeatPassword)
            throws PasswordValidationException {

          if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null");
        }


        if (password.isEmpty() || repeatPassword.isEmpty()) {
            throw new PasswordValidationException("Passwords cannot be empty");
        }

        if (password.length() < 6) {
            throw new PasswordValidationException("Password is too short");
        }


        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Passwords do not match");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}


