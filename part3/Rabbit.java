package part3;

public class Rabbit implements Objects {

    private final Form form;

    @Override
    public void walk() {
        System.out.println("깡총 깡총 걷습니다.");
    }

    @Override
    public void printForm() {
        form.printFrom();
    }

    public Rabbit(Form form) {
        this.form = form;
    }
}
