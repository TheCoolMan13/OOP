public class ExceptieGoalEchipa2 extends Exception {
    private static int instanceNo;
    public ExceptieGoalEchipa2(String message)
    {
        super(message);
        instanceNo++;
    }
    public static int getInstanceNo()
    {
        return instanceNo;
    }
}
