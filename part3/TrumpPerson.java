package part3;

public class TrumpPerson extends Trump {

    private final String pattern;

    public TrumpPerson(Form form, String pattern) {
        super(form);
        this.pattern = pattern;
    }

    public void printPattern() {
        System.out.println("문양은 " + pattern + "입니다");
    }

    @Override
    public void walk() {
        System.out.println("걸을때 마다 몸이 좌우로 펄럭입니다.");
    }
}
