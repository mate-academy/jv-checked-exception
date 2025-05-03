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
        userService = new UserService(new UserRepository());
        passwordValidator = new PasswordValidator();
    }

    @Before
    public void beforeTest() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void afterTest() {
        System.setOut(originalOut);
        outContent.reset();
    }

    @Test
    public void registerUser_nullUsernameTest() {
        userService.registerUser(null, "Password123", "Password123");
        String actualMessage = outContent.toString().trim();
        String expectedResult = "Error: Username cannot be null or empty. Please try again.";
        Assert.assertEquals("Null username should print an error message.", expectedResult, actualMessage);
    }

    @Test
    public void registerUser_nullRepeatPasswordTest() {
        userService.registerUser("email@email", "Password123", null);
        String actualMessage = outContent.toString().trim();
        String expectedResult = "Error: Passwords cannot be null. Please try again.";
        Assert.assertEquals("Null repeat password should print an error message.", expectedResult, actualMessage);
    }

    @Test
    public void registerUser_validInputTest() {
        userService.registerUser("email@email", "Password#123", "Password#123");
        String actualMessage = outContent.toString().trim();
        String expectedResult = "Success: User email@email was successfully saved to the database!";
        Assert.assertEquals("User should be saved when inputs are valid.", expectedResult, actualMessage);
    }

    @Test
    public void registerUser_incorrectPasswordTest() {
        userService.registerUser("email@email", "123", "123");
        String actualMessage = outContent.toString().trim();
        String expectedResult = "Error: Password must be at least 8 characters long.";
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
            Assert.assertEquals("Passwords do not match.", e.getMessage());
        }
    }

    @Test
    public void registerUser_nullInputsTest() {
        userService.registerUser(null, "Password123", "Password123");
        String actualMessage = outContent.toString().trim();
        String expectedResult = "Error: Username cannot be null or empty. Please try again.";
        Assert.assertEquals("Null inputs should print an error message.", expectedResult, actualMessage);
    }

    @Test
    public void passwordValidator_throwsExceptionForShortPasswords() {
        try {
            passwordValidator.validate("short", "short");  // Short password
            Assert.fail("PasswordValidator should throw PasswordValidationException for short passwords.");
        } catch (PasswordValidationException e) {
            Assert.assertEquals("Password must be at least 8 characters long.", e.getMessage());
        }
    }

    private Method getRegisterMethod() {
        return Arrays.stream(UserService.class.getDeclaredMethods())
                .filter(m -> m.getName().equals("registerUser"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Method registerUser() should be present in UserService class."));
    }
}