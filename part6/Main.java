package part6;

import part6.bank.Account;
import part6.bank.Bank;
import part6.interest.Interest;
import part6.interest.InterestFactory;
import part6.interest.InterestRate;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = getBank();
        Account account = getAccount(bank);
        InterestRate interestRate = getInterestRate();
        Interest interest = getInterest(interestRate, account);
        System.out.println("예상 이자는 " + interest.getAmount() + "입니다.");
    }

    private static Bank getBank() {
        System.out.println("은행 이름을 입력");
        return new Bank(sc.next());
    }

    private static Account getAccount(Bank bank) {
        System.out.println("저축할 돈을 입력");
        return bank.createAccount(sc.nextInt());
    }

    private static InterestRate getInterestRate() {
        System.out.println("적금을 선택 [SIMPLE, COMPLEX]");
        InterestFactory interestFactory = new InterestFactory();
        return interestFactory.createInterest(sc.next());
    }

    private static Interest getInterest(InterestRate interestRate, Account account) {
        System.out.println("저축할 기간을 입력");
        return interestRate.createInterest(account, sc.nextInt());
    }
}
