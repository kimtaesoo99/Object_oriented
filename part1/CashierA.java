package part1;

public class CashierA implements Cashier{

    private Barista barista;

    public CashierA(Barista barista) {
        this.barista = barista;
    }

    @Override
    public String callWithOrder(String order) {
        String result = barista.make(order);
        wait(1000);
        return result;
    }

    private void wait(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
