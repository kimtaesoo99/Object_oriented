
package part2;

public class Story {

    public static void main(String[] args) {

        Alice alice = Alice.getInstance(160, Location.CAVE);
        Door door = new Door(100);
        Food minusFood = MinusFood.getInstance(10);

        while (true) {
            print(alice, minusFood);
            if (door.isPass(alice.getHeight())){
                alice.move();
                System.out.println(Location.getName(alice.getLocation()));
                break;
            }
            alice.eat(minusFood);
        }
    }

    private static void print(Alice alice, Food minus) {
        System.out.println(alice.getHeight());
        System.out.println(Location.getName(alice.getLocation()));
        System.out.println(minus.getCount());
    }
}
