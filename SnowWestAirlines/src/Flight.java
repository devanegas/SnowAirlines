public abstract class Flight {
    String description = "Default flight not initialized";

    public String getDescription(){
        return description;
    }

    public abstract double cost();



}
