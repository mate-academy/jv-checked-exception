# jv-checked-exception

-
---
Let's help user to register :)

We should implement the methods:

- `registerUser()` in UserService class.
- `validate()` in PasswordValidator class

Method `validate()` should compare the `password` with `repeatPassword` and check
if their length is more or equal to 10. If not, throw exception `PasswordValidationException`
with message "Wrong passwords" (since it's our custom logic, let's create our own, **CHECKED**, exception
because user can put any password and our service shouldn't be broken. We should handle not-valid case and return the understandable message).

Method `registerUser()` should call the method `validate()` and handle the exception.
If everything is ok, save user to the database (use method `saveUser()`),
if not, print the message "Your passwords are incorrect. Try again.".

#### [Try to avoid these common mistakes while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/exceptions/password-validation)
