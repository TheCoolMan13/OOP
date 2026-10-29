package types;

public class Intreg extends Tip{
    private int dateMemberu;
    public String getTip(){return "int";}
    public Intreg(int dateMemberu){
        this.dateMemberu = dateMemberu;
    }
    public String toString()
    {
        return ""+dateMemberu;
    }
}
