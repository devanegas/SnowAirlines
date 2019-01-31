public class LiveTV extends PurchaseExtra {
    Flight flight;

    public LiveTV(Flight f){
        this.flight = f;
    }
    public String getDescription() {
        return flight.getDescription() + ", Live TV";
    }

    @Override
    public double cost() {
        return flight.cost() + 3;
    }
}
