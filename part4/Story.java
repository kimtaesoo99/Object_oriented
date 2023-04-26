package part4;

import part4.jugde.Judge;
import part4.jugde.JudgeType;
import part4.rabbit.Rabbit;
import part4.witness.Witness;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("판사를 선택하시오. [왕, 왕비] 중에 골라야한다.");

        Judge judge;
        while (true) {
            String input = sc.next();
            try {
                judge = JudgeType.getJudge(input);
                break;
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        judge.start();
        Witness witness;
        Rabbit rabbit = new Rabbit();
        while (true) {
            System.out.println("증인을 선택하시오. [모자장수, 엘리스, 요리사] 없을시 종료를 입력하시오.");
            String input = sc.next();
            if (input.equals("종료")) {
                break;
            }
            try {
                witness = judge.callByWitness(rabbit, input);
                judge.askForTestimony(witness);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
        judge.end();
    }
}
