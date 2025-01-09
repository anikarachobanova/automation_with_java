/**
 * This class represents electronic secured notepad.
 * This class extends SecuredNotepad and implements interface IElectronicDevice.
 * Each method invokes the related super method from the parent class.
 */

public class ElectronicSecuredNotepad extends SecuredNotepad implements ElectronicDevice {

    private boolean isStarted;

    public ElectronicSecuredNotepad(String password) {
        super(password);
        this.start();
    }

    /**
     * This method starts the electronic secured notepad
     */
    @Override
    public void start() {
        isStarted = true;
        System.out.println("Device is started successfully!");

    }

    /**
     * This method stops the electronic secured notepad
     */
    @Override
    public void stop() {
        isStarted = false;
        System.out.println("Device has been stopped!");

    }

    /**
     * This method checks if the device is started or not.
     * @return the method returns boolean
     */
    @Override
    public boolean isStarted() {
        return isStarted;
    }

    /**
     * This method create new page with title and text.
     * First it checks if the device is started. If true then the method invokes the super method from the parent class.
     * @param title defines the page title
     * @param text defines the page text
     */
    @Override
    public void createPage(String title, String text) {
        if (isStarted) {
            super.createPage(title, text);
        }
        else System.out.println("Device is not started");
    }

    /**
     * This method replace the whole text in the given page number. It calls the super method from the parent class.
     * First it checks if the device is started. If it is true, then the method is executed.
     * @param pageNumber defines which specific page will be affected.
     * @param text defines the new text.
     * @throws NoPageFoundException this method can throw an exception (checked) if the defined page number is not found.
     */
    @Override
    public void replaceText(int pageNumber, String text) throws NoPageFoundException {
        if (isStarted) {
            super.replaceText(pageNumber, text);
        }
        else System.out.println("Device is not started");
    }

    /**
     * This method deletes the text from the defined page.
     * First, it checks if the device is started. If true invokes the related super method from the parent class.
     * @param pageNumber defines the page number where text to be deleted.
     * @throws NoPageFoundException it throws (checked) exception if the specified page number is not found.
     */
    @Override
    public void deleteText(int pageNumber) throws NoPageFoundException {
        if (isStarted) {
            super.deleteText(pageNumber);
        }
        else System.out.println("Device is not started");
    }

    /**
     * This method preview all pages from the notebook.
     * First, it checks if the device is started. If true invokes the related super method from the parent class.
     * The result is  printed in the console.
     */
    @Override
    public void previewAllPages() {
        if (isStarted) {
            super.previewAllPages();
        }
        else System.out.println("Device is not started");
    }
}
