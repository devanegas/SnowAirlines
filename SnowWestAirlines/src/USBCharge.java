public class USBCharge extends PurchaseExtra {
    Flight flight;

    public USBCharge(Flight f){
        this.flight = f;
    }
    public String getDescription() {
        return flight.getDescription() + ", USB Charging";
    }

    @Override
    public double cost() {
        return flight.cost() + 1;
    }
}
