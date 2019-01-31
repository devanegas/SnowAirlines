public class ExcessLuggage extends PurchaseExtra {
    Flight flight;

    public ExcessLuggage(Flight flight){
        this.flight = flight;
    }
    public String getDescription() {
        return flight.getDescription() + ", Excess Luggage Fee";
    }

    @Override
    public double cost() {
        return flight.cost() + 75;
    }
}
