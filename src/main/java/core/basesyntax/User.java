package core.basesyntax;

public record User(String email, String password, String repeatPassword) {
    public User {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("incorrect email");
        }
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
