package core.basesyntax;

public record User(String email, String password, String repeatPassword) {

    @Override
    public String toString() {
        return "User{"
                + "email='" + email + '\''
                + ", password='" + password + '\''
                + ", repeatPassword='" + repeatPassword + '\''
                + '}';
    }
}
