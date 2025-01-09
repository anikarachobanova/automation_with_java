public class Demo {
    public static void main(String[] args) {
        Notepad secured = new SecuredNotepad("123");
        secured.createPage("Title1", "Text1");
        secured.createPage("Title2", "Text2");
        secured.createPage("Title3", "Text3");
        secured.createPage("Title4", "Text4");
        secured.previewAllPages();
        System.out.println("----------------------------");
        try {
            secured.replaceText(3, "NovTextReplaced3");
        } catch (NoPageFoundException e) {
            e.printStackTrace();
        }
        secured.previewAllPages();
        System.out.println("----------------------------");
        try {
            secured.deleteText(2);
        } catch (NoPageFoundException e) {
            e.printStackTrace();
        }
        secured.previewAllPages();
        System.out.println("----------------------------");


//        Notepad simple = new SimpleNotepad();
//        simple.createPage("Title1", "Text1");
//        simple.createPage("Title2", "Text2");
//        simple.createPage("Title3", "Text3");
//        simple.createPage("Title4", "Text4");
//        simple.previewAllPages();
//        System.out.println("----------------------------");
//        try {
//            simple.replaceText(3, "NovTextReplaced3");
//        } catch (NoPageFoundException e) {
//            e.printStackTrace();
//        }
//        simple.previewAllPages();
//        System.out.println("----------------------------");
//        try {
//            simple.deleteText(2);
//        } catch (NoPageFoundException e) {
//            e.printStackTrace();
//        }
//        simple.previewAllPages();
//        System.out.println("----------------------------");


    }
}
