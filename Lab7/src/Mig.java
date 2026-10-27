public class Mig extends Avion{
    public Mig(String planeID , int totalEnginePower)
    {
        super(planeID , totalEnginePower);
    }

    public void launchMissle()
    {System.out.println(getPlaneID() + "- Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");} 
   
    public void highSpeedGeometry()
    {System.out.println(getPlaneID() + " - High speed geometry selected");}

    public void normalGeometry()
    {System.out.println(getPlaneID() + " - Normal speed geometry selected");}
}