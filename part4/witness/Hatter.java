package part4.witness;

public class Hatter implements Witness{

    @Override
    public void testify() {
        System.out.println("범인은 하트문양 트럼프입니다.");
    }
}
