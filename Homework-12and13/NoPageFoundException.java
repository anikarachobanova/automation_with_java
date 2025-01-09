public class NoPageFoundException extends Exception {
    public NoPageFoundException() {
    }

    public NoPageFoundException(String message) {
        super(message);
    }

    public NoPageFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPageFoundException(Throwable cause) {
        super(cause);
    }

    public NoPageFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
