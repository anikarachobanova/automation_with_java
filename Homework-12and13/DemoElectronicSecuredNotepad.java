public class DemoElectronicSecuredNotepad {
    public static void main(String[] args) {
        ElectronicSecuredNotepad electronic = new ElectronicSecuredNotepad("0000");
        electronic.createPage("New page tittle", "New text on the page");
        electronic.createPage("New page tittle:version2", "New text on the page:version2");
        electronic.createPage("New page tittle:version3", "New text on the page:version3");
        electronic.previewAllPages();
        System.out.println("----------------------------------");

        try {
            electronic.replaceText(2,"This is some new text bla bla bla..");
        } catch (NoPageFoundException e) {
            e.printStackTrace();
        }

        electronic.previewAllPages();
        System.out.println("----------------------------------");
        try {
            electronic.deleteText(2);
        } catch (NoPageFoundException e) {
            e.printStackTrace();
        }
        electronic.previewAllPages();
        System.out.println("-----------------------------");
        electronic.stop();
    }
}
