package Homework11;

public class InvalidValueExceptionAge extends Exception {
    public InvalidValueExceptionAge(String message) {
        super(message);
    }

    public InvalidValueExceptionAge(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidValueExceptionAge(Throwable cause) {
        super(cause);
    }

    public InvalidValueExceptionAge(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
