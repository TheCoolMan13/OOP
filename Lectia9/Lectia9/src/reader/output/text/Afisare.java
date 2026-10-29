package reader.output.text;

import implementation.Stiva;
import reader.output.ReaderOutput;

public class Afisare implements ReaderOutput {
    public void afisare(Stiva stack)
    {
        System.out.println(stack);
    }
}
