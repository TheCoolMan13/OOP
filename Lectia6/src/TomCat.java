public class TomCat extends Avion{
    public TomCat(String planeID , int totalEnginePower)
    {
        super(planeID , totalEnginePower);
    }
   
    public void launchMissle()
    {System.out.println(getPlaneID() + "- Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");}
   
    public void refuel()
    {System.out.println(getPlaneID() + "- Initiating refueling procedure - Locating refueller - Catching up -Refueling - Refueling complete");}
}