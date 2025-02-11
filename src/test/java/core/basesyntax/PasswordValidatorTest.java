package core.basesyntax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void validate_ShouldThrowException_WhenPasswordsDoNotMatch() {
        Exception exception = assertThrows(PasswordValidationException.class,
                () -> validator.validate("password123", "password321"));
        assertEquals("Passwords do not match.", exception.getMessage());
    }

    @Test
    void validate_ShouldThrowException_WhenPasswordIsTooShort() {
        Exception exception = assertThrows(PasswordValidationException.class,
                () -> validator.validate("short", "short"));
        assertEquals("Password must be at least 10 characters long.", exception.getMessage());
    }

    @Test
    void validate_ShouldNotThrowException_WhenPasswordsAreValid() {
        assertDoesNotThrow(() -> validator.validate("validPassword123", "validPassword123"));
    }
}
