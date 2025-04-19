//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

public class PasswordValidator {
    public PasswordValidator() {
    }

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (!password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
