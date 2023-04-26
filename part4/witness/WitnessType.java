package part4.witness;

import java.util.Arrays;

public enum WitnessType {

    HATTER("모자장수", false) {
        Witness getWitness() {
            return new Hatter();
        }
    },
    ALICE("엘리스", false) {
        Witness getWitness() {
            return new Alice();
        }
    },
    CHEF("요리사", false) {
        Witness getWitness() {
            return new Chef();
        }
    };

    final String witness;
    boolean visited;

    WitnessType(String witness, boolean visited) {
        this.witness = witness;
        this.visited = visited;
    }

    public static boolean isCorrectWitness(String input) {
        return Arrays.stream(WitnessType.values())
            .filter(i -> !i.visited)
            .anyMatch(name -> name.witness.equals(input));
    }

    public static Witness getWitness(String input) {
        visit(input);
        return Arrays.stream(WitnessType.values())
            .filter(name -> name.witness.equals(input))
            .findFirst().orElseThrow(IllegalAccessError::new).getWitness();
    }

    Witness getWitness() {
        return null;
    }

    private static void visit(String input) {
        Arrays.stream(WitnessType.values())
            .filter(n -> n.witness.equals(input))
            .forEach(i -> i.visited = true);
    }
}
