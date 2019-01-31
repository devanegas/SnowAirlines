public class EphrToLAX extends Flight {
    @Override
    public double cost() {
        return 105;
    }

    @Override
    public String getDescription() {
        return "Flight from Ephraim, UT to Los Angeles, CA.\n\t>> Services: Free Water";
    }
}
