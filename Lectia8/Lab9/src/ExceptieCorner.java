public class ExceptieCorner extends Exception{
    private static int instanceNo;

    public ExceptieCorner(String message)
    {
        super(message);
        instanceNo++;
    }
    public static int getInstanceNo()
    {
        return instanceNo;
    }

}
