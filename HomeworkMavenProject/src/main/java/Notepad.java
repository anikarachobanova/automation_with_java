/**
 * Interface for Notepad
 */
public interface Notepad {
    /**
     * This method create new page in the Notepad as passing params title and text
     * @param title defines the page title
     * @param text defines the text on the page
     */
    void createPage(String title, String text);

    /**
     * This method replace the whole text from the given page number. It throws an exception if occurs when calling the method (checked exception)
     * @param pageNumber defines which specific page will be affected.
     * @param text defines the new text
     * @throws NoPageFoundException throws an exception (checked exception) if the passed page number does not exist, or it is not found.
     */
    void replaceText(int pageNumber, String text) throws NoPageFoundException;

    /**
     * This method deletes the whole text from defined page number.
     * @param pageNumber defines the page number where text to be deleted.
     * @throws NoPageFoundException throws an exception (checked exception) if the passed page number does not exist,or it is not found.
     */
    void deleteText(int pageNumber) throws NoPageFoundException;

    /**
     * This method prints preview of all pages.
     */
    void previewAllPages();
}
