public class ExceptieGoalEchipa1 extends Exception{
    private static int instanceNo;
    public ExceptieGoalEchipa1(String message)
    {
        super(message);
        instanceNo++;
    }
    public static int getInstanceNo()
    {
        return instanceNo;
    }
}
