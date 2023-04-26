package part4;

import part4.jugde.Judge;
import part4.jugde.JudgeType;
import part4.rabbit.Rabbit;
import part4.witness.Witness;

import java.util.Scanner;

public class Story {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("판사를 선택하시오. [왕, 왕비] 중에 골라야한다.");
        Judge judge = getJudge();
        judge.start();
        Rabbit rabbit = new Rabbit();
        testify(judge, rabbit);
        judge.end();
    }

    private static Judge getJudge() {
        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            return JudgeType.getJudge(input);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            return getJudge();
        }
    }

    private static void testify(Judge judge, Rabbit rabbit) {
        while (true) {
            System.out.println("증인을 선택하시오. [모자장수, 엘리스, 요리사] 없을시 종료를 입력하시오.");
            String input = sc.next();
            if (input.equals("종료")) {
                return;
            }
            try {
                Witness witness = judge.callByWitness(rabbit, input);
                judge.askForTestimony(witness);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
