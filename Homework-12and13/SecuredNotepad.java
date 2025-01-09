import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
    private String password;

    public SecuredNotepad(String password) {
        this.password = password;
    }

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

    @Override
    public void createPage(String title, String text) {
        if (checkPassword()) {
            super.createPage(title, text);
            System.out.println("page created!");
        } else {
            System.out.println("createPage wont happen!");
        }
    }

    @Override
    public void replaceText(int pageNumber, String text) throws NoPageFoundException {
        if (checkPassword()) {
            System.out.println("text replaced successfully on page: " + pageNumber);
            super.replaceText(pageNumber, text);
        } else {
            System.out.println("replaceText wont happen!");
        }
    }

    @Override
    public void deleteText(int pageNumber) throws NoPageFoundException {
        if (checkPassword()) {
            System.out.println("text deleted successfully on page: " + pageNumber);
            super.deleteText(pageNumber);
        } else {
            System.out.println("deleteText wont happen!");
        }
    }

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
