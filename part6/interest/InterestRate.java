package part6.interest;

import part6.bank.Account;

public abstract class InterestRate {

    public abstract Interest createInterest(Account account, int duration);
}
