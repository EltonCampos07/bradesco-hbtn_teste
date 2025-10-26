public class Pessoa {

    public static Boolean emailValid(String email) {
        return email.contains("@") && email.length() < 50;
    }
}
