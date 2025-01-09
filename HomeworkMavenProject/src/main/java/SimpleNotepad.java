import java.util.ArrayList;
import java.util.List;

/**
 * This class represents simple notepad as list collection of pages. It implements user interface Notepad.
 */
public class SimpleNotepad implements Notepad {
    private List<Page> pages;

    public SimpleNotepad() {
        this.pages = new ArrayList<>();
    }

    /**
     * This method create new page in the notepad.
     * When invoking the method it sets the given title, text and page number.
     * @param title defines the page title.
     * @param text defines the text on the page.
     */
    @Override
    public void createPage(String title, String text) {
        Page currentPage = new Page(title, text, this.pages.size() + 1);
        this.pages.add(currentPage);
    }

    /**
     * This method finds specified page number. The method search for the defined page number in the list collection with pages. It can trow an exception (checked) if the page number is not found.
     * @param pageNumber this param accept integer for the searched page number
     * @return This method returns the found page.
     * @throws NoPageFoundException this method can throw an exception (checked) if the defined page number is not found.
     */
    private Page findPage(int pageNumber) throws NoPageFoundException {
        for (Page currentPage : pages) {
            if(currentPage.getPageNumber() == pageNumber) {
                return currentPage;
            }
        }
        throw new NoPageFoundException("Not found number: " + pageNumber);
    }


    /**
     * This method replace the whole text from the given page number. It searches through all list collection of pages and when find the desired page it replaces the text there with the passed text.
     * @param pageNumber defines which specific page will be affected.
     * @param text defines the new text.
     * @throws NoPageFoundException this method can throw an exception (checked) if the defined page number is not found.
     */
    @Override
    public void replaceText(int pageNumber, String text) throws NoPageFoundException {
        Page foundPage = findPage(pageNumber);
        foundPage.deleteAllText();
        foundPage.addText(text);

        // non-optimal way
//        for (Page currentPage : pages) {
//            if(currentPage.getPageNumber() == pageNumber) {
//                currentPage.deleteAllText();
//                currentPage.addText(text);
//                return;
//            }
//        }
//        throw new NoPageFoundException("Not found number: " + pageNumber);
    }

    /**
     * This method deletes the text from the page. It searches through all list collection of pages and when find the desired page it deletes the text from the page.
     * @param pageNumber defines the page number where text to be deleted.
     * @throws NoPageFoundException this method can throw an exception (checked) if the defined page number is not found.
     */
    @Override
    public void deleteText(int pageNumber) throws NoPageFoundException {
        Page foundPage = findPage(pageNumber);
        foundPage.deleteAllText();

        //non-optimal way
//        for (Page currentPage : pages) {
//            if(currentPage.getPageNumber() == pageNumber) {
//                currentPage.deleteAllText();
//                return;
//            }
//        }
//        throw new NoPageFoundException("Not found number: " + pageNumber);
    }

    /**
     * This method preview all pages from the notebook.
     * It goes through each page from the list collection with pages and, executes method viewPage() for each.
     * The result is  printed in the console.
     */
    @Override
    public void previewAllPages() {
        for (Page currentPage : pages) {
            System.out.println(currentPage.viewPage());
        }
    }
}
