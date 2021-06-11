package practic.exception;

public class HumanException extends Exception{
    public HumanException() {
    }

    public HumanException(String message) {
        super(message);
    }

    public HumanException(String message, Throwable cause) {
        super(message, cause);
    }

    public HumanException(Throwable cause) {
        super(cause);
    }

    public HumanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
