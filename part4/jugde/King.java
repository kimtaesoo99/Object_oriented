package part4.jugde;

import part4.rabbit.Rabbit;
import part4.witness.Witness;

public class King extends JudgeImpl {

    @Override
    public Witness callByWitness(Rabbit rabbit, String input) {
        act();
        return super.callByWitness(rabbit, input);
    }

    private void act() {
        System.out.print("왕관을 만지면서..");
    }
}
