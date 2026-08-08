package core.basesyntax;

public class User {
    private String login;
    private String password;
    private String repeatPassword;

    public User(String login, String password, String repeatPassword) {
        this.login = login;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}

