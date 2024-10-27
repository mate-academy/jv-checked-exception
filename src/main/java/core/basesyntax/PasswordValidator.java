package core.basesyntax;

public class PasswordValidator {
    private String message;

    public String getMessage() {
        return message;
    }

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        //write your code here
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        } else if ((password.length() < 10 && repeatPassword.length() < 10)
                || password != repeatPassword) {
            throw new PasswordValidationException("Wrong passwords");
        } else {
            this.message = "It`s okey";
        }
    }
}
