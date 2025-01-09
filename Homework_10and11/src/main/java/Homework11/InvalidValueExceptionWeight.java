package Homework11;

public class InvalidValueExceptionWeight extends Exception{
    public InvalidValueExceptionWeight(String message) {
        super(message);
    }

    public InvalidValueExceptionWeight(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidValueExceptionWeight(Throwable cause) {
        super(cause);
    }

    public InvalidValueExceptionWeight(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
