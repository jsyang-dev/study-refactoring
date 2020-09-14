package replace_error_code_with_exception;

public class InvalidCommandException extends Exception {
    public InvalidCommandException() {
    }

    public InvalidCommandException(String message) {
        super(message);
    }
}
