package Exceptions.CustomException;

public class UnauthorizedException extends Exception {

    public UnauthorizedException() {
    }

    public UnauthorizedException(String message) {
        super(message);
    }

    public static void main(String[] main) {
        UnauthorizedException un = new UnauthorizedException();

        try {
            un.login("user", "password");
        } catch (UnauthorizedException e) {
            System.out.println("You got the exception " + e.getMessage());
        }

    }

    public void login(String userName, String password) throws UnauthorizedException {
        if (userName.equals("user") && password.equals("pass")) {
            System.out.println("You can access the application");
        } else {
            //throw new UnauthorizedException();
            throw new UnauthorizedException("You do not have permission to hand this error");

        }
    }

}
