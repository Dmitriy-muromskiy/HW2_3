public class Main {
    public static void main(String[] args) {

        try {
            checkCredentials("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.println("Credentials are valid");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("[a-zA-Z0-9_]{1,20}")) {
            throw new WrongLoginException("Login is invalid");
        }

        if (!password.matches("[a-zA-Z0-9_]{1,20}") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password is invalid");
        }
    }
}


