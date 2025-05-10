package core.basesyntax;

public class User {
    private String email;
    private String password;
    private String repeatPassword;

    public User(String email, String password, String repeatPassword) {
        this.email = email;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        if (password != null) {
            return password;
        }
        return "";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        if (repeatPassword != null) {
            return repeatPassword;
        }
        return "";
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
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
