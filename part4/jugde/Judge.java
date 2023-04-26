package part4.jugde;

import part4.rabbit.Rabbit;
import part4.witness.Witness;

public interface Judge {

     void start();

    Witness callByWitness(Rabbit rabbit, String input);

    void askForTestimony(Witness witness);

    void end();
}
