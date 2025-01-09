import java.util.Scanner;

/**
 * This class represents secured notepad. It extends class SimpleNotepad with some extra methods.
 */

public class SecuredNotepad extends SimpleNotepad {
    private String password;

    public SecuredNotepad(String password) {
        this.password = password;
    }

    /**
     * This method is used only within the class. It checks if the entered password is correct and can proceed furthur with any operation.
     * @return the method returns boolean result.
     */
    private boolean checkPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password: ");
        String enteredPassword = scan.nextLine();
        if(enteredPassword.equals(this.password)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Wrong password!");
            return false;
        }
    }

    /**
     * This method creates new page in the secured notepad with defined page title and text.
     * It calls the super method from the parent class.
     * When calling the method checkPassword is invoked. If it is true, then the method is executed.
     * @param title passing the page title as String
     * @param text passing the page text as String
     */
    @Override
    public void createPage(String title, String text) {
        if (checkPassword()) {
            super.createPage(title, text);
            System.out.println("page created!");
        } else {
            System.out.println("createPage wont happen!");
        }
    }

    /**
     * This method replace the whole text from the given page number. It calls the super method from the parent class.
     * When calling the method checkPassword is invoked. If it is true, then the method is executed.
     * @param pageNumber defines which specific page will be affected.
     * @param text defines the new text.
     * @throws NoPageFoundException this method can throw an exception (checked) if the defined page number is not found.
     */
    @Override
    public void replaceText(int pageNumber, String text) throws NoPageFoundException {
        if (checkPassword()) {
            System.out.println("text replaced successfully on page: " + pageNumber);
            super.replaceText(pageNumber, text);
        } else {
            System.out.println("replaceText wont happen!");
        }
    }


    /**
     * This method deletes the text from the page. It calls the super method from the parent class.
     * When calling the method checkPassword is invoked. If it is true, then the method is executed.
     * @param pageNumber defines the page number where text to be deleted.
     * @throws NoPageFoundException this method can throw an exception (checked) if the defined page number is not found.
     */
    @Override
    public void deleteText(int pageNumber) throws NoPageFoundException {
        if (checkPassword()) {
            System.out.println("text deleted successfully on page: " + pageNumber);
            super.deleteText(pageNumber);
        } else {
            System.out.println("deleteText wont happen!");
        }
    }


    /**
     *This method preview all pages from the notebook.
     * When calling the method checkPassword is invoked. If it is true, then the method is executed.
     *It calls the super method from the parent class.
     *The result is  printed in the console.
     */
    @Override
    public void previewAllPages() {
        if (checkPassword()) {
            System.out.println("previewing all pages successfully");
            super.previewAllPages();
        } else {
            System.out.println("previewAllPages wont happen!");
        }
    }
}
