package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws Exception {
        try {

            if (password.length() >= 10 && repeatPassword.length() >= 10

                    && password.length() == repeatPassword.length()) {

                System.out.println("Right password");

            }

        } catch (Exception e) {

            if (password.length() < 10 && repeatPassword.length() < 10

                    && password.length() != repeatPassword.length()) {

                throw new Exception("Wrong password");

            }
        }
    }

}