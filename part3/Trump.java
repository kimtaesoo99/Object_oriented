package part3;

public class Trump implements Objects {

    private final Form form;

    private boolean isReverse;
    private boolean isKneelDown;


    public void reverse() {
        this.isReverse = !isReverse;
    }

    public void kneelDown() {
        this.isKneelDown = true;
    }

    public void sitUp() {
        this.isKneelDown = false;
    }

    public boolean isReverse(Status status) {
        return this.isReverse == status.nowStatus;
    }

    public boolean isKneelDown(Status status) {
        return this.isKneelDown == status.nowStatus;
    }

    @Override
    public void printForm() {
        form.printFrom();
    }

    public Trump(Form form) {
        this.form = form;
    }
}
