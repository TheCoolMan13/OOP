public class ProjectOpenSource extends Project implements Risky{
    private String mailingList;
    public ProjectOpenSource(String title, String objective, int managerAge , String managerName,long fund, String mailingList)
    {
        super(title,objective,managerAge,managerName,fund);
        this.mailingList = mailingList;
    }
    public ProjectOpenSource(String title, String objective, Programmer p,long fund, String mailingList)
    {
        super(title,objective,p,fund);
        this.mailingList = mailingList;
    }

    @Override
    public double getRisk()
    {
        if(getMemberCount() == 0)
        {return -1;}

        return (double)getMemberCount()/getFund();
    }

    public void addMember(Programmer p)
    {super.addMember(p);}

    public String toString()
    {
        return super.toString() + " Type:OpenSource";
    }
}
