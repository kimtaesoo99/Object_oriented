package part6.bank;

public class Bank {

    private final String name;

    public Bank(String name) {
        this.name = name;
    }

    public Account createAccount(int money) {
        return new Account(money);
    }
}
