package core.basesyntax;

import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UserServiceTest {
    private static UserService userService;
    private static PasswordValidator passwordValidator;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeClass
    public static void setUp() {
        userService = new UserService();
        passwordValidator = new PasswordValidator();
    }

    @Before
    public void beforeTest() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void afterTest() {
        outContent.reset();
        System.setOut(originalOut);
    }

    @Test
    public void registerUser_validInputTest() {
        userService.registerUser("email@email", "Password#123", "Password#123");
        String actualMessage = outContent.toString().trim();
        String expectedResult = "User User{username='email@email', password='Password#123'} was saved to database!!!";
        Assert.assertEquals("User should be saved when inputs are valid.", expectedResult, actualMessage);
    }

    @Test
    public void registerUser_incorrectPasswordTest() {
        userService.registerUser("email@email", "123", "123");
        String actualMessage = outContent.toString().trim();
        String expectedResult = "Your passwords are incorrect. Try again.";
        Assert.assertEquals("Incorrect passwords should print an error message.", expectedResult, actualMessage);
    }

    @Test
    public void registerUser_noExceptionInMethodSignature() {
        Class<?>[] exceptionTypes = getRegisterMethod().getExceptionTypes();
        Assert.assertEquals("Method registerUser() should not declare exceptions in its signature.", 0, exceptionTypes.length);
    }

    @Test
    public void passwordValidator_throwsExceptionForInvalidPasswords() {
        try {
            passwordValidator.validate("Password123", "WrongPassword123");  // Mismatched passwords
            Assert.fail("PasswordValidator should throw PasswordValidationException for mismatched passwords.");
        } catch (PasswordValidationException e) {
            Assert.assertEquals("Wrong passwords", e.getMessage());
        }
    }
    @Test
    public void passwordValidator_throwsExceptionForShortPasswords() {
        try {
            passwordValidator.validate("short", "short");  // Short password
            Assert.fail("PasswordValidator should throw PasswordValidationException for short passwords.");
        } catch (PasswordValidationException e) {
            Assert.assertEquals("Password is too short", e.getMessage());
        }
    }
    private Method getRegisterMethod() {
        return Arrays.stream(UserService.class.getDeclaredMethods())
                .filter(m -> m.getName().equals("registerUser"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Method registerUser() should be present in UserService class."));
    }
}