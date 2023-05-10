package part6.interest;

import part6.bank.Account;

public class SimpleInterestRate extends InterestRate {

    @Override
    public Interest createInterest(Account account, int duration) {
        int rate = getRate(duration);
        return new Interest(account.moneyOfRate(rate));
    }

    private int getRate(int duration) {
        if (duration > 120) {
            return 3;
        }
        if (duration > 60) {
            return 2;
        }
        return 1;
    }
}
