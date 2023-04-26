package part4.jugde;

import part4.rabbit.Rabbit;
import part4.witness.Witness;

public class JudgeImpl implements Judge {

    @Override
    public void start() {
        System.out.println("재판을 시작합니다.");
    }

    @Override
    public Witness callByWitness(Rabbit rabbit, String input) {
        System.out.println("증인을 불러라");
        return rabbit.come(input);
    }

    @Override
    public void askForTestimony(Witness witness) {
        System.out.println("설명해보거라");
        witness.testify();
    }

    @Override
    public void end() {
        System.out.println("재판을 종료합니다.");
    }
}
