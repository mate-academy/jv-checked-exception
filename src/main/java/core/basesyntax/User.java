package core.basesyntax;

public class User {
<<<<<<< HEAD
    private String username;
    private String password;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters
=======
    private String username; // New variable
    private String email;
    private String password;
    private String repeatPassword;

    public User(String username, String email, String password, String repeatPassword) {
        this.username = username; // Initialize username
        this.email = email;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

>>>>>>> b7aa0510f278fd26f19941ae5bccb5701fd917d8
    public String getUsername() {
        return username;
    }

<<<<<<< HEAD
=======
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

>>>>>>> b7aa0510f278fd26f19941ae5bccb5701fd917d8
    public String getPassword() {
        return password;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
    // toString method for logging and debugging purposes
    @Override
    public String toString() {
        return "User{username='" + username + "', password='" + password + "'}";
=======
    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
>>>>>>> b7aa0510f278fd26f19941ae5bccb5701fd917d8
    }

    @Override
    public String toString() {
        return "User{"
                + "username='" + username + '\'' // Include username in toString
                + ", email='" + email + '\''
                + ", password='" + password + '\''
                + ", repeatPassword='" + repeatPassword + '\''
                + '}';
    }
}