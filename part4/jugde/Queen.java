package part4.jugde;

import part4.rabbit.Rabbit;
import part4.witness.Witness;

public class Queen extends JudgeImpl {

    @Override
    public Witness callByWitness(Rabbit rabbit, String input) {
        act();
        return super.callByWitness(rabbit, input);
    }

    private void act() {
        System.out.println("기침을 하면서..");
    }
}
