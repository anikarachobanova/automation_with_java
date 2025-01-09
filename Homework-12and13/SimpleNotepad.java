import java.util.ArrayList;
import java.util.List;

public class SimpleNotepad implements Notepad {
    private List<Page> pages;

    public SimpleNotepad() {
        this.pages = new ArrayList<>();
    }

    @Override
    public void createPage(String title, String text) {
        Page currentPage = new Page(title, text, this.pages.size() + 1);
        this.pages.add(currentPage);
    }

    private Page findPage(int pageNumber) throws NoPageFoundException {
        for (Page currentPage : pages) {
            if(currentPage.getPageNumber() == pageNumber) {
                return currentPage;
            }
        }
        throw new NoPageFoundException("Not found number: " + pageNumber);
    }


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

    @Override
    public void previewAllPages() {
        for (Page currentPage : pages) {
            System.out.println(currentPage.viewPage());
        }
    }
}
