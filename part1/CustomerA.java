package part1;

import java.util.List;

public class CustomerA implements Customer{

    List<String> menu = List.of("iceCoffee","latte");

    private Cashier cashier;

    public CustomerA(Cashier cashier) {
        this.cashier = cashier;
    }

    @Override
    public void order(String order) {
        if (!menu.contains(order)){
            throw new IllegalStateException("커피 주문의 책임을 임하지 못하였습니다");
        }
        String result = cashier.callWithOrder(order);
        System.out.println(result);
    }
}
