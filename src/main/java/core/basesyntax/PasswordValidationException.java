//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

public class PasswordValidationException extends Exception {

    public PasswordValidationException() {
        super("Wrong passwords");
    }

    public PasswordValidationException(String msg) {
        super(msg);
    }
}