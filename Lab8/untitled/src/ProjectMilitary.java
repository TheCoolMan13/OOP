public class ProjectMilitary extends Project implements Risky{
    public String deadLine;
    private static final int MAX_MEMBERS = 15;
    private String PASSWORD;


    public ProjectMilitary(String title, String objective, int managerAge , String managerName,long fund, String deadLine, String PASSWORD)
    {
        super(title,objective,managerAge,managerName,fund);
        this.deadLine = deadLine;
        this.PASSWORD = PASSWORD;
    }
    public ProjectMilitary(String title, String objective, Programmer p,long fund, String deadLine, String PASSWORD)
    {
        super(title,objective,p,fund);
        this.deadLine = deadLine;
        this.PASSWORD = PASSWORD;
    }

    @Override
    public double getRisk() {
        if(getMemberCount() == 0)
        {return -1;}

        return (double) getMemberCount() / PASSWORD.length() / getFund();
    }

    public void addMember(Programmer p)
    {
        if(getMemberCount() < MAX_MEMBERS)
        {super.addMember(p);}
    }
    public String toString()
    {
        return super.toString() + " Type:Military";
    }
}
