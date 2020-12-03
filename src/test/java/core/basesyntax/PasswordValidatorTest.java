package core.basesyntax;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PasswordValidatorTest {
    private static final String EXCEPTION_NAME =
            "core.basesyntax.exception.PasswordValidationException";

    private static PasswordValidator passwordValidator;

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @BeforeClass
    public static void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void passwordValidate_exceptionClassExists() {
        try {
            Class.forName(EXCEPTION_NAME);
        } catch (ClassNotFoundException e) {
            Assert.fail("Should create a class called 'PasswordValidationException'.");
        }
    }

    @Test
    public void passwordValidate_exceptionExpected() throws Exception {
        try {
            Class<?> exceptionClass = Class.forName(EXCEPTION_NAME);
            expectedEx.expect((Class<? extends Exception>) exceptionClass);
            expectedEx.expectMessage("Wrong passwords");
            User user = new User("login@email", "Test_1233", "Test_12345");
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (ClassNotFoundException e) {
            Assert.fail("Should create a class called 'UserNotFoundException'.");
        }
    }

    @Test
    public void passwordValidate_throwsExceptionExpected() {
        Class<?>[] exceptionTypes = getValidateMethod().getExceptionTypes();
        Assert.assertTrue("Add an exception to the signature of method validate()",
                exceptionTypes.length != 0);

        Assert.assertEquals("You should throws only one exception at signature of the " +
                "method validate()", 1, exceptionTypes.length);

        Assert.assertEquals("You should add your exception to signature of method validate()",
                EXCEPTION_NAME, exceptionTypes[0].getName());
    }

    @Test
    public void passwordValidate_correctInputData() {
        User user = new User("login@email", "Test_12345", "Test_12345");
        try {
            boolean result = passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            Assert.assertTrue(result);
        } catch (Exception e) {
            Assert.fail("Checking of passwords doesn't work correct! " +
                    "\nreceived exception while testing valid input");
        }
    }

    @Test
    public void passwordValidate_incorrectInputData() {
        User user = new User("login@email", "test_12345", "Test_12345");
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            Assert.fail("Validation shouldn't return true for parameters: password - "
                    + user.getPassword() + " and repeatPassword - " + user.getRepeatPassword());
        } catch (Exception ignored) {
        }
    }

    @Test
    public void passwordValidate_shortInputData() {
        User user = new User("login@email", "1111", "1111");
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            Assert.fail("Validation shouldn't return true for parameters: password - "
                    + user.getPassword() + " and repeatPassword - " + user.getRepeatPassword());
        } catch (Exception ignored) {
        }
    }

    @Test
    public void passwordValidate_emptyInputData() {
        User user = new User("login@email", "", "");
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            Assert.fail("Validation shouldn't return true for empty input data");
        } catch (Exception ignored) {
        }
    }

    @Test
    public void passwordValidate_nullInputData() {
        User user = new User("login@email", null, null);
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            Assert.fail("Validation shouldn't return true for null input data");
        } catch (NullPointerException e) {
            Assert.fail("Validation shouldn't return true for parameters: password - "
                    + user.getPassword() + " and repeatPassword - " + user.getRepeatPassword());
        } catch (Exception ignored) {
        }
    }

    private Method getValidateMethod() {
        return Arrays.stream(PasswordValidator.class.getDeclaredMethods())
                .filter(m -> m.getName().equals("validate"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Method validate() should be present " +
                        "in the PasswordValidator.class"));
    }
}
