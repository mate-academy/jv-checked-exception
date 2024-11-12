
public class PasswordValidator {
    public void validate(String password, String repeatPassword){
        if (password.length() < 10 || !password.equals(repeatPassword)) {
                    throw new PasswordValidationException("Неверные пароли");
                }
            }
        }

