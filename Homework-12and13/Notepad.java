public interface Notepad {
    void createPage(String title, String text);
    void replaceText(int pageNumber, String text) throws NoPageFoundException;
    void deleteText(int pageNumber) throws NoPageFoundException;
    void previewAllPages();
}
