package part3;

import static part3.Status.*;

public class Story {
    public static void main(String[] args) {
        walkCompare();

        Trump trumpPerson = new TrumpPerson(new Form(Shape.Square, 10), "diamond");
//        trumpPerson.reverse();
        checkTrumpReverse(trumpPerson);
        trumpPerson.kneelDown();
        checkKneelDown(trumpPerson);

        TrumpPerson trumpPerson2 = new TrumpPerson(new Form(Shape.Square, 10), "diamond");
        trumpPerson2.printPattern();
    }

    private static void walkCompare() {
        Objects rabbit = new Rabbit(new Form(Shape.Rabbit, 10));
        printWalk(rabbit);
        printForm(rabbit);

        Objects trump = new Trump(new Form(Shape.Square, 10));
        printWalk(trump);
        printForm(trump);

        Objects trumpPerson = new TrumpPerson(new Form(Shape.Square, 10), "diamond");
        printWalk(trumpPerson);
        printForm(trumpPerson);
    }

    private static void printWalk(Objects objects) {
        System.out.print(objects.getClass().getSimpleName() + "은 ");
        objects.walk();
    }

    private static void printForm(Objects objects) {
        objects.printForm();
    }

    private static void checkTrumpReverse(Trump trump) {
        if (trump.isReverse(Reverse)) {
            System.out.println("뒤집어져있습니다.");
            return;
        }
        System.out.println("제대로 있습니다.");
    }

    private static void checkKneelDown(Trump trump) {
        if (trump.isKneelDown(KneelDown)) {
            System.out.println("엎드려있습니다.");
            return;
        }
        System.out.println("서서 있습니다.");
    }
}
