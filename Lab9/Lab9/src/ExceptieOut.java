public class ExceptieOut extends Exception {
    private static int instanceNo;

    public ExceptieOut(String message)
    {
        super(message);
        instanceNo++;
    }
    public static int getInstanceNo()
    {
        return instanceNo;
    }
}
