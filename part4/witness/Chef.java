package part4.witness;

public class Chef implements Witness{

    @Override
    public void testify() {
        System.out.println("저 말고 다른 사람에게 물어보세요..");
    }
}
