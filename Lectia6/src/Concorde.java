public class Concorde extends Avion{
    private int maxPassengers;
    
    public Concorde(String planeID ,int totalEnginePower, int maxPassengers)
    {
        super(planeID,totalEnginePower);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers()
    {return maxPassengers;}
    
    public void goSuperSonic()
    {System.out.println(getPlaneID() + "Supersonic mode activated");}
    
    public void goSubSonic()
    {System.out.println(getPlaneID() + "Supersonic mode deactivated");}
}