package core.basesyntax;

public class PasswordValidator {
    public void validate(String Password, String RepeatPassword)
            throws PasswordValidationException {

        if (Password == null && RepeatPassword == null
               || !Password.equals(RepeatPassword)
               || Password.length() < 10)  {
           throw new PasswordValidationException("Wrong passwords");
       }
    }
}
