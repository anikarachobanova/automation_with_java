public class ElectronicSecuredNotepad extends SecuredNotepad implements IЕlectronicDevice{

    private boolean isStarted;

    public ElectronicSecuredNotepad(String password) {
        super(password);
        this.start();
    }

    @Override
    public void start() {
        isStarted = true;
        System.out.println("Device is started successfully!");

    }

    @Override
    public void stop() {
        isStarted = false;
        System.out.println("Device has been stopped!");

    }

    @Override
    public boolean isStarted() {
        return isStarted;
    }

    @Override
    public void createPage(String title, String text) {
        if (isStarted) {
            super.createPage(title, text);
        }
        else System.out.println("Device is not started");
    }

    @Override
    public void replaceText(int pageNumber, String text) throws NoPageFoundException {
        if (isStarted) {
            super.replaceText(pageNumber, text);
        }
        else System.out.println("Device is not started");
    }

    @Override
    public void deleteText(int pageNumber) throws NoPageFoundException {
        if (isStarted) {
            super.deleteText(pageNumber);
        }
        else System.out.println("Device is not started");
    }

    @Override
    public void previewAllPages() {
        if (isStarted) {
            super.previewAllPages();
        }
        else System.out.println("Device is not started");
    }
}
