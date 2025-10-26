import java.util.Objects;

public class Person {

    public static Boolean checkUser(String userName) {
        return Objects.nonNull(userName) &&
                userName.length() >= 8 &&
                userName.matches("^[A-Za-z0-9]+$");
    }

    public static Boolean checkPassword(String password) {
        return Objects.nonNull(password) &&
                password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$");
    }
}
