/**
 * This class extends Exception, and it is used to throw exception (checked) when the defined page number is not found or does not exist.
 */
public class NoPageFoundException extends Exception {
    public NoPageFoundException() {
    }

    /**
     * Throws checked exception with message
     * @param message
     */
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
