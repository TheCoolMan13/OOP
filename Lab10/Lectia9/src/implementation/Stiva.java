package implementation;

public class Stiva {
    private int dimensiune;
    private int currentDimensiune;

    private Object Stack[] = new Object[100];

    public Stiva(int dimensiune)
    throws ExceptieConstructorStiva{
        if(dimensiune < 0)
        {
            throw new ExceptieConstructorStiva("DimensiunePreaMica");
        }
        else this.dimensiune = dimensiune;
    }

    public void addToStack(Object o)
    throws ExceptieAdaugareStiva , ExceptieObiectIdenticStiva, ExceptieObiectGresit{
        if(o instanceof Patrat || o instanceof Cerc)
        {
            if(currentDimensiune == dimensiune)
            {
                throw new ExceptieAdaugareStiva("Nu mai e loc");
            }
            for(int i = 0 ; i < currentDimensiune ; i++)
            {
                if(Stack[i].equals(o))
                    throw new ExceptieObiectIdenticStiva("obiect identic" , o);
            }
            Stack[currentDimensiune++] = o;
        }
        else throw new ExceptieObiectGresit("Adaugi prostii");
    }

    public Object pop()
    throws ExceptieStivaGoala{
        if(currentDimensiune == 0)
        {throw new ExceptieStivaGoala("stiva goala");}

        Object aux = Stack[currentDimensiune-1];
        Stack[--currentDimensiune] = null;
        return aux;
    }

    public String toString()
    {
        String aux = "Stiva: ";
        for(int i = currentDimensiune-1 ; i >=0 ; i--)
        {
            aux += " " + Stack[i];
        }
        return aux;
    }

}
