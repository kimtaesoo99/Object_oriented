package part2;

public class FoodImpl implements Food{

    int count;

    @Override
    public boolean isPlus() {
        return true;
    }

    @Override
    public void reduce() {
        validation();
        count--;
    }

    @Override
    public int getCount() {
        return count;
    }

    private void validation() {
        if (count == 0) {
            throw new IllegalStateException("전부 먹었습니다.");
        }
    }
}
