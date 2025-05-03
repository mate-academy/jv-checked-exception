package core.basesyntax;

public class User {
    private String username;
    private String email;
    private String password;
    private String repeatPassword;

    // Constructor
    public User(String username, String email, String password, String repeatPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    // Getters
    public String getUsername() {
        return username;
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

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    // toString method for logging and debugging purposes
    @Override
    public String toString() {
        return "User{"
                + "username='" + username + '\''
                + ", email='" + email + '\''
                + ", password='" + password + '\''
                + ", repeatPassword='" + repeatPassword + '\''
                + '}';
    }

}
