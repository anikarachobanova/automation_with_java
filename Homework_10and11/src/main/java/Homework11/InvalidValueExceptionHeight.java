package Homework11;

public class InvalidValueExceptionHeight extends Exception{
    public InvalidValueExceptionHeight(String message) {
        super(message);
    }

    public InvalidValueExceptionHeight(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public InvalidValueExceptionHeight(Throwable cause) {
        super(cause);
    }

    public InvalidValueExceptionHeight(String message, Throwable cause) {
        super(message, cause);
    }
}
