/**
 * Interface for Electronic Device
 *
 *
 */
public interface ElectronicDevice {
    /**
     * This method starts an electronic device
     */
    void start ();

    /**
     * This method stops an electronic device
     */
    void stop ();

    /**
     * This method checks and returns if the device is started
     * @return boolean
     */
    boolean isStarted();

}
