package part6.interest;

public class InterestFactory {

    public InterestRate createInterest(String name) {
        if (name.equalsIgnoreCase("simple")) {
            return new SimpleInterestRate();
        }
        if (name.equalsIgnoreCase("complex")) {
            return new ComplexInterestRate();
        }
        return null;
    }
}
