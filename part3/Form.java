package part3;

public class Form {

    private final Shape shape;
    private final int size;

    public void printFrom() {
        System.out.println("형태는 :" + shape.info + " 크기는 " + size + "\n");
    }

    public Form(Shape shape, int size) {
        this.shape = shape;
        this.size = size;
    }
}
