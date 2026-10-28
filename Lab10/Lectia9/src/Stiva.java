public class Stiva {
    private int dimensiune;


    public Stiva(int dimensiune)
    throws ExceptieConstructorStiva{
        if(dimensiune < 0)
        {
            throw new ExceptieConstructorStiva("Dimensiune prea mica");
        }
        else this.dimensiune = dimensiune;
    }


}
