public class Headphones extends PurchaseExtra {
    Flight flight;

    public Headphones(Flight f){
        this.flight = f;
    }
    public String getDescription() {
        return flight.getDescription() + ", Headphone Rental";
    }

    @Override
    public double cost() {
        return flight.cost() + 2;
    }
}
