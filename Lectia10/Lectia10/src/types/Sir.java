package types;

public class Sir extends Tip{
    String dateMembru;

    @Override
    public String getTip() {
        return "int";
    }
    public Sir(String dateMembru)
    {
        this.dateMembru = dateMembru;
    }
    @Override
    public String toString() {
        return dateMembru;
    }
}
