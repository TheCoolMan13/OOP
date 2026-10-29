public class Boeing extends Avion{
    private int maxPassengers;

    public Boeing(String planeID ,int totalEnginePower, int maxPassengers)
    {
        super(planeID,totalEnginePower);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers()
    {return maxPassengers;}
}