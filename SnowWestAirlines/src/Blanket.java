public class Blanket extends PurchaseExtra {
    Flight flight;

    public Blanket(Flight f){
        this.flight = f;
    }
    public String getDescription() {
        return flight.getDescription() + ", Blanket";
    }

    @Override
    public double cost() {
        return flight.cost() + 5;
    }
}
