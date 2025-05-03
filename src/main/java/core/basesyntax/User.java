package core.basesyntax;

public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }


    public void setUsername() {
        setUsername(null);
    }
    public void setUsername() {
        this.username = "Guest";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
