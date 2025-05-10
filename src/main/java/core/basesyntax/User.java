//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

public class User {
    private final String email;
    private final String password;
    private final String repeatPassword;

    public User(String email, String password, String repeatPassword) {
        this.email = email;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRepeatPassword() {
        return this.repeatPassword;
    }

    public String toString() {
        return "User{email='" + this.email + "'}";
    }
}
