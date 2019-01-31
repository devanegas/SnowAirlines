public class DrinkCoupon extends PurchaseExtra {
    Flight flight;

    public DrinkCoupon(Flight flight){
        this.flight = flight;
    }
    public String getDescription() {
        return flight.getDescription() + ", Drinks";
    }

    @Override
    public double cost() {
        return flight.cost() + 4;
    }
}
