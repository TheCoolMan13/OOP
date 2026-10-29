public class Animal {
    private int greutate;
    private String culoare;
    private int varsta;

    private static int nrAnimale;

    //CONSTRUCTORI toString equals heshCode

    public Animal(int greutate , String culoare , int varsta)
    {
        this.greutate = greutate;
        this.culoare = culoare;
        this.varsta = varsta;
        nrAnimale++;
    }

    public String toString()
    {
        return greutate +" " +culoare+" "+ varsta;
    }

    public boolean equals(Object o)
    {
        if(o instanceof Animal)
        {
            if(varsta == ((Animal)o).varsta) return true;
        }
        return false;
    }

    public int getNrAnimale(){
        return nrAnimale;
    }
    public void zbiara()
    {
        System.out.println("brrrrrr");
    }
}
