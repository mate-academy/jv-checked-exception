package core.basesyntax;

import java.io.IOException;

public class NonValidCaseException extends IOException {
    public NonValidCaseException() {
        System.out.println("Неправильний пароль! (не можна використовувати такі символи: \\\'\"@");
    }
}
