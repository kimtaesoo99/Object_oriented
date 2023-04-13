package part2;

public class PlusFood extends FoodImpl{

    private static PlusFood plusFood;


    public static PlusFood getInstance(int count) {
        if (plusFood == null) {
            plusFood = new PlusFood(count);
        }
        return plusFood;
    }

    private PlusFood(int count) {
        this.count = count;
    }
}
