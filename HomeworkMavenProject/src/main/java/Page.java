/**
 * This class presents page fields and methods
 */
public class Page {
    private String title;
    private String text;
    private int pageNumber;

    public Page(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public Page(String title, String text, int pageNumber) {
        this(title, text);
        this.pageNumber = pageNumber;
    }

    /**
     * Get the page number
     * @return the method returns the page number as integer
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * This method adds text
     * @param text in this params pass the text as a String
     */
    public void addText(String text) {
        this.text = this.text + text;
    }

    /**
     * This method deletes the text from the page
     */
    public void deleteAllText() {
        this.text = "";
    }

    /**
     * This method shows the page number, title and the text of the page
     * @return this method returns String representation for the page number, title and text in the page
     */
    public String viewPage() {
        return this.pageNumber + " " + this.title + "\n" + this.text;
    }
}
