package exceptions;
public class EmptyLineException extends Exception {
    public EmptyLineException() {}

    public EmptyLineException(String message) {
        super(message);
    }
}
