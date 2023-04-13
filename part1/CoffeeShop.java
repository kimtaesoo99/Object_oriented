package part1;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Barista baristaA = new BaristaA();
        Barista baristaB = new BaristaB();
        Cashier cashier = new CashierA(baristaB);
        Customer customer = new CustomerA(cashier);

        Scanner sc = new Scanner(System.in);

        //iceCoffee , latte
        String menu = sc.next();
        customer.order(menu);
    }
}
