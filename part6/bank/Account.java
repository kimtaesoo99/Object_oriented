package part6.bank;

import java.util.UUID;

public class Account {

    private final String AccountId;
    private int money;

    public Account(int money) {
        AccountId = UUID.randomUUID().toString().substring(0, 12);
        this.money = money;
    }

    public void saveMoney(int money) {
        this.money += money;
    }

    public int moneyOfRate(int rate) {
        return money * rate / 100;
    }
}
