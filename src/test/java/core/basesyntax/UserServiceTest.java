package core.basesyntax;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UserServiceTest {
    private static UserService userService;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeClass
    public static void setUp() {
        userService = new UserService();
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
    public void registerUser_correctInputData() {
        User user = new User("email@email", "Password#123", "Password#123");
        userService.registerUser(user);
        String actualMessage = outContent.toString().trim();
        String expectedResult = "User " + user.toString() + " was saved to database!!!";
        Assert.assertEquals("User " + user.toString() + " should be saved. " +
                "Let's call method saveUser()", expectedResult, actualMessage);
    }

    @Test
    public void registerUser_incorrectInputData() {
        User user = new User("email@email", "123", "123");
        userService.registerUser(user);
        String actualMessage = outContent.toString().trim();
        String expectedResult = "Your passwords are incorrect. Try again.";
        Assert.assertEquals("Should print message : \"" + expectedResult
                + "\" in catch block, after failed validation", expectedResult, actualMessage);
    }

    @Test
    public void registerUser_throwsException() {
        Class<?>[] exceptionTypes = getRegisterMethod().getExceptionTypes();
        Assert.assertEquals("Don't add core.basesyntax.exception to the signature of method registerUser(). " +
                "Let's use try-catch construction.", 0, exceptionTypes.length);
    }

    private Method getRegisterMethod() {
        return Arrays.stream(UserService.class.getDeclaredMethods())
                .filter(m -> m.getName().equals("registerUser"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Method registerUser() should be present " +
                        "in the UserService.class"));
    }
}
