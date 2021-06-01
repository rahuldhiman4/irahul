package ExceptionsPack;

public class UserDefinedException extends Exception { //If you extends RuntimeException, it throws exception of type unchecked(Runtime) excep

    UserDefinedException() {
        super("User defined error message printed");
    }

    UserDefinedException(String msg) {
        super(msg);
    }
}