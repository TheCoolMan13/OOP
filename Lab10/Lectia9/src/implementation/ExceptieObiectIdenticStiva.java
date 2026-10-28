package implementation;

public class ExceptieObiectIdenticStiva extends Exception {
    private static Object err = null;
    public ExceptieObiectIdenticStiva(String message , Object o) {
        super(message);
        err = o;
    }
    public static Object getSameObj()
    {
        return err;
    }
}
