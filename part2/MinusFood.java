package part2;


public class MinusFood extends FoodImpl{

    private static MinusFood minusFood;

    public static MinusFood getInstance(int count) {
        if (minusFood == null) {
            minusFood = new MinusFood(count);
        }
        return minusFood;
    }

    private MinusFood(int count) {
        this.count = count;
    }

    @Override
    public boolean isPlus() {
        return false;
    }
}
