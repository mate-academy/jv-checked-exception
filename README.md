# jv-checked-core.basesyntax.exception

Let's help user to register :)

We should implement the methods:
- `registerUser()` in UserService class
- `validate()` in PasswordValidator class

Method `validate()` should compare the `password` with `repeatPassword` and check if their length 
is more or equal to 10. If not, throw core.basesyntax.exception `core.basesyntax.PasswordValidator.PasswordValidationException` with message "Wrong passwords"
(since it's our custom logic let's create our own, checked, core.basesyntax.exception in the separate package - `core.basesyntax.exception`).

Method `registerUser()` should call the method `validate()` and handle an core.basesyntax.exception. 
If everything is ok, save user to the database (use method `saveUser()`), 
if not, print the message "Your passwords are incorrect. Try again.".

### [Try to avoid these common mistakes while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/exceptions/password-validation)
