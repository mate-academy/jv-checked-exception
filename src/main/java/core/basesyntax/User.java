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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    @Override
    public String toString() {
        return "User{"
            + "email='" + email + '\''
            + ", password='" + password + '\''
            + ", repeatPassword='" + repeatPassword + '\''
            + '}';
    }
}
