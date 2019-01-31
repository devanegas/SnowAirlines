public class Wifi extends PurchaseExtra {
    Flight flight;

    public Wifi(Flight f){
        this.flight = f;
    }
    @Override
    public String getDescription() {
        return flight.getDescription() + ", Wifi Service";
    }

    @Override
    public double cost() {
        return flight.cost() + 7;
    }
}
