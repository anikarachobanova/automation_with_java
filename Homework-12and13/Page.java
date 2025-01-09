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

    public int getPageNumber() {
        return pageNumber;
    }

    public void addText(String text) {
        this.text = this.text + text;
    }

    public void deleteAllText() {
        this.text = "";
    }

    public String viewPage() {
        return this.pageNumber + " " + this.title + "\n" + this.text;
    }
}
