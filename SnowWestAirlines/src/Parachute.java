public class Parachute extends PurchaseExtra {
    Flight flight;

    public Parachute(Flight f){
        this.flight = f;
    }
    @Override
    public String getDescription() {
        return flight.getDescription() + ", Super Personal Parachute";
    }

    @Override
    public double cost() {
        return flight.cost() +25;
    }
}
