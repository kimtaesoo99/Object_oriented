package part6.interest;

import part6.bank.Account;

public class ComplexInterestRate extends InterestRate {

    @Override
    public Interest createInterest(Account account, int duration) {
        int rate = getRate(duration);
        return new Interest(account.moneyOfRate(rate));
    }

    private int getRate(int duration) {
        if (duration > 180) {
            return 4;
        }
        if (duration > 100) {
            return 2;
        }
        return 1;
    }
}
