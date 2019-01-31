public class Eyemask extends PurchaseExtra {
    Flight flight;

    public Eyemask(Flight f){
        this.flight = f;
    }
    public String getDescription() {
        return flight.getDescription() + ", Eye Mask";
    }

    @Override
    public double cost() {
        return flight.cost() + 1;
    }
}
