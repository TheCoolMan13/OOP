public abstract class Project {
    private Programmer manager = new Programmer();
    private Programmer members[] = new Programmer[100];
    private int memberCount;
    private String title;
    private String objective;
    private long fund;

    public Project(String title, String objective, int managerAge , String managerName , long fund)
    {
        this.title = title;
        this.objective = objective;
        manager.setAge(managerAge);
        manager.setName(managerName);
        this.fund = fund;
    }
    public Project(String title, String objective, Programmer p, long fund)
    {
        this.title = title;
        this.objective = objective;
        manager = p;
        this.fund = fund;
    }

    public String toString()
    { return "Name:"+title + " Objective "+ objective;}

    public void addMember(Programmer p)
    {
        if(memberCount < 10)
        {members[memberCount++] = p;}
    }
    public int getMemberCount()
    {return memberCount;}

    public double getFund()
    {return fund;}
}
