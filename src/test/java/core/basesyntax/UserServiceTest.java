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
    public void registerUser_correctInputData() {
        User user = new User("email@email", "Password#123", "Password#123");
        userService.registerUser(user);
        String actualMessage = outContent.toString().trim();
        String expectedResult = "User " + user.toString() + " was saved to database!!!";
        Assert.assertEquals("User " + user.toString() + " should be saved. " +
            "Let's call method saveUser()\n", expectedResult, actualMessage);
    }

    @Test
    public void registerUser_incorrectInputData() {
        User user = new User("email@email", "123", "123");
        userService.registerUser(user);
        String actualMessage = outContent.toString().trim();
        String expectedResult ="Your passwords are incorrect. Try again.";
        Assert.assertEquals("You should print message: \"" + expectedResult
            + "\" in catch block, after failed validation\n", expectedResult, actualMessage);
    }

    @Test
    public void registerUser_throwsException() {
        Class<?>[] exceptionTypes = getRegisterMethod().getExceptionTypes();
        Assert.assertEquals("Don't add exception to the signature of method registerUser(). " +
            "Let's use try-catch construction\n", 0, exceptionTypes.length);
    }

    private Method getRegisterMethod() {
        return Arrays.stream(UserService.class.getDeclaredMethods())
            .filter(m -> m.getName().equals("registerUser"))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Method registerUser() should be present " +
                "in the UserService class"));
    }

    @Test
    public void passwordValidate_exceptionClassHasConstructor() {
        boolean isInputParamPresent =
            Arrays.stream(PasswordValidationException.class.getConstructors())
                .flatMap(c -> Arrays.stream(c.getParameterTypes()))
                .anyMatch(t -> t.equals(String.class));
        Assert.assertEquals("Don't hardcode the message in the exception class, "
            + "you should have constructor with message\n", true, isInputParamPresent);
    }

    @Test
    public void passwordValidate_exceptionClassIsChecked() {
        try {
            User user = new User("login@email", "Test_1233", "Test_12345");
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (RuntimeException e) {
            Assert.assertEquals("You should create a checked exception 'PasswordValidationException'\n", true, false);
        } catch (Exception ignored) {
        }
    }

    @Test
    public void passwordValidate_exceptionExpected() throws Exception {
        try {
            User user = new User("login@email", "Test_1233", "Test_12345");
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (Exception e) {
            Assert.assertEquals("Your exception should have a message \"Wrong passwords\"\n",
                "Wrong passwords", e.getMessage());
        }
    }

    @Test
    public void passwordValidate_throwsExceptionExpected() {
        Class<?>[] exceptionTypes = getValidateMethod().getExceptionTypes();
        Assert.assertTrue("Add an exception to the signature of method validate()\n",
            exceptionTypes.length != 0);

        Assert.assertEquals("You should throw only one exception in signature of the " +
            "method validate()\n", 1, exceptionTypes.length);

        Assert.assertEquals("You should add your exception to signature of method validate()\n",
            "PasswordValidationException", exceptionTypes[0].getSimpleName());
    }

    private Method getValidateMethod() {
        return Arrays.stream(PasswordValidator.class.getDeclaredMethods())
            .filter(m -> m.getName().equals("validate"))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Method validate() should be present " +
                "in the PasswordValidator class"));
    }

    @Test
    public void passwordValidate_correctInputData() {
        User user = new User("login@email", "Test_12345", "Test_12345");
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (Exception e) {
            Assert.assertEquals("Checking of passwords doesn't work correctly! " +
                "We got exception while testing a valid input\n", true, false);
        }
    }

    @Test
    public void passwordValidate_incorrectInputData() {
        User user = new User("login@email", "test_12345", "Test_12345");
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            Assert.assertEquals("Validation should throw PasswordValidationException for parameters: "
                + "password - " + user.getPassword()
                + " and repeatPassword - " + user.getRepeatPassword() + "\n", true, false);
        } catch (Exception ignored) {
        }
    }

    @Test
    public void passwordValidate_shortInputData() {
        User user = new User("login@email", "1111", "1111");
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            Assert.assertEquals("Validation should throw PasswordValidationException for parameters: "
                + "password - " + user.getPassword()
                + " and repeatPassword - " + user.getRepeatPassword() + "\n", true, false);
        } catch (Exception ignored) {
        }
    }

    @Test
    public void passwordValidate_emptyInputData() {
        User user = new User("login@email", "", "");
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            Assert.assertEquals("Validation should throw PasswordValidationException for empty input data\n",
                true, false);
        } catch (Exception ignored) {
        }
    }

    @Test
    public void passwordValidate_nullInputData() {
        User user = new User("login@email", null, null);
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            Assert.assertEquals("Validation should throw PasswordValidationException for null input data\n",
                true, false);
        } catch (NullPointerException e) {
            Assert.assertEquals("Validation shouldn't throw NullPointerException for parameters: password - "
                + user.getPassword() + " and repeatPassword - " + user.getRepeatPassword() + "\n", true, false);
        } catch (Exception ignored) {
        }
    }
}
