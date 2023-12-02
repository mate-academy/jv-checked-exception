package core.basesyntax;

//write your code here
public class PasswordValidationException extends Exception {

    public PasswordValidationException(String errorMessage) {
        super(errorMessage);
    }

    /*public void throwExeption(String s1, String s2) {
        if (!s1.equals(s2)
                && ((s1.isEmpty() || s1.length() > 10)
                || (s2.isEmpty() || s2.length() > 10))) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }*/
}
