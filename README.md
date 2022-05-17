# jv-checked-exception

---
Let's help user to register :)

We should implement the methods:

- `registerUser()` in UserService class
- `validate()` in PasswordValidator class

Method `validate()` should compare the `password` with `repeatPassword` and check
if their length is more or equal to 10. If not, throw exception `PasswordValidationException`
with message "Wrong passwords" (since it's our custom logic, let's create our own, **CHECKED**, exception
because user can put any password and our service shouldn't be broken. We should handle not-valid case and return the understandable message).

Method `registerUser()` should call the method `validate()` and handle the exception.
If everything is ok, save user to the database (use method `saveUser()`),
if not, print the message "Your passwords are incorrect. Try again.".

#### [Try to avoid these common mistakes while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/exceptions/password-validation)
vДавайте допоможемо користувачеві зареєструватися :)

Ми повинні впровадити методи:

- `registerUser()` у класі UserService
- `validate()` у класі PasswordValidator

Метод `validate()` повинен порівняти `password` з `repeatPassword` і перевірити
якщо їх довжина більша або дорівнює 10. Якщо ні, киньте виняток `PasswordValidationException`
з повідомленням "Неправильні паролі" (оскільки це наша користувальницька логіка, давайте створимо власний виняток **ПЕРЕВІРЕНО**
тому що користувач може ввести будь-який пароль, і наш сервіс не повинен бути зламаний. Ми повинні обробляти недійсний регістр і повертати зрозуміле повідомлення).

Метод `registerUser()` повинен викликати метод `validate()` і обробляти виняток.
Якщо все в порядку, збережіть користувача в базі даних (використовуйте метод `saveUser()`),
якщо ні, надрукуйте повідомлення «Ваші паролі неправильні. Спробуйте ще раз.».
