public class ProjectComercial extends Project implements Risky{
    private String deadLine;
    private static final int MAX_MEMBERS = 15;
    private int noTeams;
    private long fundMarketing;

    public ProjectComercial(String title, String objective, int managerAge , String managerName,long fund, String deadLine , int noTeams)
    {
        super(title,objective,managerAge,managerName, fund);
        this.deadLine = deadLine;
        this.noTeams = noTeams;
        this.fundMarketing = fund/2;
    }
    public ProjectComercial(String title, String objective, Programmer p,long fund, String deadLine , int noTeams)
    {
        super(title,objective,p,fund);
        this.deadLine = deadLine;
        this.noTeams = noTeams;
        this.fundMarketing = fund/2;
    }

    @Override
    public double getRisk() {
        if(getMemberCount() == 0)
        {return -1;}

        return (double)noTeams * 3 / getMemberCount() / fundMarketing;
    }

    public void addMember(Programmer p)
    {
        if(getMemberCount() < MAX_MEMBERS)
        {super.addMember(p);}
    }

    public String toString()
    {
        return super.toString() + " Type:Comercial";
    }
}
