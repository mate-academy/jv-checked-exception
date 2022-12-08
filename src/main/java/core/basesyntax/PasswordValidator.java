package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        //write your code here


        try {
            if ((password.toCharArray().length >= 10 && repeatPassword.toCharArray().length >= 10) && password.equals(repeatPassword)) {
                System.out.println(true);
            } else {
                throw new PasswordValidationException("Wrong passwords ");

            }
        } catch (PasswordValidationException e) {
            throw new RuntimeException(e);
        }
    }


}
}
