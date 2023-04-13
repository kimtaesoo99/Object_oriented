package part1;

public class BaristaA implements Barista {

    @Override
    public String make(String order) {
        String result = makeCoffee(order);
        return result;
    }

    private String makeCoffee(String order) {
        if (order.equals("iceCoffee")) {
            return "iceCoffee";
        }
        if (order.equals("latte")) {
            return "latte";
        }
        throw new IllegalStateException("커피 제조의 책임을 다하지 못함");
    }
}
