package part4.rabbit;

import part4.witness.Witness;
import part4.witness.WitnessType;

public class Rabbit {

    public Witness come(String input) {
        System.out.println("증인은 들어오시오");
        validation(input);
        return WitnessType.getWitness(input);
    }

    private void validation(String input) {
        if (!WitnessType.isCorrectWitness(input)) {
            throw new IllegalStateException("잘못된 증인입니다.");
        }
    }
}
