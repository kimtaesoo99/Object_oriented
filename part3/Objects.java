package part3;

@FunctionalInterface
public interface Objects {

    void printForm();

    default void walk() {
        System.out.println("걸을 수 없습니다.");
    }
}
