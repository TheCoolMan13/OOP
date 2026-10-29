package types;

public class Iterator extends Tip{
    private int dateMembru;
    public Iterator(int dateMembru)
    {
        this.dateMembru = dateMembru;
    }

    public int getDateMembru() {
        return dateMembru;
    }
    public void increment()
    {
        dateMembru++;
    }
    public String getTip(){return "int";}
    public String toString(){return ""+dateMembru;}
}
