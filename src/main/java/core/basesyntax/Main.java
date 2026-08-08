package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        String testEmail = "iwetjte24@gmail.com";
        String testPassword = "wetwt12weqw";
        String testRepeatPassword = "wetwt12weqw";
        User testUser = new User(testEmail, testPassword, testRepeatPassword);
        UserService testUserService = new UserService();
        testUserService.registerUser(testUser);
    }

}
