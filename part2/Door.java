package part2;

public class Door {

    int height;

    public Door(int height) {
        this.height = height;
    }

    public boolean isPass(int height) {
        if (this.height >= height) {
           return true;
        }
        return false;
    }
}
